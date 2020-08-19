//implementare inner static thread-safe
public class Punct{
    int x;
    int y;
    private Punct(){}
    private static final class SingletonHolder{
        private static final Punct SINGLETON = new Punct();
    }
    public static Punct getInstance(){
        return SingletonHolder.SINGLETON;
    }
}