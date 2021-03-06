package models;
import java.io.IOException;
import java.util.*;
/*import javax.validation.*;
import play.data.validation.Constraints.*;
*/


public class Mot {
	
	private String devine;
	private boolean[] visible;
	private int nbTiretRestant;
  private String lettreDejaJoue;
	
	//  Constructeur

    // ************************************************************
    //  Choisit un mot à deviner dans le dictionnaire
    //  Initialise les autres attributs (visible et nbTiretRestant)
    // ************************************************************
	public Mot(String chemin)
	{
      Dictionnaire d = new Dictionnaire() ;            // On crée un objet Dictionnaire
      try {
      	devine = d.choisirMot(chemin) ;
      } catch (IOException e) {
		// TODO Auto-generated catch block
      	e.printStackTrace();
      }                         // On choisit un mot dedans
      visible = new boolean[devine.length()] ;
      for(int i=0 ; i<visible.length ; i++)
      	visible[i]=false ;
      nbTiretRestant = devine.length();
      lettreDejaJoue="";
    }

    public String getDevine() {
      return devine;
    }


    public void setDevine(String devine) {
      this.devine = devine;
    }


    
    public String getlettreDejaJoue() {
      return lettreDejaJoue;
    }

    public void setlettreDejaJoue(char l) {
      this.lettreDejaJoue = this.lettreDejaJoue + l;
    }


    public boolean[] getVisible() {
      return visible;
    }

    public boolean getVisible(int i){
      return visible[i];
    }



    public void setVisible(boolean[] visible) {
      this.visible = visible;
    }



    public int getNbTiretRestant() {
      return nbTiretRestant;
    }



    public void setNbTiretRestant(int nbTiretRestant) {
      this.nbTiretRestant = nbTiretRestant;
    }

    public void afficher() {
      for(int i=0; i<devine.length();i++) {           
       if (visible[i])                                
         System.out.print(devine.charAt(i)+" ");
       else
         System.out.print("_ ");
     }
     System.out.println();      
   }

   public boolean resteDesLettres()
   { return nbTiretRestant>0 ; }

   public boolean contientLettre(char lettre)
   {
    return ( devine.indexOf(lettre, 0 ) >= 0 );
   }

   public void rendreVisible(char lettre)
    {
        for( int i=0 ; i<visible.length ; i++ )
            if ( devine.charAt(i) == lettre && visible[i] == false ) {
                visible[i] = true ;
                nbTiretRestant -- ;
            }
     
    }

}
