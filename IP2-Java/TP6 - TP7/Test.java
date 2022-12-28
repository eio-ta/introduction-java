public class Test {

	public static void main(String[] args) {
		//Teste l'exercice 1 et le début de l'exercice 2
		Automate a = new Automate();
		a.initialisation();
		a.nEtapes(4);
		System.out.println();
		System.out.println();

		//Teste la fin de l'exercice 2 (de la question 8 à la fin)
		Automate b = new Automate("#-##-----###-");
		b.nEtapes(3);
		System.out.println();
		System.out.println();
		Automate c = new Automate("----#----");
		c.nEtapes(12);
		System.out.println();

		//Teste la dernière question de l'exercice 2
		System.out.println();
		Automate d = new Automate("-###-#-#-#-#");
		d.nEtapesM(4);
		System.out.println();


	}

}
