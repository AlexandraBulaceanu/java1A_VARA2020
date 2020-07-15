/*
 Se da un numar. Sa se afiseze in consola care este ziua saptamanii pe care o reprezinta.
 */
public class Exemplu1{
    public static void main(String [] args){
        int zi = 14;
        switch(zi){
            case 1: System.out.println("Luni");
                    break;
            case 2: System.out.println("Marti");
                    break;
            case 3: System.out.println("Miercuri");
                    break;
            case 4: System.out.println("Joi");
                    break;
            case 5: System.out.println("Vineri");
                    break;
            case 6:
            case 7: System.out.println("Weekend");
                    break;
            default: System.out.println("Zi invalida");
                
        }
        
    }
}