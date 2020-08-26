public class Exemplu1{
    public static void main(String [] args){
        Pisica p1 = new Pisica();
        p1.varsta = 6;
        p1.nume = "Lea";
        Pisica p2 = new Pisica();
        p2.varsta = 3;
        p2.nume = "Kitty";
        System.out.println(p1.equals(p2));
        System.out.println(p2);
    }
}