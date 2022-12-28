class Exo5_fibo{

    public static int[] fibo(int n){
        int[] suite = new int[n];
        int nbr1 = 0;
        int nbr2 = 1;
        int nbr3 = 0;
        if(n>1){
            for(int i=0; i<n; i++){
                nbr3 = nbr1 + nbr2;    
                nbr1 = nbr2;    
                nbr2 = nbr3;
                suite[i]= nbr3;
            }
        } else{
            if(n==1){
                suite[0] = 0;
            }
        }
        return suite;
    }

    public static int[][] fiboByDigits(int n){
        int[] suite = fibo(n);
        
        //cut array
        int maxi = 0;
        for(int i=0; i<suite.length; i++){
            if(suite[i]>maxi){
                maxi=suite[i];
            }
        }

        int taille = savoirlenombredechiffre(maxi);
        int[][] res = new int[taille][];
        res[0] = new int[nombrede1seulchiffre(suite)];
        if (res.length >= 2){
        res[1] = new int[nombrede2seulchiffre(suite)];}
        if (res.length >= 3){
        res[2] = new int[nombrede3seulchiffre(suite)];}
        if (res.length >= 4){
        res[3] = new int[nombrede4seulchiffre(suite)];}

        for(int i=0; i<suite.length; i++){
            for(int j=0; j<nombrede1seulchiffre(suite); j++){
                res[0][j] = suite[j];
            }
            if (res.length >= 2){
                int k = 0;
                for(int j=nombrede1seulchiffre(suite); j<nombrede1seulchiffre(suite)+nombrede2seulchiffre(suite); j++){
                    res[1][k] = suite[j];
                    k++;
            }}
            if (res.length >= 3){
                int k = 0;
                for(int j=nombrede1seulchiffre(suite)+nombrede2seulchiffre(suite); j<nombrede1seulchiffre(suite)+nombrede2seulchiffre(suite)+nombrede3seulchiffre(suite); j++){
                    res[2][k] = suite[j];
                    k++;
            }}
            if (res.length >= 4){
                int k = 0;
                for(int j=nombrede1seulchiffre(suite)+nombrede2seulchiffre(suite)+nombrede3seulchiffre(suite); j<nombrede1seulchiffre(suite)+nombrede2seulchiffre(suite)+nombrede3seulchiffre(suite)+nombrede4seulchiffre(suite); j++){
                    res[3][k] = suite[j];
                    k++;
            }}
        }

        return res;
    }

    public static int nombrede1seulchiffre(int[] tab){
        int compteur = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<10){
                compteur++;
            }
        }
        return compteur;
    }

    public static int nombrede2seulchiffre(int[] tab){
        int compteur = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<100 && tab[i]>10){
                compteur++;
            }
        }
        return compteur;
    }

    public static int nombrede3seulchiffre(int[] tab){
        int compteur = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<1000 && tab[i]>100){
                compteur++;
            }
        }
        return compteur;
    }

    public static int nombrede4seulchiffre(int[] tab){
        int compteur = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i]<10000 && tab[i]>1000){
                compteur++;
            }
        }
        return compteur;
    }

    public static int savoirlenombredechiffre(int maxi){
        if(maxi<10){
            return 1;
        }
        if(maxi>10 && maxi<100){
            return 2;
        }
        if(maxi>100 && maxi<1000){
            return 3;
        }
        if(maxi>1000 && maxi<10000){
            return 4;
        }
        return 5;
    }


    public static void printArrayInt (int[] tab){
        System.out.print("{ ");
        for(int i=0; i<tab.length-1; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1] + " }");
    }

    public static void printLines(int[][] tab) {
        for(int i=0; i<tab.length; i++){
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printLines(fiboByDigits(13));
    }
}