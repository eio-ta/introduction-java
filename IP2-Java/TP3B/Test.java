public class Test{

    public static void main(String[] args){
	Agent a1 = new Agent("Tara");
	Tache courses = new Tache("faire les courses",a1);
	Tache mains = new Tache("se laver les mains",a1);
	Tache cuisine = new Tache("faire la cuisine",a1);
	Tache manger = new Tache("manger",a1);
	courses.declareNecessairePour(cuisine);
	mains.declareNecessairePour(cuisine);
	cuisine.declareNecessairePour(manger);
	courses.afficher();
	mains.afficher();
	cuisine.afficher();
	manger.afficher();
	System.out.println(courses.estExecutable());
    }

}
