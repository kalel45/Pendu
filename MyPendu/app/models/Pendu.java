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
        
    }
}