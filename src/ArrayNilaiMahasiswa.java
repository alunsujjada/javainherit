
public class ArrayNilaiMahasiswa {
    
    public static void main(String[] args) {
        
        int nilai1 [][];
        int nilai  [][] = new int [4][3];
        
        String nilaiSiswa [][] = {
            {"Rudi","100","80","76"},
            {"Ahmad","90"},
            {"Dedi","60"},
            {"Andi","50"},
        };
        
        
        System.out.println(nilaiSiswa[0][0]);
        System.out.println(nilaiSiswa[0][1]);
        System.out.println(nilaiSiswa[1][0]);
        System.out.println(nilaiSiswa[1][1]);
        System.out.println("-----------------------------------");
        
        for(int i=0;i<nilaiSiswa.length;i++){
            System.out.println(nilaiSiswa[i][0]);
        }
        
        System.out.println("-----------------------------------");
        
        
        for(int i=0;i<nilaiSiswa.length;i++){
            for(int j=0;j<nilaiSiswa[i].length;j++){
                System.out.println(nilaiSiswa[i][j]);
            }
        }
        
        
    }
    
}
