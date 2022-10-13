
import java.util.Scanner;

public class MatrikIdentitas {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        
        System.out.print("Isikan Jumlah Baris:");
        int baris = inp.nextInt();
        
        System.out.print("Isikan Jumlah Kolom:");
        int kolom = inp.nextInt();
        
        int matriks [][] = new int[baris][kolom];
        
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                if(i==j){
                    matriks[i][j] = 0;
                }
                else{
                    matriks[i][j] = 1;
                }
            }
        }
        
        for(int i=0;i<matriks.length;i++){
            for(int j=0;j<matriks[i].length;j++){
                System.out.print(matriks[i][j] + "   ");
            }
            System.out.println();
        }
    }
    
}
