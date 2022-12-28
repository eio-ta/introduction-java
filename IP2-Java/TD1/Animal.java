public class Animal{
    String nom;
    char sexe; //'m' pour male et 'f' pour femelle
    int age; //compté en jour
    int poids; //compté en kg
    String espece;
    int faim; //compris entre 0 et 10

    Animal (String n, char s, int a, int p, String esp, int f){
        nom = n;
        sexe = s;
        age = a;
        poids = p;
        espece = esp;
        if(f>=0 && f<=10){
            faim = f;
        }
        if(f>10){
            faim = 10;
        }
        if(f<0){
            faim = 0;
        }
    }

    public static String description(Animal a){
        String s = "Je m'appelle " + a.nom + ", je suis ";
        s = s + (a.sexe == 'f' ? "une " : "un ");
        s = s + a.espece + " ";
        s = s + (a.sexe == 'f' ? "femelle, j'ai " : "male, j'ai ");
        s = s + a.age + " jours et je pèse " + a.poids + " kg.";
        return s;
    }

    public static String descriptionBis(Animal a){
        String s = "Je m'appelle " + a.nom + ", je suis ";
        s = s + (a.sexe == 'f' ? "une " : "un ");
        s = s + a.espece + " ";
        s = s + (a.sexe == 'f' ? "femelle, j'ai " : "male, j'ai ");
        int year = a.age / 365;
        int day = a.age - (365*year);
        s = s + year + " ans et " + day + " jours et je pèse " + a.poids + " kg.";
        return s;
    }

    public static void nourrir(Animal a){
        if(a.faim == 0){
            int newP = a.poids*(11/10);
            a.poids = newP;
        } else{
            a.faim = a.faim - 1;
        }
    }

    public static Animal lePlusGros(Animal[] tab){
        if(tab.length == 0){
            return null;
        }
        Animal h = tab[0];
        for(int i=0; i<tab.length; i++){
            if(tab[i].poids > h.poids){
                h = tab[i];
            }
        }
        return h;
    }

    public static Animal reproduction(Animal a, Animal b){
        if(a.sexe != b.sexe && a.espece.equals(b.espece) && a.faim < 5 && b.faim < 5){
            String newNom = "(" + a.nom + b.nom + ")";
            int newS = (int)(Math.random()*2);
            char newSexe = 'i';
            if(newS == 0){
                newSexe = 'f';
            } else{
                newSexe = 'm';
            }
            int newAge = 0;
            int newPoids = (int)(Math.random()*(a.poids-b.poids)+b.poids);
            int newFaim = (int)(Math.random()*(11-0)+11);

            Animal c = new Animal(newNom, newSexe, newAge, newPoids, a.espece, newFaim);
            return c; 
        } else {
            System.out.println ("reproduction impossible");
            return a; 
        }
    }



    public static void main(String[] args){
        Animal a = new Animal("Rico", 'm', 1129, 30, "manchot", 2);
        System.out.println(description(a));
        descriptionBis(a);
        System.out.println();

        Animal b = new Animal("Marti", 'm', (5*365), 300, "zèbre", 5);
        Animal c = new Animal("Gloria", 'f', (7*365), 1500, "hippopotame", 5);
        Animal[] tab = {a,b,c};
        Animal gros = lePlusGros(tab);
        System.out.println(description(gros));
        System.out.println();

        Animal d = new Animal("Mer", 'm', (5*365), 300, "pingouin", 2);
        Animal e = new Animal("Ci", 'f', (7*365), 1500, "pingouin", 2);
        Animal f = reproduction(d,e);
        System.out.println(description(f));

    }



}

/*RÉPONSES AUX QUESTIONS :
3) On doit écrire dans le main :
Pour le zèbre : Animal z = new Animal("Marti", 'm', (5*365), 300, "zèbre");
Pour l'hippo : Animal h = new Animal("Gloria", 'f', (7*365), 1500, "hippopotame");
4) h.poids = h.poids - 50;
5) Ces instructions vont afficher '950'.

*/