public class Exemplu3{
    public static void main(String [] args){
        
        Punct p1 = new Punct(2,3);
        Punct p2 = new Punct(4,5);
        Punct p3 = new Punct();
        Punct p4 = new Punct(5);
        
        p1.z = 10;
        p2.z = 40;
        Punct.z = 70;
        
        System.out.println(p1.z);//70
        System.out.println(p2.z);//70
        System.out.println(Punct.z);//70
        
    
        
       Punct.afisareZ();
       
       Punct.m(10.0f);
        
    }
}