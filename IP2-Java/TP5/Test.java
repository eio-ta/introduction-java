public class Test{

    public static void main(String[] args){
        System.out.println();
        System.out.println("EXERCICE 01 ----------------------------------------");
        Entreprise ent = new Entreprise("Nutella");
        Employe emp1 = new Employe("cas 1", 56411);
        Employe emp2 = new Employe("cas 2", 564);
        Employe emp3 = new Employe("cas 3", 10);
        Employe emp4 = new Employe("cas 4", 520);
        Employe emp5 = new Employe("cas 5", 300);
        ent.ajout(emp1);
        ent.ajout(emp2);
        ent.ajout(emp3);
        ent.ajout(emp4);
        ent.ajout(emp5);
        ent.affiche();
        System.out.println(ent.appartient("cas 3"));
        System.out.println(ent.appartient("Hello"));
        ent.demission("cas 1");
        ent.affiche();
        ent.ajout(emp1);
        System.out.println();
        ent.affiche();
        System.out.println();

        System.out.println("EXERCICE 02 ----------------------------------------");
        System.out.println(ent.augmente("cas 1", 2));
        emp1.affiche();
        System.out.println();
        Entreprise ent2 = ent.choixSalaire(0, 500);
        ent2.affiche();
        System.out.println();

        System.out.println("EXERCICE 03 ----------------------------------------");
        Entreprise ent3 = new Entreprise("Chocolat");
        Employe emp6 = new Employe("cas 6", 581);
        Employe emp7 = new Employe("cas 7", 564);
        Employe emp8 = new Employe("cas 8", 1025);
        ent3.ajout(emp8);
        ent3.ajout(emp7);
        ent3.ajout(emp6);
        System.out.println(ent2.croissante());
        ent3.ajout(emp1);
        ent3.affiche();
        System.out.println();
        ent2.acquisition_Version_1(ent3);
        ent2.affiche();
        System.out.println();
        System.out.println(ent2.augmente_Version_2("cas 5", 700));
        ent2.affiche();







    }
}