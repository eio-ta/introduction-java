public class Test {
    public static void main(String[] args) {
        Noeud a = new Noeud(6, null, new Noeud(8));
        Noeud b = new Noeud(9, new Noeud(2), a);
        Noeud c = new Noeud(5, b, null);
        Noeud d = new Noeud(1, new Noeud(4), null);
        Noeud e = new Noeud(7, new Noeud(0), d);
        Noeud f = new Noeud(3, c, e);
        f.afficheInfixe();
        System.out.println();
        System.out.println(f.nbDeNoeuds());
        System.out.println(f.somme());
        System.out.println(f.recherche(2));
        System.out.println();
        int [] tab = {0 ,1 ,2 ,3 ,4 ,5};
        Noeud g = new Noeud(tab);
        g.afficheInfixe();
        System.out.println();
        g.affichePrefixe();

    }
}