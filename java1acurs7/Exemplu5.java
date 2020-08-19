public class Exemplu5{
    public static void main(String [] args){
        try{
            m(12);
        }catch(AnotherException|MyException e){
            //multi-catch
            System.out.println(e.getMessage());
        }
    }
    public static void m(int x) throws AnotherException, MyException{
        if(x<5) {throw new AnotherException();}
        if(x>10) {throw new MyException();}
    }
}