class Exo2 {
    public static boolean search (int[] tab, int x){
        for (int i=0;i<tab.length ;i++){
            if (tab[i]==x){
                return true;
            }
        }
        return false;
    }

    public static int[] union (int[] tab1, int[] tab2) {

        //On compte le nombre de case dispo.
        int compteur = tab1.length+tab2.length;
        for(int i=0; i<tab1.length; i++) {
            for(int j=0; j<tab1.length; j++) {
                if (tab2[i]==tab1[j]) {
                    compteur = compteur-1;
                }   
            }
        }
        
        //On crée le tableau et on rentre les entiers de tab1
        int[] res = new int[compteur];
        for(int i=0; i<tab1.length; i++) {
            res[i] = tab1[i];
        }

        //On rentre les valeurs restantes de res.
        int x = 0;
        int i = 0;

        for(int k=0; k<tab2.length; k++) {
            x = tab2[k];
            boolean a = search(tab1, x);
            if(a == false) {
                res[tab1.length+i] = x;
                i++;
            }
        }
        return res; 
    }

    public static int[] difference(int[] tab1, int[] tab2) {

        //Savoir le nombre de diff entre les deux tableaux
        int compteur = tab1.length+tab2.length;
        for (int i=0; i<tab1.length; i++) {
            int x = tab1[i];
            boolean a = search(tab2, x);
            if (a) {
                compteur = compteur-1;
            } else {
                compteur = compteur;
            }
        }

        for (int i=0; i<tab2.length; i++) {
            int x = tab2[i];
            boolean a = search(tab1, x);
            if (a) {
                compteur = compteur-1;
            } else {
                compteur = compteur;
            }
        }

        //Remplir le tableau
        int[] res = new int[compteur];

        int indice = 0;
        for(int i=0; i<tab1.length; i++) {
            int x = tab1[i];
            boolean a = search(tab2, x);

            if (a) {
                res[indice] = 0;
            } else {
                res[indice] = x;
                indice = indice+1;
            }
        }

        for(int i=0; i<tab2.length-1; i++) {
            int x = tab2[i];
            boolean a = search(tab1, x);

            if (a) {
                res[indice] = 0;
            } else {
                res[indice] = x;
                indice = indice+1;
            }
        }
        
        return res;
    }

    public static void printtab(int[] tab) {
        System.out.print("{ ");
        for(int i=0; i<tab.length; i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.println("}");
    }

    public static void main (String[] args){
        int[] tab={6,20,12,1000,8};
        System.out.println(search(tab, 12));
        System.out.println(search(tab, 50));

        int[] tab1={6,20,12,1000,8};
        int[] tab2={2,8,6,7,12};
        printtab(union(tab1, tab2));
        printtab(difference(tab1, tab2));
    }
}
