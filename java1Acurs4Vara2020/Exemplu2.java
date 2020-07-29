public class Exemplu2{
    public static void main(String [] args){
        int m[][];
        m = new int[4][];
        m[0] = new int[7];
        m[1] = new int[9];
        m[2] = new int[3];
        m[3] = new int[5];
        
        int c=1;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++)
            {
                m[i][j] = c;
                c++;
            }
        }
        for(int []x:m){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
        int []x = {10,3,7,5,89,45};
        int [][]y = {{1,8,3},{7,5,9},{4}};
        //int []z = new int[4]{3,6,7,9};
        int []z = new int[]{3,6,7,9};
        
    }
}