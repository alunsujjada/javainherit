
import java.util.Scanner;

public class LinearSearch {
    
    public static void main(String[] args) {
        
        int data[] = {10, 20, 20, 56, 47, 100, 80,90,20};
        int posisi = -1;
        String output="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Isika Data : ");
        int key = scanner.nextInt();
        
        for(int i=0;i<data.length;i++){
            if(key==data[i]){
                //System.out.println("Data " + key + " ada di posisi ke :" + (i+1));
                
                output = output  + (i+1) + ",";
                posisi = i;
            }
        }
        
        /*
        if(posisi == -1){
            
            System.out.println("Data Tidak ditemukan");
        }
        else{
            System.out.println("Posisi " + key + " ada di :" + output);
        }*/
        
        if(output.equals("")){
            System.out.println("Data Tidak ditemukan");
        }
        else{
            System.out.println("Posisi " + key + " ada di :" + output);
        }
        
    }
    
}
