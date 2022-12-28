class Exo1 {

    public static void letters2word(char[] tab) {
        String s = "";
        for(int i=0; i<tab.length; i++) {
            s = s + tab[i];
        }
        System.out.println (s);
    }

    public static void stutterword(char[] tab1, int[] tab2) {
        if(tab1.length != tab2.length) {
            System.out.println ("Erreur.");
        } else {
            int n = 0;
            String s = "";
            for(int i=0; i<tab2.length; i++) {
                n = tab2[i];
                for(int j=0; j<n; j++) {
                    s = s+tab1[i];
                }
            }
            System.out.println (s);
        }
    }

    public static char[] word2letters(String s) {
        char[] tab = new char[s.length()];
        for(int i=0; i<s.length(); i++) {
            tab[i] = s.charAt(i);
        }
        return tab;
    }

    public static char[] letters(String s) {
        String st="";
        for (int i=0; i<s.length();i++){
            boolean b=true;
            for (int j=0;j<st.length();j++){
                if(s.charAt(i)==st.charAt(j)){
                    b=false;
                    }
                } 
            if (b){
                st=st+s.charAt(i);
                }
            }
        return word2letters(st);
    } 

    public static void printtab(char[] tab) {
        System.out.print("{ ");
        for(int i=0; i<tab.length; i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.println("}");
    }

    public static void main (String[] args) {
        char[] tab={'p','l','a','c','a','r','d'};
        letters2word(tab);

        char[] tab1={'a','b','c','d'};
        int[] tab2={2,2,3,4};
        stutterword(tab1,tab2);

        printtab(word2letters("placard"));
        printtab(letters("electroacoustique"));
    }

}