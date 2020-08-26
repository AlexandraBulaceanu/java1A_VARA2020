public class Pisica{
    String nume;
    int varsta;
    
    //regula de egalitate intre instante
    @Override
    public boolean equals(Object o){
        //by defalut se testeaza egalitatea intre referinte(==), daca nu suprascriem
        if(o == null){return false;}
        if(o instanceof Pisica){
            Pisica p = (Pisica)o;
            return this.varsta==p.varsta;
        }
        return false;
    }
    
    @Override
    public String toString(){
        return "nume: "+nume+" varsta: "+varsta;
    }
}