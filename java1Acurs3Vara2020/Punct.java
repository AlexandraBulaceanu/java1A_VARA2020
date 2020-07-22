public class Punct{
    int x;
    int y;
    static int z;
    
    Punct(){
    
    }
    
    Punct(int x){
        this(2,3);
        System.out.println("in const cu 1 param");
    }
    
    Punct(int x, int y){
        System.out.println("in const cu 2 param");
        this.x = x;
        this.y = y;
    }
    
    double getDistance(Punct p){
        //this, p
        double rez = Math.sqrt((this.x - p.x)*(this.x - p.x)+(this.y - p.y)*(this.y - p.y));
                             //((p1.x - p2.x)*(p1.x - p2.x)+(p1.y - p2.y)*(p1.y - p2.y))
        return rez;       
    }
    
    static void afisareZ(){
        //System.out.println(this.x);
        System.out.println(z);
    }
    
    static void m(float x){
        System.out.println("in float");
    }
    
    /*static void m(double y){
        System.out.println("in double");
    }*/
    
    static void m(int x){
        System.out.println("in int");
    }
    
}