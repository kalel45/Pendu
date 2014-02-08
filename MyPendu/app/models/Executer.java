public class Executer
{
    public static void main(String[] args)
    {
        Pendu pendu = new Pendu(5) ;    // pendu autorisant 5 erreurs
        System.out.println("A vous de jouer...") ;
        pendu.jouer() ;                
    }
}