package models;
import java.util.*;
import java.util.Scanner;
import java.io.*;
/*import javax.validation.*;
import play.data.validation.Constraints.*;
*/

public class Pendu
{
    int maxNbErreur ;   // nombre d'erreurs autorisées
    int nbErreur;
    //  Constructeurs
    public Pendu( int maxNb )
    {
        maxNbErreur = maxNb ;
        nbErreur=0;
    }
    
    // Méthodes
    
    public boolean verifSaisie(char saisie){
        return Character.isLetter(saisie);

    }

    public void setnbErreur (int i){
        nbErreur =i;
    }

    public int getnbErreur(){
        return nbErreur;
    }
    public int getmaxNbErreur(){
        return maxNbErreur;
    }




    /*public void jouer()
    {
        Mot mot = new Mot("public/document/listmot.txt");     
        int nbErreur=0 ;         
        
        while ( nbErreur<maxNbErreur && mot.resteDesLettres() )     // On joue jusqu'à être pendu ou avoir trouvé le mot
        {
            mot.afficher();
            Scanner scan = new Scanner (System.in);
            System.out.println("Proposez une lettre > ");
            String saisie = scan.next();
            char lettre = saisie.charAt(0);
            if (verifSaisie(lettre)){
                
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
        
    }*/
}