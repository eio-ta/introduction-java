public class Utilisateur{
    private String pseudo;
    private String motDePasse;
    private final String adresseMail;

    Utilisateur(String pseudo, String motDePasse, String adresseMail){
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.adresseMail = adresseMail;
    }

    public boolean testMotDePasse(String s){
        return s.equals(this.motDePasse);
    }

    public void changerMotDePasse(String motDePasse, String nouveauMotDePasse){
        if(testMotDePasse(motDePasse)){
            this.motDePasse = nouveauMotDePasse;
        }
    }

    public String getPseudonyme(){
        return this.pseudo;
    }

    public void setPseudonyme(String pseudo){
        this.pseudo = pseudo;
    }
}