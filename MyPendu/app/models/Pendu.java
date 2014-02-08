import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;


public class Pendu
{
    int maxNbErreur ;   // nombre d'erreurs autorisées
    
    //  Constructeurs
    public Pendu( int maxNb )
    {
        maxNbErreur = maxNb ;
    }
    
    // Méthodes
    
    public boolean verifSaisie(char saisie){
        return Character.isLetter(saisie);

    }


    public void jouer()
    {
        Mot mot = new Mot();     
        int nbErreur=0 ;         
        
        while ( nbErreur<maxNbErreur && mot.resteDesLettres() )     // On joue jusqu'à être pendu ou avoir trouvé le mot
        {
            mot.afficher();
            char lettre = Stdin.readChar("Proposez une lettre > ") ;
            if (p.verifSaisie(lettre)){
                
                if ( mot.contientLettre(lettre) ) 
                    mot.rendreVisible(lettre);  
                else {
                    nbErreur++ ;
                    System.out.println("La lettre "+lettre+" n'est pas dans le mot");
                }
            }
            else{
                System.out.println("Vous devez saisir uniquement un caractere alphabetique !!!");    
            }    
        }
       
        if ( mot.resteDesLettres() == false )
            System.out.println("Bravo!");
        else
            System.out.println("Vous etes pendu!");
        
    }
}