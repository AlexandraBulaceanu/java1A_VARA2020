public class C1{
    int x;
    static int y;
    public void m1(int k){
        int q = 21;
        x = 10;
        class C2{
            //clasa locala in context non-static
            //nu o pot pune in mod de acces
            public void m2(){
                System.out.println(q);
                //q = 10;
                //k = 3;
                //o valoare locala folosita in clasa C2 devine automat constanta
            }
        }
        //q = 9;
    }
    
    public static void m3(){
        class C3{
            //clasa locala in context static
            public void m4(){
                y=4;
            }
        }
    }
}