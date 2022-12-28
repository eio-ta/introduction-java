public class Robot{
    static int nbRob = 1;
    private int id;
    private int np;
    private char nom;
    private String texte;

    public Robot(char nom, String texte){
        this.nom = nom;
        this.id = nbRob;
        this.np = texte.length();
        this.texte = texte;
        this.nbRob++;
    }

    //////////////////////////////////////GETTERS & SETTERS//////////////////////////////////////
    public int getID(){
        return this.id;
    }

    public char getNom(){
        return this.nom;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public boolean finiDeParler(){
        return np==0;
    }

    public int parle(int n){
        String st = "";
        if(np-n>0){
            for(int i=0; i<n; i++){
                st = st + this.texte.substring(i, i+1);
            }
            System.out.println(st);
            String tmp = "";
            for(int i = st.length(); i<texte.length(); i++){
                tmp = tmp + this.texte.substring(i, i+1);
            }
            this.texte = tmp;
            np = np-n;
            return np;
        } else {
            st = texte;
            System.out.println(st);
            this.texte = "";
            np=0;
            return 0;
        }
    }

    public void description(){
        System.out.println("Nom du Robot : " + this.id + ", Nombre de lettres à prononcer : " + this.np + ".");
    }

}