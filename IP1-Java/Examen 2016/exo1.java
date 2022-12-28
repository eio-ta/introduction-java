public class exo1 {

    public static int nextHour(int x){
        return x-x/9;
    }

    public static int halfLife(int x){
        int cmpt = 0;
        int temp = x;
        while(temp>x/2){
            temp = nextHour(temp);
            cmpt = cmpt+1;
        }
        return cmpt;
    }

    public static boolean enoughProgrammium (int x, int n){
        int reste = x;
        for(int i=0; i<n; i++){
            reste = nextHour(reste);
        }
        if(reste>x/2){
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        int x = 19;
        System.out.println(nextHour(x));
        System.out.println(halfLife(x));
        System.out.println(enoughProgrammium(x, halfLife(x)));
    }
}