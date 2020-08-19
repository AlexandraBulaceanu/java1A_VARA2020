public class Exemplu1{
    public static void main(String [] args){
        //Pisica p1 = new Pisica();
        Pisica p1 = Pisica.getInstance();
        p1.nume = "Mura";
        Pisica p2 = Pisica.getInstance();
        System.out.println(p2.nume);
    }
}