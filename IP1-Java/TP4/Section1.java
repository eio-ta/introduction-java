class Section1 {

    /* ********************************************************** */
    /* EXERCICE 1 : ENTIERS NON SIGNES                            */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isBinaryEncoding ci-dessous
    public static boolean isBinaryEncoding(String s){
	if(s.length() != 8){
	    return false;
	}
	for(int i = 0; i < s.length(); i = i + 1){
	    if(s.charAt(i) != '0' && s.charAt(i) != '1'){
		return false;
	    }
	}
	return true;
    }
					   
    

    // QUESTION 2  
    // Déclarez la fonction powerTwo ci-dessous
    public static int powerTwo(int n){
	int a = 1;
	for(int i = 0; i < n; i = i + 1){
	    a = a * 2;
	}
	return a;
    }


    // QUESTION 3
    // Déclarez la fonction decode ci-dessous
    public static int decode (String s){
	int n = 0;
	if(isBinaryEncoding(s)){
	    for(int i = 0; i < s.length(); i = i + 1){
		if(s.charAt(i) == '1'){
		    n = n + powerTwo(7-i);
		}
	    }
	    return n;
	} else {
	    return -1;
	}
    }


    // QUESTION 4
    // Déclarez la *procédure* encodeAndPrint ci-dessous
    public static void encodeAndPrint (int n) {

	int a = 0;
	int a1 = n;
	if (n < 0 || n >= 256) {
	    System.out.println (" ");
	} else {
	    a = n % 2;
	    System.out.print (a);
	    for(int i = 0; i < 7; i = i + 1){
		a1 = a1 / 2;
		System.out.print (a1 % 2);
	    }
	}
	System.out.println ();
    }  


    // QUESTION 5
    // Déclarez la fonction encode ci-dessous
    public static void encode (int n) {
	int a = 0;
	int a1 = n;
	if (n < 0 || n >= 256) {
	    System.out.println (" ");
	} else {
	    for(int i = 7; i > 0; i = i - 1){
		System.out.print (a1 / powerTwo(i));
		a1 = a1 % powerTwo(i);
	    }
	    a = n % 2;
	    System.out.print (a);
	}
	System.out.println ();
    }  

    
    // QUESTION 6
    // Ecrivez le test dans la fonction main
    



    /* ********************************************************** */
    /* EXERCICE 2 : COMPLEMENT A UN                               */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction oneComplement ci-dessous
    

    // QUESTION 2  
    // Déclarez les fonctions encodeOneC et decodeOneC ci-dessous



    /* ********************************************************** */
    /* EXERCICE 3 : ENTIERS SIGNES                                */
    /* ********************************************************** */


    // QUESTION 1 
    // Déclarez la fonction isNegative ci-dessous
    

    // QUESTION 2  
    // Déclarez la fonction decodeNeg ci-dessous


    // QUESTION 3
    // Déclarez la fonction encodeNeg ci-dessous    


    // QUESTION 4
    // Déclarez la procédure testFinal ci-dessous    



    /* ********************************************************** */
    /* FONCTION PRINCIPALE                                        */
    /* ********************************************************** */
    

    public static void main (String []args) {
    // Ecrivez vos tests dans le corps de cette fonction
	//System.out.println(isBinaryEncoding("01010101"));
	//System.out.println(isBinaryEncoding("101010101"));
	//System.out.println(isBinaryEncoding("01210101"));

	//System.out.println(powerTwo(8));

	//System.out.println(decode("00000101"));
	//System.out.println(decode("10001000"));

	//encodeAndPrint(254);
	//encodeAndPrint(136);
        
	//encode(253);
	//encode (15);

	oneComplement("010");
	
    }
    


    /* ********************************************************** */
    /* FONCTIONS AUXILIAIRES                                      */
    /* ********************************************************** */
     

    // caractère à une position donnée
    public static String charAtPos(String s, int i) {
	return String.valueOf(s.charAt(i));
    }

    // test d'égalité entre chaînes de caractères
    public static boolean stringEquals(String s, String t) {
	return s.equals(t);
    }
    

}
