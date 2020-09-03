import java.util.*;
public class Exemplu1{
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(12);
        set.add(10);
        set.add(67);
        set.forEach(System.out::println);//e->System.out.println(e)
    }
}