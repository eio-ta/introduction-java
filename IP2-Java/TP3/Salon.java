public class Salon{
    Utilisateur[] utilisateurs;
    Message[] messages;

    Salon(Utilisateur[] utilisateurs, Message[] messages){
        this.utilisateurs = utilisateurs;
        this.messages = messages;
    }

    public void ajouteUtilisateur(Utilisateur nouveau){
        Utilisateur[] res = new Utilisateur[utilisateurs.length+1];
        for(int i=0; i<utilisateurs.length; i++){
            res[i] = utilisateurs[i];
        }
        res[res.length-1] = nouveau;
        this.utilisateurs = res;
    }

    public boolean estPresent(Utilisateur lala){
        for(int i=0; i<utilisateurs.length; i++){
            if(utilisateurs[i] == lala){
                return true;
            }
        }
        return false;
    }

    public void ajouteMessage(Message nouveau){
        if(estPresent(nouveau.utilisateur)){
            Message[] res = new Message[messages.length+1];
        for(int i=0; i<messages.length; i++){
            res[i] = messages[i];
        }
        res[res.length-1] = nouveau;
        this.messages = res;
        }
    }

    public void afficher(){
        for(int i=0; i<messages.length; i++){
            System.out.println(messages[i].afficherMessage());
        }
    }

    //QUESTION 07
    public void exclusUtilisateur(Utilisateur exclus){
        //la personne en question ne fait plus partie du salon
        Utilisateur[] res = new Utilisateur[utilisateurs.length-1];
        int comp = 0;
        for(int i=0; i<utilisateurs.length; i++){
            if(utilisateurs[i] != exclus){
                res[comp] = utilisateurs[i];
                comp++;
            }
        }
        this.utilisateurs = res;

        //aucun de ses messages n’est plus conservé
        comp = 1;
        for(int i=0; i<messages.length; i++){
            if(messages[i].utilisateur == exclus){
                comp++;
            }
        }

        Message[] hello = new Message[comp];
        comp = 0;
        for(int i=0; i<messages.length; i++){
            if(messages[i].utilisateur != exclus){
                hello[comp] = messages[i];
                comp++;
            }
        }
        this.messages = hello;
    }

}