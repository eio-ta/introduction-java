public class Panier{
    Fruit[] tab;

    Panier(Fruit[] f){
        tab = f;
    }

    Panier(){
        tab = new Fruit [0];
    }

    Panier(Fruit f, Panier p){
        Fruit newtab[] = new Fruit[p.tab.length+1];
        for(int i=0; i<p.tab.length; i++){
            newtab[i] = new Fruit (p.tab[i].nom, p.tab[i].poids);
        }
        newtab[newtab.length-1] = f;
        tab = newtab;
    }

    public static void afficher(Panier p){
        System.out.println("Contenu du panier :");
        for(int i=0; i<p.tab.length; i++){
            Fruit.afficher(p.tab[i]);
        }
        System.out.println();
    }

    public static Panier hybridePanier(Fruit f, Panier p) {
        Panier newP = new Panier();
        for (int i=0; i<p.tab.length; i++){
            Fruit newF = Fruit.hybridation(f,p.tab[i]);
            new Panier(newF, newP);
        }
        return newP;
    }
    
}