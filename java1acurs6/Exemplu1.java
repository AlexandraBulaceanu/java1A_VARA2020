public class Exemplu1{
    public static void main(String [] args){
        Anotimp a1 = Anotimp.VARA;
        switch(a1){
            case PRIMAVARA:
            case TOAMNA:
                    System.out.println("Ploua!");
                    break;
            case VARA:
                    System.out.println("Caldura!");
                    break;
            case IARNA:
                    System.out.println("Frig!");
                    break;
        }
        
        for(Anotimp x:Anotimp.values()){
            System.out.println(x+" "+x.ordinal()+" "+x.name());
        }
    }
}