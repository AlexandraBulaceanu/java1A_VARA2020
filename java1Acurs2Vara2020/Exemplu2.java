/**
  Se da un caracter(anotimp). In functie de acesta, se vor afisa diferite mesaje in consola:
  'v'(vara) -> Este soare
  'i'(iarna) -> este frig
  'p'(primavara), t(toamna) -> ploua
  orice altceva -> nu exista anotimpul
  
  kahoot.it
 */
public class Exemplu2{
    public static void main(String [] args){
        char anotimp = 'k';
        switch(anotimp){
            case 'v': System.out.println("Este soare");
                      break;
            case 'i': System.out.println("Este frig");
                      break;
            case 'p':
            case 't': System.out.println("ploua");
                      break;
            default: System.out.println("nu exista anotimpul");
 
        }
    }
}