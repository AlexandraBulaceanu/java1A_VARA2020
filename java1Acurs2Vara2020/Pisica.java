public class Pisica{
    String nume;
    int varsta;
    String culoare;
    double greutate;
    
    //Pisica(){}
    Pisica(String nume, int varsta, String culoare, double greutate){
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
        this.greutate = greutate;
    }
    
    void spuneMiau(){
        System.out.println("Miau! Numele meu este "+this.nume);
    }
}