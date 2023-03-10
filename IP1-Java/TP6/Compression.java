import java.io.*;
public class Compression{
    /* ************************************************************************** */
  
    //  Construction du lexique

    //  QUESTION 1 
    public static boolean isIn (String s, String[] lex) {

        for (int i = 0; i < lex.length; i=i+1) {
            if(s.equals(lex[i])){
               return true;
            }
        }
        return false;
    }
    

    // QUESTION 2
    public static String[] extendLexicon (String s, String[] lex) {
        String[] tab = new String[lex.length+1];

        for (int i=0; i<lex.length; i++) {
            tab[i] = lex[i];
        }
        tab[tab.length-1] = s;
        return tab;
	
    }
	
    // QUESTION 3
    public static String[] buildLexicon(String[] tab) {

        String[] lex = new String[0];
        
        for (int i=0; i<tab.length; i++) {
            if (isIn(tab[i], lex) == false) {
                lex = extendLexicon (tab[i],lex);
            }
        }
        return lex;
    }

    // Codage et decodage
  
    // QUESTION 1 
    public static int getCode(String s, String[] lex) {

        int number;

        for (int i=0; i<lex.length; i++) {
            if (s.equals(lex[i])) {
                number = i;
                return number;
            }
        }
        return -1;
    }

    // QUESTION 2
    public static int[] code (String[] tab, String[] lex) {

        int[] code = new int [tab.length];

        for (int i=0; i<tab.length; i++) {
            code[i] = getCode(tab[i], lex);
        }
        return code;
    }

    // QUESTION 3
    public static String[] decode (int[] code, String[] lex) {

        String[] decode = new String [code.length];
        String st = "";
        int number;

        for (int i=0; i<code.length; i++) {
            number = code[i];
            st = lex[number];
            decode [i] = st;
        }
        return decode;
    }

      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/

    // test d'??galit?? entre cha??nes de caract??res
    public static boolean stringEquals(String s, String t) {
    	return s.equals(t);
    }
	

    public static void printStringArray (String[] a){
    	for (int i = 0; i<a.length ; i++){
    	    System.out.print(a[i]+" " );
    	}
    	System.out.println();
    }

    public static boolean  stringArrayEquals (String[] a, String[] b){
    	if (a.length!=b.length) {
    	    return false;
		}
    	for (int i=0; i<a.length; i++){
    	    if (!a[i].equals(b[i])){
    		return false;
    	    }
    	}
    	return true;
    }

    public static void printIntArray (int[] a){
    	for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
    	}
	    System.out.println();
    }


static String textName = "text.txt";
static int textSize = 1002;
static String[] text = new String[textSize];
    //static boolean textLoaded = false;

public static void loadError () {
    System.out.println("Erreur de chargement du texte");
    System.exit(1);
}
  
public static void loadText () {
    try {
        BufferedReader br = new BufferedReader(new FileReader(textName));
      	for(int j=0;j<textSize; j++){
	String t ="";
	for (int i = br.read(); (char)(i)!=' '&& (char)(i)!='\n'; i=br.read()) {
	    t+=(char)(i);
	}
        text[j]=t;
       
	if (text[j] == null) { return; }
    }
    }
    //textLoaded = true
    catch (Exception e) { loadError (); }
}

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */
 
    public static void main(String[] args){
	loadText (); 
	//printStringArray (text);

    //System.out.println (isIn("attendit", text));
    //printStringArray(extendLexicon ("Nahahahaha", text));

    //System.out.println(text.length + " " + (buildLexicon(text)).length);

    //System.out.println (getCode("attendit", text));
	
    String[] lexicon = buildLexicon(text);
    System.out.println(lexicon.length);
    //printStringArray(decode(code(text,buildLexicon(text)), text));
    int[] code = code(text, lexicon);
    //printIntArray(code);
    String[] a = text;
    String[] b = decode(code, lexicon);
    System.out.print ("Derni??re v??rification : ");
    System.out.println (stringArrayEquals(a,b));

    }
}
