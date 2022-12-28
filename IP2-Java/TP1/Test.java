public class Test{

    public static void main(String[] args){
        Fruit f = new Fruit("pamplemousse", 330);
        Fruit g = new Fruit("orange", 330);
        Fruit i = new Fruit("pomme", 200);
        Fruit h = f;

        Fruit q7 = Fruit.hybridation(f,i);
        Fruit.afficher(g);
        Fruit.afficher(q7);
        System.out.println();

        Fruit[] fs = {f,g,i};
        Panier p = new Panier(fs);
        Panier.afficher(p);
        System.out.println();
        Panier papa = new Panier(i, p);
        Panier.afficher(papa);
    
        System.out.println("Test Termine");

    }
}