import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Random;

class Dictionnaire 
{
  public String choisirMot() throws IOException
  {
    //Initialisation des variables
    BufferedReader lecteurAvecBuffer=null;
    ArrayList<String> maListe = new ArrayList<String>();
    String ligne;
    
    //Lecture Fichier si OK
    try
    {
  	 lecteurAvecBuffer = new BufferedReader(new FileReader("../../public/document/listmot.txt"));
     
    }
    //Sinon affiche erreur
    catch(FileNotFoundException exc)
    {
  	 System.out.println("Erreur d'ouverture");
    }
    
    //On enrichit la liste de tous les mots du fichiers  
    while ((ligne = lecteurAvecBuffer.readLine())!=null){
      maListe.add(ligne);
      //System.out.println(ligne);
    }
    
    //On ferme le fichier ouvert en lecture
    lecteurAvecBuffer.close();


    //Random d'un nombre entre  0 et maListe.size() 
    int min =0; 
    int max= maListe.size();
    Random r = new Random();
    int valeur = min + r.nextInt(max - min);

    
    //on recupere un mot
    String maValeur = maListe.get(valeur);
    //System.out.println(maValeur);
    


    return maValeur;
  }

  

}; 
