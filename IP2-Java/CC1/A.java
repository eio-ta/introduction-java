public class A{
    public int x;
    final int y;
    public A(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int xplus(int x){
        x++;
        return x;
    }
    public void nullfier (){
        this=null ;
    }
}