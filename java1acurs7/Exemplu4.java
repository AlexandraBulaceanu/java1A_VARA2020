public class Exemplu4{
    public static void main(String [] args){
        try{
            System.out.println("A");
            m(7);
            System.out.println("B");
        }catch(AnotherException e){
            System.out.println("C");
        }catch(MyException e){
            System.out.println("D");
        }
    }
    public static void m(int x) throws AnotherException, MyException{
        if(x<5) {throw new AnotherException();}
        if(x>10) {throw new MyException();}
    }
}