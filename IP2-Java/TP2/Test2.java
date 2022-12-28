public class Test2{

    public static void main(String[] args){
        Etudiant e1 = new Etudiant ("Luke", "Skywalker", 8.25);
	Etudiant e2 = new Etudiant ("Leia", "Organa", 11.75);
	Etudiant e3 = new Etudiant ("Elody", "Tang", 10);
        Trio t1 = new Trio(e1,e2,e3);
	t1.premier().afficher();
        int c = t1.classement("Elody", "Tang");
	System.out.println("classement : " + c);
	

    }
}
