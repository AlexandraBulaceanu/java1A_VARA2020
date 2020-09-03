import java.util.*;
public class Exemplu5{
    public static void main(String [] args){
        Comparator<Angajat> c = new Comparator<Angajat>(){
            public int compare(Angajat a1, Angajat a2){
                return a1.nume.compareTo(a2.nume);
            }
        };
        TreeSet<Angajat> set2 = new TreeSet<>((a1,a2)->a1.nume.compareTo(a2.nume));
        TreeSet<Angajat> set = new TreeSet<>(c);
        set.add(new Angajat("Ionescu",60));
        set.add(new Angajat("Marinescu",23));
        set.add(new Angajat("Popescu",18));
        set.add(new Angajat("Georgescu",45));
        set.forEach(System.out::println);
    }
}