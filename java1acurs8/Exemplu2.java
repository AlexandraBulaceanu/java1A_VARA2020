//Citim de la tastatura un sir de caractere
//Inversam sirul de caractere si ulterior sa il afisam in consola
import java.util.*;
public class Exemplu2{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);//creez flux de citire
        System.out.println("Sir de caractere: ");
        String line = s.nextLine();//citesc linia introdusa de utilizator
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();//inversez sirul
        System.out.println(sb);
        
    }
}
