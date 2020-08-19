public class Exemplu6{
    public static void main(String [] args){
        try{
            System.out.println("A");
            m(12);
            System.out.println("B");
        }catch(BazException e){
            System.out.println("C");
        }catch(FooException e){
            System.out.println("D");
        }
    }
    public static void m(int x) throws FooException{
        if(x<5) {throw new FooException();}
        if(x>10) {throw new BazException();}
    }
}