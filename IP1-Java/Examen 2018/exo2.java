public class exo2 {

    public static boolean retire(int[] T, int num){
        if(num >= 0 && num <= T.length){
            if(T[num] == 0){
                return false;
            } else{
                T[num] = T[num]-1;
                return true;
            }
        } else{
            return false;
        }
    }

    public static boolean plein(int[] T, int cmax){
        for(int i=0; i<T.length; i++){
            if(T[i]<cmax){
                return false;
            }
        }
        return true;
    }

    public static int[] tiroirsLibres(int[] T, int cmax){
        boolean plein = plein(T, cmax);
        if(plein){
            int[] res = {};
            return res;
        } else{
            int cmpt = 0;
            for(int i=0; i<T.length; i++){
                if(T[i]<cmax){
                cmpt++;
                }
            }
            int[] res = new int[cmpt];
            cmpt = 0;
            for(int i=0; i<T.length; i++){
                if(T[i]<cmax){
                res[cmpt] = i;
                cmpt++;
                }
            }
            return res;
        }
    }

    public static int[] ajouteElem (int[] T, int cmax, int n){
        if(plein(T,cmax)){
            return T;
        } else{
            int p = n;
            while(T[p] >= cmax){
                p=(p+1)%T.length;
            }
            T[p] = T[p]+1;
            return T;
        }
    }

    public static int[] ajoutePlusieursElem(int[] T, int cmax, int[] ajout){
        for(int i=0; i<ajout.length; i++){
            if(!plein(T,cmax)){
                T = ajouteElem(T, cmax, ajout[i]);
            } else{
                break;
            }
        }
        return T;
    }


    public static void main(String[] args){
        int[] T = {1,0,2};
        int[] T1 = {1,0,1};
        int[] res = ajoutePlusieursElem(T,2,T1);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();

    }
}