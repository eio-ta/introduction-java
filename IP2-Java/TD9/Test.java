public class Test {

    public static void main(String[] args){
        Personne grandpapa = new Personne ("Grandpapa", "Tang");
        Personne grandmaman = new Personne ("Grandmaman", "Tang");
        Personne papa = new Personne ("Papa", "Tang", grandpapa, grandmaman);
        Personne maman = new Personne ("Maman", "Tang");
        Personne elo = new Personne ("Elo", "Tang", papa, maman);
        Personne emy = new Personne ("Emy", "Tang", papa, maman);

        Personne ruddy = new Personne ("Ruddy", "Vati");
        Personne tata = new Personne ("Tata", "Tang", grandpapa, grandmaman);
        Personne anissa = new Personne ("Anissa", "Vati", ruddy, tata);
        
        System.out.println("----------EXERCICE 01----------");
        System.out.println(elo.estFrereOuSoeur(emy));
        System.out.println(elo.estFrereOuSoeur(anissa));
        System.out.println(elo.estCousinGermain(anissa));
        System.out.println();

        System.out.println("----------EXERCICE 02----------");
        System.out.println(elo.nbAscendantsVivants());
        System.out.println(elo.possedeCommeAscendant(emy));
        System.out.println(elo.possedeCommeAscendant(grandpapa));
        System.out.println();

        System.out.println("----------EXERCICE 03----------");
        System.out.println(elo.distanceDAscendance(grandpapa));
        elo.afficheAscendantUn(grandpapa);
        System.out.println(elo.nbDeGenerations());
        System.out.println();

    }

}