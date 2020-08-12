public class Exemplu4{
    public static void main(String [] args){
        Angajat a1 = new Angajat(1000, 3, "Marcel");
        Angajat a2 = new Angajat(1000, 10, "Sorina");
        Angajat a3 = new Angajat(1000, 1, "Andrei"){
            @Override
            public double calculeazaSalariu(){
                return 3000;
            }
        };
        
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(a3.calculeazaSalariu());
        
        Instrument i = new Instrument(){
            public void play(){
                
            }
        };
        Instrument i2 = () -> {};
        
        
    }
}