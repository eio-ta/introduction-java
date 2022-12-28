public class Specification {

  public static String charAtPosition(String s, int i) {
    if (i < 0 || i >= s.length()) {
      return "";
    } else
      return String.valueOf(s.charAt(i));
  }

  public static int minArray(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int[] initArray(int i) {
    int[] arr = new int[i];
    for (int j = 0; j < arr.length; j++) {
      arr[j] = j;
    }
    return arr;
  }

  public static int dichotomicSearch(int[] arr, int i) {
    int min = 0;
    int max = arr.length;
    int pos = (min + max) / 2;

    while (min != max) {
      if (arr[pos] < i) {
        min = pos;
        pos = (min + max) / 2;
      } else if (arr[pos] > i) {
        max = pos;
        pos = (min + max) / 2;
      } else {
        return pos;
      }
    }
    return -1;
  }

  public static boolean forallNotEmpty(String[] arr) {
    boolean b = true;
    for (int i = 0; i < arr.length; i++) {
      if (!"".equals(arr[i])) {
        b = false;
      }
    }
    return b;
  }

  public static boolean existsPositiveLine(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      boolean b = false;
      for (int j = 0; j < arr[i].length; j++) {
        if (arr[i][j] >= 0) {
          b = true;
        }
      }
      if (!b) {
        return false;
      }
    }
    return true;
  }

  //Procédure ajoutée pour print les tableaux
  public static void printA(int[] tab) {
    System.out.print("{ ");
    for(int i=0; i<tab.length; i++) {
      System.out.print(tab[i] + " ");
    }
    System.out.println("}");
  }

  public static void printLines(int[][] tab) {

    for(int i=0; i<tab.length; i++){
      for (int j=0; j<tab[i].length; j++){
        System.out.print(tab[i][j] + " ");
      }
      System.out.println();
    }
  }

  //Exercice 02

  public static boolean existsUnderscore(String[] arr){
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length(); j++){
        if(arr[i].charAt(j) == '_'){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean forallContainZero(int[][] arr){
    boolean a = false;
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j] == 0){
          a = true;
        }
      }
    }
    return a;
  }

  public static int[][] padMatrix(int[][] arr, int x){
    //Étape 01 : avoir la taille du tableau mat
    int n = arr.length;
    int m = 1;
    for(int i=0; i<arr.length; i++){
      if(m < arr[i].length){
        m = arr[i].length;
      }
    }

    int[][] mat = new int[n][m];

    //Étape 2 : on remplit le tableau mat
    int cptligne = 0;
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        mat[i][j] = arr[i][j];
        cptligne = j;
      }
      for(int j=cptligne+1; j<mat[i].length; j++){
        mat[i][j] = x;
      }
    }
    return mat;
  }


  //Exercice 3
  public static int mémoire = -1;
  public static int[] arr1;
  public static int compteur = -1;

  public static int iterNum(){
    int cpt1 = mémoire+1;
    mémoire = cpt1;
    return cpt1;
  }

  public static void reset(int x){
    mémoire = x-1;
    System.out.println(iterNum());
  }

  public static void initWithArray(int[] arr){
    arr1 = arr;
  }

  public static int iterArray(){
    if(compteur>=arr1.length-1){
      return -1;
    } else{
      compteur++;
      return arr1[compteur];
    }
  }
  
  public static void main (String[] args) {

    /*System.out.println(charAtPosition("lalalallalalala", 15));
    int[] a = {12,16,18,2,6,7,8};
    System.out.println(minArray(a));
    printA(initArray(8));*/
    int[] b = {5,7,12,15,17,20};
    /*System.out.println(dichotomicSearch(b, 12));
    String[] c = {"","","","","papa"};
    String[] d = {"","","","",""};
    System.out.println(forallNotEmpty(c));
    System.out.println(forallNotEmpty(d));
    int[][] e = {{10,7},{-1,5},{20},{4},{5},{7},{12}};
    int[][] f = {{-10,7},{-4,5},{-20},{-4},{-5},{-7},{-12}};
    System.out.println(existsPositiveLine(e));
    System.out.println(existsPositiveLine(f));*/

    /*String[] g = {"buuaa","gouaa","oupii","ouhlaala_","papa"};
    String[] h = {"buuaa","gouaa","oupii","ouhlaala","papa"};
    System.out.println(existsUnderscore(g));
    System.out.println(existsUnderscore(h));
    int[][] i = {{10,7},{-1,5},{0},{4},{5},{7},{12}};
    int[][] j = {{-10,7},{-4,5,-10,7},{-20,15},{-4,15,13,14,16},{-5},{-7},{-12}};
    System.out.println(forallContainZero(i));
    System.out.println(forallContainZero(j));
    printLines(padMatrix(j,3));*/

    /*for(int i=0; i<5; i++){
      System.out.println(iterNum());
    }
    reset(3);
    initWithArray(b);
    printA(arr1);*/

    int[] a = {3, 4};
    initWithArray(a);
    System.out.println(iterArray());
    System.out.println(iterArray());
    System.out.println(iterArray());

  }

}

