import java.io.IOException;

public class Display {

  public static int[][] negatif(int[][] pic){
    int[][] res = new int[pic.length][];
    for(int i=0; i<pic.length; i++){
      res[i] = new int[pic[i].length];
      for(int j=0; j<pic[i].length; j++){
        int négatif = 255-pic[i][j];
        res[i][j] = négatif;
      }
    }
    return res;
  }

  public static int[][] flip(int[][] pic){
    int[][] res = new int[pic.length][];
    for(int i=0; i<pic.length; i++){
      res[i] = new int[pic[i].length];
      res[i] = pic[pic.length-1-i];
    }
    return res;
  }

  //Question 3 à refaire !!
  public static int[][] delta(int[][] pic, int x, int y){
    int[][] copie = new int[pic.length][];
    for(int i=0; i<pic.length; i++){
      copie[i] = new int[pic[i].length];
      for(int j=0; j<pic[i].length; j++){
        copie[i][j] = pic[i][j];
      }
    }
    int a = (pic[x-1][y]-pic[x][y]);
    int b = (pic[x][y-1]-pic[x][y]);
    if(a<0){a=-a;}
    if(b<0){b=-b;}
    int delta =a+b;
    if(delta>30){
      System.out.println("(" + x + "," + y + " est un pixel de bord.");
      copie[x][y] = 0;
    } else{
      copie[x][y] = 255;
    }
    return copie;
  }

  public static void drawASCII (int[][] tab){
    for(int i=0; i<tab.length; i++){
      for(int j=0; j<tab[i].length; j++){
        if(tab[i][j]>=0 && tab[i][j]<=25){
          System.out.print("@");
        }
        if(tab[i][j]>=26 && tab[i][j]<=50){
          System.out.print("%");
        }
        if(tab[i][j]>=51 && tab[i][j]<=75){
          System.out.print("#");
        }
        if(tab[i][j]>=76 && tab[i][j]<=100){
          System.out.print("*");
        }
        if(tab[i][j]>=101 && tab[i][j]<=125){
          System.out.print("+");
        }
        if(tab[i][j]>=126 && tab[i][j]<=150){
          System.out.print("=");
        }
        if(tab[i][j]>=151 && tab[i][j]<=175){
          System.out.print("-");
        }
        if(tab[i][j]>=176 && tab[i][j]<=200){
          System.out.print(":");
        }
        if(tab[i][j]>=201 && tab[i][j]<=225){
          System.out.print(".");
        }
        if(tab[i][j]>=226 && tab[i][j]<=255){
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static int[][] egalise(int[][] tab){
    int[][] res = new int[tab.length][tab[0].length];
    int dim = tab.length*tab[0].length;
    for(int i=0; i<tab.length; i++){
      for(int j=0; j<tab[i].length; j++){
        int number = compteur(tab, tab[i][j]);
        int memo = (255*number)/(dim);
        res[i][j] = memo;
      }
    }
    return res;
  }

  public static int[][] melange(int[][] tab){
    if(tab.length%2 == 0){
      int compteur = 0;
      while(compteur<tab.length){
        int[] temp = new int[tab[compteur].length];
        for(int i=0; i<temp.length; i++){
          temp[i] = tab[compteur][i];
        }
        for(int i=0; i<temp.length; i++){
          tab[compteur][i] = tab[compteur+1][i];
        }
        for(int i=0; i<temp.length; i++){
          tab[compteur+1][i] = temp[i];
        }
        compteur = compteur+2;
      }
    } else{
      int compteur = 0;
      while(compteur<tab.length-1){
        int[] temp = new int[tab[compteur].length];
        for(int i=0; i<temp.length; i++){
          temp[i] = tab[compteur][i];
        }
        for(int i=0; i<temp.length; i++){
          tab[compteur][i] = tab[compteur+1][i];
        }
        for(int i=0; i<temp.length; i++){
          tab[compteur+1][i] = temp[i];
        }
        compteur = compteur+2;
      }
    }
    return tab;
  }

  public static int[][] compress(int[][] tab){
    int n = tab.length;
    int m = tab[0].length;
    int n2 = n/2;
    int m2 = m/2;
    int[][] result = new int[n2][m2];
    for(int i=0; i<n2; i++){
      for(int j=0; j<m2; j++){
        int somme = tab[2*i][2*j]+tab[2*i+1][2*j]+tab[2*i][2*j+1]+tab[2*i+1][2*j+1];
        int moyenne = somme/4;
        result[i][j] = moyenne;
      }
    }
    return result;
  }

  

  public static void main(String[] args) throws IOException {
    int[][] q1 = {{0,128,255},{128,255,255},{255,255,255}};
    int[][] res1 = negatif(q1);
    int[][] res2 = flip(q1);
    int[][] res3 = delta(q1, 1, 1);
    int[][] res4 = getGray("icon.gif");
    int[][] res45 = getGray("image.jpg");
    drawASCII(res45);
    int[][] q5 = {{0,0},{255,255}};
    int[][] res5 = egalise(q5);
    int[][] res6 = getGray("overexposed.jpg");
    int[][] q7 = {{0,128,255},{128,255,255},{255,255,255},{0,162,255}};
    int[][] res7 = melange(q7);
    int[][] q8 = {{0,100,200,255},{0,100,200,255},{0,100,200,255},{0,100,200,255}};
    int[][] res8 = compress(q8);
    print2(res8);
    

  }

  //Lire une image
  public static int [][] getGray(String filename) throws IOException {
      Picture p = new Picture(filename);
      return p.getGray();
  }

  //Afficher une image
  public static void drawGray(int [][] gray) {
    Picture p = new Picture(gray);
    p.draw();
  }

  //Sauvegarder une image en png
  public static void saveGray(int [][] gray, String filename) throws IOException {
    Picture p = new Picture(gray);
    p.save(filename);
  }

  //Afficher un tableau à 2 dimensions
  public static void print2(int[][] tab){
    for(int i=0; i<tab.length; i++){
      for(int j=0; j<tab[i].length; j++){
        System.out.print(tab[i][j] + " ");
      }
      System.out.println();
    }
  }

  //Compte le nombre d'élément <= à i
  public static int compteur(int[][] tab, int c){
    int cmpt = 0;
    for(int i=0; i<tab.length; i++){
      for(int j=0; j<tab[i].length; j++){
        if(tab[i][j]<=c){
          cmpt = cmpt+1;
        }
      }
    }
    return cmpt;
  }

}
