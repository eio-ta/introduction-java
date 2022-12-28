public class Enclos{
    Animal[] tab;
    int pop = 0; //population actuelle

    Enclos(int capacité){
        tab = new Animal[n];
    }

    public static boolean ajoutAnimal(Enclos e; Animal a){
        if(e.pop == e.tab.length){
            return false;
        }
        int x = e;
        while(e.tab[x] != null){
            x++;
        }
        e.tab[x] = a;
        pop++;
    }
}