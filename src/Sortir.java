
public class Sortir {
    static int nilai [] = {3,2,1};
    
    public static void main(String[] args) {
        
        for(int i=0;i<nilai.length-1;i++){
            for(int j=0;j<nilai.length-i-1;j++){
                if(nilai[j] < nilai[j+1]){
                    int tampung = nilai[j];
                    nilai[j] = nilai[j+1];
                    nilai[j+1] = tampung;
                    
                }
                infoNilai();
            }
        }
    }
    
    public static void infoNilai(){
         for(int i=0;i<nilai.length;i++){
            System.out.print(nilai[i] + ",");
        }
        System.out.println();
    }
}
