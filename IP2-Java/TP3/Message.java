public class Message{
    Utilisateur utilisateur;
    String message;

    Message(Utilisateur a, String message){
        this.utilisateur = a;
        this.message = message;
    }

    public String afficherMessage(){
        return utilisateur.getPseudonyme() + " : " + message;
    }
}