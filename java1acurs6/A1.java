public class A1{//A1 = clasa top-level
    int x;
    private static int y;
    public class A2{
        //clasa inner non-statica pt A1 -> A1 este clasa outer pt A2
        int x;
        public void m1(){
            this.x = 10;//x al lui A2
            A1.this.x = 10;//daca vreau sa accesez atributul cu ac nume din outer
            //folosesc urmatoarea sintaxa: Outer.this.numeAtribut
        }
    }
    public static class A3{
        //clasa A3 este clasa inner statica pt clasa A1
        //clasa A1 este outer pt A3
        public void m2(){
            y = 12;
            //x = 10; //x -> este non-static, deci nu e accesibil din inner static
        }
    }
    
}