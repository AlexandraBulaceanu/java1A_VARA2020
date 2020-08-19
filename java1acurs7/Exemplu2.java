public class Exemplu2{
    public static void main(String ... args){
        System.out.println("se incearca extragerea");
        //extragereNumerar(1500); exceptia checked  aruncata, iar atata timp cat nu va fi tratata
        //sau propagata nu va compila aplicatia
        System.out.println("extragere reusita");
    }
    public static void extragereNumerar(double suma) throws MyException{
        if(suma > 1000) {
            MyException e = new MyException();
            throw e;//arunc instanta de exceptie(semnalez aparitia ei)
        }
    }
}