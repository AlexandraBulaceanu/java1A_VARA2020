public class Exemplu6{
    public static void main(String [] args){
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        int i=1;
        for(;;){
            System.out.println(i);
            i++;
            if(i==11) break;
        }
        
        for(int h=2,j=7;(h<9)&&(j>=8);h++,j--){
            System.out.println("for complex");
        }
    }
}