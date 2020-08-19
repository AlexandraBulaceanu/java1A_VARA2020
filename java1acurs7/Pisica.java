//implementare lazy de singleton
public class Pisica{
    String nume;
    int varsta;
    private static Pisica SINGLETON;
    private Pisica(){}
    public static Pisica getInstance(){
        if(SINGLETON == null){
            //daca nu mai exista nicio alta pisica in aplicatie
            //creez una noua
            SINGLETON = new Pisica();
        }
        return SINGLETON;
    }
}