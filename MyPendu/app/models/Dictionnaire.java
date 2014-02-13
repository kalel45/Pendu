package models;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Random;
             
public class Dictionnaire 
{


  public Dictionnaire(){}

  public String choisirMot(String chemin) throws IOException
  {
    //Initialisation des variables
    BufferedReader lecteurAvecBuffer=null;
    ArrayList<String> maListe = new ArrayList<String>();
    String ligne;
    String maValeur = "";
    //Lecture Fichier si OK
    try
    {
      lecteurAvecBuffer = new BufferedReader(new FileReader(chemin));
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
      maValeur= maListe.get(valeur);
      //System.out.println(maValeur);
    
    }
    //Sinon affiche erreur
    catch(FileNotFoundException exc)
    {
     System.out.println("Erreur d'ouverture de fichier...");
    }
    
    return maValeur;
  }

  /*public static void main(String[] args){
    Dictionnaire d = new Dictionnaire();
    String test;
    try{
      test=d.choisirMot("../../public/document/listmot.txt");
      System.out.println(test);
    }catch(IOException e){
      System.out.println("erreur");
    }

  }*/
  

}; 
