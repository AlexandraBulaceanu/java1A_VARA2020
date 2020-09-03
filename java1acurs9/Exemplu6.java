public class Exemplu6{
    public static void main(String ... args){
        OddNumbersThread t = new OddNumbersThread();
        t.start();
       // t.run(); rulam instructiunile pe ac fir de executie cu main
       EvenNumbersThread r = new EvenNumbersThread();//task
       Thread t2 = new Thread(r);//mecanismul de fir de executie
       t2.start();
       System.out.println("The end...");
    }
}