import java.util.Scanner;
public class PositifNegatif {
    
    public static void main(String[] args) {
        int bil;
        String result;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Isikan Bilangan");
        bil = sc.nextInt();
        
        if(bil > 0){
            if(bil % 10==0){
                result = "KELIPATAN 10";
            }
            else{
                result = "POSITIF";
            }
        }
        else{
            if(bil==0){
                result = "NETRAL";
            }
            else{
                result ="NEGATIF";
            }
        }
        
        System.out.println(result);
    }
    
}
