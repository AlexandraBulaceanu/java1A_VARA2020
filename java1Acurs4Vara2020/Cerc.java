public class Cerc extends Punct{
    double raza;//adaugare de atribut
    String x;//ascuns atributul x care era deja mostenit
    
    public Cerc(){
        this(0.3);
    }
   
    /*public Cerc(){
        super(0,0);
    }*/
   
    public Cerc(double raza){
        super(2,3);
    }
    
    public double getArie(){
        return 3.14*this.raza*this.raza;//adaugare de comportament
    }
    
    public double getLungime(){
        return 2*3.14*this.raza;
    }
}