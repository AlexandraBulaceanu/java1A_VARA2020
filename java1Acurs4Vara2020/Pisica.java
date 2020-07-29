public class Pisica{
    //clasa encapsulata
    private String nume;//ascuns in clasa -> doar aici o pot vedea
    private int varsta;
    private boolean alive;
    
    public String getNume(){
        return this.nume;
    }
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public int getVarsta(){
        return this.varsta;//in metoda aceasta pot sa obtin valoarea lui varsta
        //(pentru ca sunt in getter) -> obtin acea valoare
    }
    
    public void setVarsta(int varsta){
        this.varsta = varsta;//in metoda asta ii pot da o valoare/o pot schimba
        //(pentru ca sunt in setter) -> setez acea valoare
    }
    
    public boolean isAlive(){
        return this.alive;//in metoda aceasta pot sa obtin valoarea lui alive
        //(pentru ca sunt in getter)
        //is e aici doar pentru ca boolean, altfel era get
    }
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
}