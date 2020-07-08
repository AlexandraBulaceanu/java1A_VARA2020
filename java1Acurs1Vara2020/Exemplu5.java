public class Exemplu5{
    public static void main(String [] args){
        byte b1; //declarare de variabila
        b1 = 10;
       
        byte b2 = 20; // initializare = declarare + initializare
        short s1,s2,s3;
        int i1 = 10;
        long l1 = 10;
        int q1 = 04; //baza 8
        int q2 = 0xFA; //baza 16 - hexa
        int q3 = 0b101001; //baza 2
       
        System.out.println(q2);
       
        long w = 1_000_000; //w si v acelasi lucru
        long v = 1000000;
        long k = 10000000000L; //initial imi spune ca e prea mult pentru un int, pun L la final pentru a puteam compila (L este literal)
        float f1 = 10.5f; // f literal
        float f2 = (float)10.5;
        double d1 = 10.5;
        boolean bool1 = true;
        boolean bool2 = false;
        char c1 = 'a'; //caracterul direct
        char c2 = '\u0235'; //codul din tabela unicode
        char c3 = '\n'; // caracter de linie noua
        System.out.println("Caracter "+c2);
    }
}