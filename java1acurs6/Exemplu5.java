public class Exemplu5{
    public static void main(String [] args){
        Predicat p1 = (x) -> x>5;
        Predicat p2 = x -> x>6;//pot sa omit parantezele pt un singur parametru fara tip
        Predicat p3 = (int x) -> x>8;
        Predicat p4 = x -> {return x<4;};
        Predicat p5 = x -> false;
        System.out.println(p1.test(3));
        
        Functie f1 = (x,y) -> 10;
        Functie f2 = (int x, int y) -> x+y;
        Functie f3 = (int x, int y) -> {return x+y;};
        m((x,y)->x+y,10,20);
        m((x,y)->x*y,10,20);
        m(f1,30,40);
        
    }
     public static void m(Functie f, int a, int b){
        System.out.println(f.operatie(a,b));
    }

}