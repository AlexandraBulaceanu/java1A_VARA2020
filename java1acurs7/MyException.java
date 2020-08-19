public class MyException extends Exception{
    public MyException(){
        super("Acesta este o exceptie checked care trebuie sa fie tratata sau propagata");
    }
}