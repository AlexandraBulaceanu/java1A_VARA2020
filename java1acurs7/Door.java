public class Door implements AutoCloseable{
    String nume;
    public Door(){
        open();
    }
    private void open(){
        System.out.println("deschisa "+this.nume);
    }
    @Override
    public void close(){
        System.out.println("close "+this.nume);
    }
}