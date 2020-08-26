public class Exemplu3{
    public static void main(String [] args){
        A a1;
        
        A<?> a2;
        A<Integer> a3;
        A<Number> a4;
        A<? extends Number> a5;
        A<? super Integer> a6;
        
        a2 = new A();//are valoare implicita
        a2 = new A<Integer>();//instanta o sa aiba atribut pe x de tip intreg
        a2 = new A<int []>();//tip referinta
        a3 = new A<Integer>();
        //a4 = new A<Integer>();//->nu tine cont de polimorfism
        a4 = new A<Number>();
        a5 = new A<Number>();
        a5 = new A<Integer>();
        a6 = new A<Object>();
        a3 = new A<>();//sintaxa Diamond
        
    }
}

