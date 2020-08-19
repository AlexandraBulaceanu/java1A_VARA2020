public class Exemplu8{
    public static void main(String [] args){
        try(
            Door d1 = new Door();
            Door d2 = new Door();
        ){
            d1.nume = "d1";
            d2.nume = "d2";
            System.out.println("folosim usa");
            
        }catch(Exception e){
            System.out.println("in catch");
        }finally{
            //finnaly explicit
            System.out.println("finnaly explicit");
        }
    }
}