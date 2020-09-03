import java.util.*;
public class Exemplu3{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(6,3,7,9,2);
        //transform un sir de numere intr-o lista
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.push(50);//adaug elementul la inceput
        deq.pop();//elimina si returneaza elem de la inceput
        deq.poll();//eliminare
        deq.peek();//returneaza elem de la inceput, fara eliminare/sterge
        deq.offer(67);//adauga la final
        //coada -> FIFO(FIRST IN FIRST OUT) -> offer + pop
        //STIVA -> LIFO(LAST IN FIRST OUT) -> push + pop
    }
}