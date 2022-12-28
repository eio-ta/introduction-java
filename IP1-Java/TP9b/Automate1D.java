public class Automate1D {

  public static boolean[] front = {};
  public static boolean[] back  = {};

  public static char black = '█';
  public static char white = ' ';

  // Écrivez vos fonctions ici
  public static void init(int n){
    front= new boolean[n];
    back=new boolean[n];

    for(int i=0; i<n; i++){
      if(i == n/2){
        front[i] = true;
        back[i] = true;
      } else{
        front[i] = false;
        back[i] = false;
      }
    }
  }

  public static void swap(){
    boolean[] memo = new boolean[back.length];
    for(int i=0; i<back.length; i++){
      memo[i] = back[i];
    }
    back = front;
    front = memo;
  }

  public static void print(){
    for(int i=0; i<front.length; i++){
      if(front[i]){
        System.out.print(white);
      }else{
        System.out.print(black);
      }
    }
    System.out.println();
  }

  public static int computeIndex(boolean a, boolean b, boolean c){
    int compteur = 0;
    if(a){
      compteur= compteur+4;
    }
    if(b){
      compteur=compteur+2;
    }
    if(c){
      compteur++;
    }
    return compteur;
  }

  public static void step(boolean[] rule){
    for(int i=0; i<front.length; i++){
      if(i==0){
        back[i]=rule[computeIndex(false, front[i], front[i+1])];
      }else{
        if(i==front.length-1){
          back[i]=rule[computeIndex(front[i-1], front[i], false)];
        }else{
          back[i]=rule[computeIndex(front[i-1], front[i], front[i+1])];
        }
      }
    }
  }

  public static void run(boolean[] rule, int n, int b){
    init(n);
    for(int i=0; i<n; i++){
      print();
      step(rule);
      swap();
    }
  }

  public static boolean[] rule(int n){
    boolean[] res= new boolean [8];
    for(int i=0; i<res.length; i++){
      res[i]=n%2==0;
      n=n/2;
    }
    return res;
  }




  //Procédure pour print des tableaux
  public static void printA(boolean[] tab) {
    System.out.print("{ ");
    for(int i=0; i<tab.length; i++) {
      System.out.print(tab[i] + " ");
    }
    System.out.println("}");
  }



  public static void main(String[] args) {
    // Écrivez vos tests ici
    run(rule(150), 32, 64);
  }
}
