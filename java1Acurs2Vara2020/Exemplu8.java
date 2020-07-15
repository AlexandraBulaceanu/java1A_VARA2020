public class Exemplu8{
    public static void main(String [] args){
        Pisica p1;
        Pisica p2;
        //p1 = new Pisica();
        p1 = new Pisica("Lea",12,"gri",2.3);
        p2 = new Pisica("Mimi",23,"alb",1);
        //p1.nume = "Misha";// '.'=operator de dereferentiere
        System.out.println(p1.nume);
        System.out.println(p1.varsta);
        System.out.println(p1.culoare);
        System.out.println(p1.greutate);
        System.out.println(p2.nume);
    }
}