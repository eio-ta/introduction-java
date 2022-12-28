public class Test{

    public static void main(String[] args){

        System.out.println("---------------EXERCICE 02---------------");
        Robot a = new Robot('a', "Parole 1, Parole 2, Parole 3, Parole 4, Parole 5");
        Robot b = new Robot('b', "Parole 1, Parole 2, Parole 3, Parole 4, Parole 5");
        Robot c = new Robot('c', "Parole 1, Parole 2, Parole 3, Parole 4, Parole 5");
        TableRonde tableR_1 = new TableRonde(a);
        tableR_1.ajouteRob(b);
        tableR_1.ajouteRob(c);
        tableR_1.affiche();
        System.out.println();
        tableR_1.supprimer('h');
        tableR_1.affiche();
        System.out.println();
        System.out.println();
        System.out.println();
	    tableR_1.parlerNFois(5,10);
    }
    
}
