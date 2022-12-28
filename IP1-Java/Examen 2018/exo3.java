public class exo3 {

    public static int tailleMotPluslong(String[] tab){
        int c = 0;
        for (int i=0; i<tab.length; i++){
            if(tab[i].length() >= c){
                c = tab[i].length();
            }
        }
        return c;
    }

    public static String[] motsPremiereLettre(String[] tab, String ch){

        int c = 0;
        for(int i=0; i<tab.length; i++){
            String u = tab[i].substring(0,1);
            if(ch.equals(u)){
                c++;
            }
        }
        String[] res = new String[c];
        c=0;
        for(int i=0; i<tab.length; i++){
            String u = tab[i].substring(0,1);
            if(ch.equals(u)){
                res[c] = tab[i];
                c++;
            }
        }
        return res;
    }

    public static String[] effaceEspace(String ch){
        int c = 0;
        for(int i=0; i<ch.length(); i++){
            String u = ch.substring(i,i+1);
            if(u.equals(" ")){
                c++;
            }
        }

        String[] res = new String[c+1];
        c=0;
        int pos = 0;

        for(int i=0; i<ch.length(); i++){
            String u = ch.substring(i,i+1);
            if(u.equals(" ")){
                res[c] = ch.substring(pos, i);
                pos = i+1;
                c++;
            }
        }

        return res;
    }




    public static void main(String[] args){
        String[] T = {"monde","le","petit","merci"};
        String[] T1 = motsPremiereLettre(T,"m");

        String ch = "le monde est très petit on rencontre des gens formidables tous les jours";
        String[] T2 = effaceEspace(ch);

        
        for(int i=0; i<T2.length; i++){
            System.out.print(T2[i] + " ");
        }
        System.out.println();
    }
}