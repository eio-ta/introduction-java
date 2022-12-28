public class Test{

    public static void main(String[] args){

        System.out.println("EXERCICE 01");
        Utilisateur a = new Utilisateur("Max", "lovecastors", "maxlesupercastor@gmail.com");
        System.out.println(a.testMotDePasse("1513"));
        a.changerMotDePasse("lovecastors", "leplusboc'estmoi");
        System.out.println(a.testMotDePasse("lovecastors"));
        System.out.println(a.testMotDePasse("leplusboc'estmoi"));
        System.out.println(a.getPseudonyme());
        a.setPseudonyme("Max77");
        System.out.println(a.getPseudonyme());
        System.out.println();

        System.out.println("EXERCICE 02 :");
        Message premier = new Message(a, "Bonjour tout le monde ! Je suis le boss ! ");
        System.out.println(premier.afficherMessage());
        System.out.println();

        System.out.println("EXERCICE 03 :");
        //Utilisateur a = new Utilisateur("Max", "lovecastors", "maxlesupercastor@gmail.com");
        Utilisateur b = new Utilisateur("Brad Pitt", "jesuisunetortue", "leplusbo@gmail.com");
        Utilisateur c = new Utilisateur("Telo", "unhérissontrèscontent", "lehibou@gmail.com");
        Utilisateur[] salon1_uti = {a, b, c};

        Message aa = new Message(a, "Bonjour tout le monde ! Je suis le boss ! ");
        Message bb = new Message(b, "Tu racontes n'importe quoi ! Je suis acteur, moi ! Je suis plus beau que toi ! ");
        Message cc = new Message(c, "Vous savez à quelle heure on va manger ? ");
        Message[] salon1_mes = {aa, bb, cc};

        Salon salon1 = new Salon(salon1_uti, salon1_mes);
        Utilisateur d = new Utilisateur("Elliot", "unpulltoutdoux", "ouuuh@gmail.com");
        salon1.ajouteUtilisateur(d);
        System.out.println(salon1.estPresent(d));
        Message dd = new Message(d, "Bonjour, on mange dans 10 minutes.");
        salon1.ajouteMessage(dd);
        Message ee = new Message(d, "Dépéchez-vous de ranger vos affaires !!");
        salon1.ajouteMessage(ee);
        salon1.afficher();
        System.out.println();
        Message ff = new Message(b, "On arrive !");
        salon1.ajouteMessage(ff);
        //salon1.exclusUtilisateur(d);

        System.out.println();
        System.out.println("EXERCICE 04 :");
        Salon salon2 = new Salon(salon1_uti, salon1_mes);
        Chat lolo = new Chat();
        lolo.ajouteSalon(salon1);
        lolo.ajouteSalon(salon2);
        System.out.println(lolo.estPresent(d));
        System.out.println(lolo.compteMessageUnSalon(d, lolo.salons[0]));
        Utilisateur e = lolo.bavard();
        System.out.println(e.getPseudonyme());





        


        



    }
}