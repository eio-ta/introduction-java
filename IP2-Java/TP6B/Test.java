public class Test {

	public static void brainf_ck(String programme){
		Memoire m = new Memoire(5);
		for(int i=0; i<programme.length(); i++){
			m.inspecte(5);
			switch(programme.substring(i, i+1)){
				case ">" : m = m.getSuivante(); break;
				case "<" : m = m.getPrecedente(); break;
				case "+" : m.incremente(); break;
				case "-" : m.decremente(); break;
				case "." : System.out.println(m.getValeur()); break;
				case "," : System.out.println("Entrez une valeur."); m.setValeur(Integer.parseInt(System.console().readLine())); break;
				case "[" : if(m.getValeur() == 0) i=ouvrantCorrespondant(programme, i); break;
				case "]" : i=fermantCorrespondant(programme, i); break;
			}
		}
	}

	public static int fermantCorrespondant(String programme, int depart){
		int i = depart-1;
		int compt = 0;
		while(!programme.substring(i,i+1).equals("[") || compt != 0){
			if(programme.substring(i,i+1).equals("[")){
				compt--;
			}
			if(programme.substring(i,i+1).equals("]")){
				compt++;
			}
			i--;
		}
		return i-1;
	}

	public static int ouvrantCorrespondant(String programme, int depart){
		int i = depart+1;
		int compt = 0;
		while(!programme.substring(i,i+1).equals("]") || compt != 0){
			if(programme.substring(i,i+1).equals("[")){
				compt--;
			}
			if(programme.substring(i,i+1).equals("]")){
				compt++;
			}
			i++;
		}
		return i;
	}

	public static void main(String[] args) {
		int taille = 5;
		Memoire m = new Memoire(taille);
		m.inspecte(taille);
		
		m = m.getSuivante().getSuivante().getSuivante();
		m.setValeur(42);
		m.inspecte(taille);
		m = m.getPrecedente();
		m.setValeur(11);
		m.inspecte(taille);

		String a = ",>,[-<->]<.";
		String b = ",>,[-<+>]<.";
		//brainf_ck(a);
		System.out.println();
		//brainf_ck(b);
		String c = ">>,>,<[>[<<+<+>>>-]<<[>>+<<-]>-]>[-]<<[-]<";
		brainf_ck(c);


		
		

	}

}
