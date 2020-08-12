public class Angajat{
    double salariu;
    int vechime;
    String nume;
    
    public Angajat(double salariu, int vechime, String nume){
        this.salariu = salariu;
        this.vechime = vechime;
        this.nume = nume;
    }
    
    public double calculeazaSalariu(){
        if(this.vechime>5){
            return this.salariu + 500;
        }else {
            return this.salariu;
        }
    }
}