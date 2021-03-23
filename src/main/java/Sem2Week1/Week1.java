package Sem2Week1;
public class Week1 {
    public static void main(String[] args) {
        String[][] siswa = {{"bagas","bagus"},{"ipang","ipung"}};
        for (int i = 0; i<siswa.length; i++){
         for(int a =0; a<siswa[i].length; a++){
             System.out.println("Data ke"+i+ "="+siswa[i][a]);
         }
        }
    }
    
           
}            
