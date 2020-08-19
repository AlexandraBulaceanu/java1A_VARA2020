public class Exemplu7{
    public static void main(String [] args){
       /*
        Door d = new Door();
        d.close();
        */
       Door d1 = null;
       Door d2 = null;
       try{
           d1 = new Door();
           d2 = new Door();
           if(1==1) throw new MyException();
           //folosim usa
       }catch(Exception e){
        //tratam
        /*while(1==1){
            System.out.println("infinit");
            break;
        }*/
       }finally{
           if(d1!=null) {d1.close();}
           if(d2!=null) {d2.close();}
       }
    }
}