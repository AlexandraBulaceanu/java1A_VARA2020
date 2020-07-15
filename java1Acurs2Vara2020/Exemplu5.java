public class Exemplu5{
    public static void main(String [] args){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        //while(false){}
        while(true){
            break;
        }
        System.out.println("buna");
        i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);
    }
}