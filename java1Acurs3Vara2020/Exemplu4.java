public class Exemplu4{
    public static void main(String [] args){
        int [] x;
        x = new int[5];
        
        //x[5] = 30;
        x[1] = 40;//pe pozitia 1 se afla valoarea 40
        System.out.println(x[0]+" "+x[1]);
        
        //Vrem sa punem in array numerele de la 1 la 5
        
        for(int i = 0;i < x.length; i++){
            x[i] = i+1;
        }
        
        for(int a:x){
            System.out.println(a);
        }
    }
}