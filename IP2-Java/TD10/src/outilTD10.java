class Arbre{
  int taille(){
    if(this.racine == null) return -1;
    return this.racine.taille();
  }

  static int twoPwr(int n){
    if(n<1) return 1;
    return (2*twoPwr(n-1));
  }

  void dessiner(){
    if(this.racine != null){
      this.setCoordNoeudsValides();
      int t = this.taille();
      for(int i=t ; i>-1 ; i--){
        int c = 0;
        for(int j=1 ; j<twoPwr(t+1) ; j++){
          if(j%twoPwr(i+1) == twoPwr(i)){
            if(coord[t-i][c]) System.out.print("O");
            else System.out.print(" ");
            c++;
          }else System.out.print(" ");
        }
        System.out.println("\n");
      }
    }
  }

  void setCoordNoeudsValides(){
    coord = new boolean[this.taille()+1][twoPwr(this.taille())];
    this.racine.setCoordNoeudsValides("0");
  }
}

class Noeud{
  int taille(){
    if(this.g == null && this.d == null) return 0;
    if(this.g == null) return this.d.taille()+1;
    if(this.d == null) return this.g.taille()+1;
    return max(this.d.taille(), this.g.taille())+1;
  }

  static int max(int a,int b){
    if(a>b) return a;
    else return b;
  }

  void setCoordNoeudsValides(String ordre){
    Arbre.coord[ordre.length()-1][binary(ordre)] = true;
    if(this.g != null) this.g.setCoordNoeudsValides(ordre+"0");
    if(this.d != null) this.d.setCoordNoeudsValides(ordre+"1");
  }

  static int binary(String s){
    int n = 0;
    for(int i=0 ; i< s.length() ; i++){
      n = 2*n;
      if(s.charAt(i) == '1') n++;
    }
    return n;
  }
}
