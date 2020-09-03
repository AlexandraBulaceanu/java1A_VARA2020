import java.util.*;
public class Exemplu4 {
    public static void main(String [] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(4,"Cluj");
        map.put(8,"Bucuresti");
        map.put(3,"Sibiu");
        map.put(4,"Timisoara");
        map.put(9,"Constanta");
        
        Set<Integer> keys = map.keySet();//setul de chei
        for(Integer k:keys){
            System.out.println(k+" "+map.get(k));
        }
        System.out.println("=========");
        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}