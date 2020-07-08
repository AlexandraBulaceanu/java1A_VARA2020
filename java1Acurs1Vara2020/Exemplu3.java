public class Exemplu3{
    public static void main(String [] args){
        boolean b1 = 3>4;//false
        boolean b2 = 5==5;//true
        boolean b3 = 4==6;//false
        boolean b4 = 0>4;//false
        boolean b6 = 7!=6;//true
        boolean b7 = true;
        boolean b8 = false;
        int a = 10;
        int b = 3;
        boolean b9 = b7&&b8;//false
        boolean b10 = b8&&((a=b)==b);
        //a=b => a=3
        //= -> da valoare = atribuie
        //== -> verifica egalitatea
        int c = a+b;//+ = adunare
        System.out.println(c);
        System.out.println("buna"+"ziua");//+ = concatenare
        //cel putin unul dintre operanzi este sir de caractere -> + face concatenare -> transforma totul intr-un sir de caractere
        System.out.println("Ana "+" are "+3+7+"mere");
                                                      //37
                                                      //"ana are"+3
                                                      //"ana are 3"+7
                                                      //"ana are 37 mere"
        System.out.println("Ana "+" are "+(3+7)+"mere");//10
        System.out.println(3+7+"mere "+" are "+"Ana");
                                                      //10
                                                      //10+"mere"
                                                      //10 mere ...
        //evaluarea expresiei se face de la stanga la dreapta
    }
}