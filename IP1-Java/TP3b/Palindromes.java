public class Palindromes {


    public static String characterAtPos (String s, int i) {
	String res = "";
	if (i >= 0 && i < s.length ()) {
	    res = String.valueOf(s.charAt (i));
	}
	return res;
    }

    
    public static String reverse (String s) {
	String r = "";
	for (int i = s.length()-1; i >= 0; i=i-1) {
	    r = r + characterAtPos(s,i);
	}
	return r;
    }

    public static boolean palindrome (String s) {
	return s.equals(reverse(s));
    }
	
	    
	   

    public static void main(String[] args) {
	System.out.println (reverse ("hello"));
	System.out.println (palindrome ( "rotor"));
	System.out.println (palindrome ("hello"));
			      
    }
}
