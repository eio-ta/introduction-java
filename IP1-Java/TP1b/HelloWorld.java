/*

   Ce programme affiche un message de politesse.

*/

/*

   Voici le nom du programme. On doit toujours définir
   une classe X dans un fichier nommé X.java

*/
public class HelloWorld {
    // Le point d'entrée du programme.
    public static void main (String[] args) {	
    System . out . println ( " Quel est ton prénom ? " ) ;
    String prénom = System . console () . readLine () ;
    System . out . println ( " Quel est ton nom ? " ) ;
    String nom = System . console () . readLine () ;
	System.out.println ("Bonjour" + " " + prénom + " " + nom +"!");
    }
}
