public class B{
    public int z;
    private A a;
    public B (int z){
        this.z=z;
        this.a= new A(0 ,0) ;
    }
    public B(int z , int zz){
        this.z=z;
        this.a=null ;
    } public int g(int w){
        this.a.x = this.a.x + w;
        return this.a.x;
    }
    public int h(int w){
        a.y = a.y + w;
        return a.y;
    }

    public int plusplusx (){
        a.x++;
        return a.x;
    }
    
    public static void main(String [] args){
        A a1=new A(1 ,1) ;
        a1. nullifier () ;
        System. out . println (a1.x) ;
        A a2=new A(2 ,2) ;
        a2. xplus (3) ;
        System. out . println (a2.x) ;
        B b0= new B(1 ,0) ;
        System. out . println (b0.a. xplus (2)) ;
        
        B b1 = new B(5) ;
        System. out . println (b1.h(2)) ;
        B b2=new B(0) ;
        System. out . println (b2. plusplusx () ) ;
    }
} 