import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.*;

import org.junit.Test;
import static org.junit.Assert.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

//import models.Dictionnaire;
//import models.Mot;

import java.lang.Runtime;

/**
*
* Simple (JUnit) tests that can call all parts of a play app.
* If you are interested in mocking a whole application, see the wiki for more details.
*
*/
public class ApplicationTest {

    /*void assert_Dictionnaire_choisirMot() throws IOException {
        assertFalse(new Dictionnaire().choisirMot("public/document/listmot.txt").isEmpty());
    }*/

    /*void assert_Dictionnaire_choisirMotV2() throws IOException {
        //Initialisation des variables

        Dictionnaire d = new Dictionnaire() ;            // On crée un objet Dictionnaire
        String motChoisi;
        motChoisi = d.choisirMot("public/document/listmot.txt") ;
        boolean verif = false;
        BufferedReader lecteurAvecBuffer=null;
        ArrayList<String> maListe = new ArrayList<String>();
        String ligne;
       
        //Lecture Fichier si OK
        try
        {
            lecteurAvecBuffer = new BufferedReader(new FileReader("public/document/listmot.txt"));
            //On enrichit la liste de tous les mots du fichiers  
            while ((ligne = lecteurAvecBuffer.readLine())!=null){
                maListe.add(ligne);
                
            }

            //On ferme le fichier ouvert en lecture
            lecteurAvecBuffer.close();

            for (String s : maListe) {
                if (motChoisi.compareTo(s) == 0 )
                    verif = true;
            }


        }
        //Sinon affiche erreur
        catch(FileNotFoundException exc)
        {
            System.out.println("Erreur d'ouverture de fichier...");
        }


        assertTrue(verif);
    }*/

    
    /*void assert_Constructeur_Mot(){
        Mot m= new Mot("public/document/listmot.txt");
        assertFalse(m.getDevine().isEmpty());
    }*/

    /*void assert_TiretRestant_Mot(){
        Mot m= new Mot("public/document/listmot.txt");
        assertTrue(m.resteDesLettres());
    }*/

    /*void assert_ContientLettre_Mot(char lettre){
        Mot m= new Mot("public/document/listmot.txt");
        String test=m.getDevine();
        System.out.println("Mot à deviner: "+test);
        System.out.println("Lettre à tester: "+lettre);
        
        assertTrue(m.contientLettre(lettre));
    }*/

    void assert_RendreVisibleLettre_Mot(char lettre){
        Mot m= new Mot("public/document/listmot.txt");
        /*m.setDevine(mot);
        m.setNbTiretRestant(mot.length());
        for (int j=0; j<mot.length() ; j++ ) {
            m.setVisible(false); 
        }*/
        int cpt=0;
        String test= m.getDevine(); 
        for (int i=0; i<test.length(); i++ ) {
            if(test.charAt(i)== lettre)
                cpt++;
        }
        int res;
        res = test.length() - cpt;
        m.rendreVisible(lettre);
        System.out.println("Mot: "+test+" | Lettre: "+lettre);
        
        System.out.println("res: "+res+" | cpt: "+cpt+ " | tiret: "+m.getNbTiretRestant());
        assertTrue(m.getNbTiretRestant() == res);
    }




    /**
    Test Si la foction choisirMot retourne quelque chose de pas vide (Si elle n'est pas vide, c'est qu'elle a selectionné un mot du fichier listMot.txt)
    **/
    /*@Test
    public void choisirMot() {
        try{
            assert_Dictionnaire_choisirMot();
        }
        catch(IOException exc)
        {
            System.out.println("Erreur...");
        }
    }
    */

    /**
     Test renforcé sur la fonction choisir mot, nous testons cette fois, si la fonction choisir mot retourne bien un mot contenu dans le fichier listmot.txt
    **/
    /*@Test
    public void choisirMotV2() {
        try{
            assert_Dictionnaire_choisirMotV2();
        }
        catch(IOException exc)
        {
            System.out.println("Erreur...");
        }
    }*/

    
    /**
    Test le constructeur de Mot => celui ci doit initialiser Mot.devine avec une ligne du fichier listmot.txt
    **/
    /*@Test
    public void constMot() {
        assert_Constructeur_Mot();
    }*/

    /**
    Test si le mot est trouvé ou pas
    **/
    /*@Test
    public void TiretRestant() {
        assert_TiretRestant_Mot();
    }*/
    
    /*@Test
    public void contientLettre() {
        assert_ContientLettre_Mot('a');
    }*/
    
    @Test
    public void RendreVisibleLettre() {
        assert_RendreVisibleLettre_Mot('a');
    }

}
