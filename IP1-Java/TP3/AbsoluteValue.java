import java.math.*;

public class AbsoluteValue {

public static int myAbs (int x) {
    if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int newAbs (int x) {
        if (x < 10) {
            return (int)(Math.sqrt(x*x));
        } else if (x >=10 && x < 100) {
            return (int)(Math.sqrt(x*x));
        } else if (x == 100) {
            return -100;
        } else {
            return (int)(Math.pow(Math.sqrt(Math.sqrt(x*x)),2));
        }
    }

   

    public static void main(String []args){
	for (int i = -200; i <= 199; i = i + 1) {
	    if (Math.abs(i)==newAbs(i)) {
		System.out.println ("Entrée :" + Integer.toString (i) ) ;
		System.out.println ( "Sortie myAbs :" + Integer.toString (myAbs (i)) + " " + "ok") ;
	    }
	    else {
		System.out.println ("Entrée :" + Integer.toString (i) ) ;
		System.out.println ( "Sortie myAbs :" + Integer.toString (myAbs (i)) + " " + "ko") ;
	    }		
	}
    }
}
