
import java.util.Arrays;
import java.util.Scanner;
public class HillCipher {
    static int A,B,C,D;
    static boolean isOne = false;
    static String data = "abcdefghijklmnopqrstuvwxyz ";
    static int mod = 27;
    public static boolean cekDeterminan(int a,int b,int c, int d){
        int det = (a * d) - (b * c);
        return det==1;
    }
    
    public static String addSpaces(String word){
        String result="";
        if(word.length()%2 ==1){
            result =  word+" ";
        }
        else{
            result = word;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Plain Text :");
        String kalimat = sc.nextLine();
        kalimat = addSpaces(kalimat);
        int kode [] = new int[kalimat.length()];
        while(!isOne){
            System.out.println("---------------------");
            System.out.print("Isikan Matriks A :");
            A = sc.nextInt();
            System.out.print("Isikan Matriks B :");
            B = sc.nextInt();
            System.out.print("Isikan Matriks C :");
            C = sc.nextInt();
            System.out.print("Isikan Matriks D :");
            D = sc.nextInt();
            isOne = cekDeterminan(A,B,C,D);        
        }
        
        System.out.println("Menu\n1.Enkripsi\n2.Dekripsi");
        int pil = sc.nextInt();
        if(pil==2){
            B = 27 - B;
            C = 27 - C;
            int temp = A;
            A = D;
            D = temp;
        }
        
        for(int i=0;i<kalimat.length();i++){
            char huruf = kalimat.charAt(i);
            for(int j=0;j<data.length();j++){
                char huruf2 = data.charAt(j);
                if(huruf==huruf2){
                    kode[i]=j;
                }
            }
        }
      
        for(int i=0;i<kode.length;i++){
            if(i % 2==0){
                int b1k1 = ((kode[i] * A) + (kode[i+1] * C)) % mod;
                int b1k2 = ((kode[i] * B) + (kode[i+1] * D)) % mod;
                System.out.print(data.charAt(b1k1) + "" + data.charAt(b1k2));
            }
        }
    }   
}
