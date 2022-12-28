public class Chat{
    Salon[] salons;

    Chat(){
        this.salons = new Salon[0];
    }

    public void ajouteSalon(Salon nouveau){
        Salon[] res = new Salon[salons.length+1];
        for(int i=0; i<salons.length; i++){
            res[i] = salons[i];
        }
        res[res.length-1] = nouveau;
        this.salons = res;
    }

    public boolean estPresent(Utilisateur a){
        for(int i=0; i< salons.length; i++){
            if(salons[i].estPresent(a)){
                return true;
            }
        }
        return false;
    }

    public int compteMessageUnSalon(Utilisateur a, Salon test){
        int compteur = 0;
        for(int i=0; i<test.messages.length; i++){
            if(test.messages[i].utilisateur == a){
                compteur++;
            }
        }
        return compteur;
    }

    public int nombreMessages(Utilisateur a){
        int compt = 0;
        for(int i=0; i<salons.length; i++){
            compt = compt + compteMessageUnSalon(a, salons[i]);
        }
        return compt;
    }

    public Utilisateur bavard(){
        Utilisateur bav = salons[0].utilisateurs[0];
        int max = nombreMessages(bav);
        System.out.println(max);
        for(int i=0; i<salons.length; i++){
            for(int j=0; j<salons[i].utilisateurs.length; j++){
                int comp = nombreMessages(salons[i].utilisateurs[j]);
                if(comp > max){
                    max = comp;
                    bav = salons[i].utilisateurs[j];
                }
            }
        }
        return bav;
    }




}