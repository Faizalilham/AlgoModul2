//Moh.Faizal Ilham Falakh_20090086_2D TI
package Sem2Week2;
public class ProjectNo3 {
    public static void main(String[] args) {
        int [][] A = {
            {1,2,3},
            {3,4,6}
           
        
        };
        int [][] B = {
            {5,6},
            {7,8},
            {9,10}
            
        
        };
        int baris_a = A.length;
        int kolom_a = A[0].length;
        int kolom_b = B[0].length;
        int Hasil [][] = new int [baris_a][kolom_b];
        
        for(int i=0; i<A.length; i++){
           for(int j=0; j<kolom_b; j++){
               for(int k=0; k<kolom_a; k++){
                   Hasil [i][j] = Hasil[i][j] + (A[i][k] * B[k][j]) ;
                   
               }
           }
            
        }
        for(int[] x : Hasil){
            for(int X : x){
                System.out.print(X+" ");
            }
            System.out.println();
        }
    }
}
