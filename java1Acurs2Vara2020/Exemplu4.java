/**
 Doua intervale orare. Primul de la cat stam la o coada. Al doilea care a fost timpul de asteptare.
 Afisati ora de plecare de la coada.
 
 h1=5,m1=30,s1=20
 h2=2,m2=40,s2=40
 h1,m1,s1
 */
public class Exemplu4{
    public static void main(String [] args){
        int h1=5, m1=30, s1=20;
        int h2=6, m2=40, s2=40;
        
        if(s1+s2>=60){
            s1+=s2-60;//s1=s1+s2-60
            m1++;//m1=m1+1
        }else{
            s1+=s2;//s1=s1+s2
        }
        
        if(m1+m2>=60){
            m1+=m2-60;
            h1++;
        }else{
            m1+=m2;
        }
        
        h1+=h2;
        
        System.out.println("Ora este "+h1+" "+m1+" "+s1);
        
        int a=5, b=10;
        int c = a>b?4:6;
        boolean k = a>b?false:true;//->daca e adevarat ->k=false
        boolean h = a>b?true:false;//->daca e adevarat ->h=true
                //conditie?true:false
               //if(a>b) {c=4;}else{c=6;}
        k=!(a>b);
        System.out.println(c);
    }
}