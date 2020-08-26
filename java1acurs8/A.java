public class A<T>{
   // int x;
   T x;
   //static T x;
   public A(){}
   public A(T x){}
   public T m1(){
       return x;
   }
   public void m2(T a){}
   //public static void m3(T a){}
   public static <Q> void m3(Q a){}
}