public class FizzBuzz {

    /* Écrivez vos fonctions ici */
    public static void fizzbuzz (int n) {
	
	for (int i = 1; i <= n; i = i + 1) {

	    if ( i % 5 == 0 && i % 3 == 0) {
		System.out.println ("Fizz Buzz");
	    }
	    
	    else if (i % 3 == 0) {
		System.out.println ("Fizz");
	    }
	    else if ( i % 5 == 0) {
		System.out.println ("Buzz");  
	    }
	    else {
		System.out.println (i);
	    }
	}
    }	   

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
	fizzbuzz (17);

    }
}
