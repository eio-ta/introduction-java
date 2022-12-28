public class Zoo{
    String ville;
    Enclos[] contenu;

    Zoo(String nomDuZoo, int nombreEnclos, int tailleEnclos){
        ville = nomDuZoo;
        contenu = new Enclos[nombreEnclos];
        for(int i=0; i<contenu.length; i++){
            contenu[i] = new Enclos[tailleEnclos];
        }
    }

    public static boolean ajoutAnimal(Zoo z, Animal a){
        for(int i=0; i< z.contenu.length; i++){
            if(Enclos.ajoutAnimal(z.contenu[i], a)){
                return true;
            }
        }
        return false;   
    }

    public static void nourrirToutleMonde(Zoo z){
        for(int i=0; i<z.contenu.length; i++){
            for(int j=0; j<z.contenu[i].tab.length; j++){
                if(z.contenu[i].tab[j].faim > 5){
                    Animal.nourrir(z.contenu[i].tab[j]);
                }
            }
        }
        
    }
}