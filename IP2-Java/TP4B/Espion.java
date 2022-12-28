public class Espion {
    private String vraiNom;
    private boolean loyal;
    private int id;
    private static int number = 1;

    public Espion(String vraiNom, boolean loyal){
        this.vraiNom = vraiNom;
        this.loyal = loyal;
        this.id = number;
        number++;
    }

    public Espion(String vraiNom){
        this.vraiNom = vraiNom;
        this.loyal = true;
        this.id = number;
        number++;
    }

    public String description(){
        String s = this.loyal == true ? " (loyal)" : " (déloyal)"; 
        return ("Espion : " + this.id + s);
    }

    public int getid(){
        return this.id;
    }

    public String getLoyal(){
        return this.loyal == true ? "O" : "N"; 
    }

}