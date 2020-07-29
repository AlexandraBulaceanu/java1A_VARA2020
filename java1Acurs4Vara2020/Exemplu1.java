public class Exemplu1{
    public static void main(String ... args){
        Punct []p1 = new Punct[5];
        //array de obiecte
        //coordonatele punctelor vor fi i si i+1, unde i = contorul
        for(int i=0;i<p1.length;i++){
            p1[i] = new Punct(i,i+1);
        }
        
        for(int i=0;i<p1.length;i++){
            System.out.println(p1[i].x+" "+p1[i].y);
        }
    }
}