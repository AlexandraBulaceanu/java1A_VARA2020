import java.util.*;
public class Exemplu4{
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(23);//0
        list.add(4);//1
        list.add(10);//2
        list.add(7);//3
        list.add(2);//4System.out.println("======");
        list.add(7);//5
        System.out.println("SIZE: "+list.size());
        System.out.println("EMPTY: "+list.isEmpty());
        System.out.println("Poz 3: "+list.get(3));
        System.out.println("======");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("======");
        for(Integer x:list){
            System.out.println(x);
        }
        System.out.println("======");
        list.forEach(e->System.out.println(e));//pt fiecare elem din lista se afiseaza in consola valoarea lui
        list.remove(2);//valoarea de la indexul 2
        list.remove(new Integer(2));//valoarea efectiva 2
        System.out.println("======");
        list.forEach(System.out::println);//referinta la metoda
    }
}