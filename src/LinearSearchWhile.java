
import java.util.Scanner;


public class LinearSearchWhile {
    
    public static void main(String[] args) {
        String eng[] = {"apple","grape","watermelon"};
        String ind[] = {"apel","anggur","semangka"};
        boolean isfound = false; 
        String output="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Search : ");
        String key = scanner.next();
        int index =0;
        while(!isfound){
            if(eng[index].equals(key)){
                System.out.println(ind[index]);
                isfound = true;
            }
            else if (index ==eng.length-1){
                System.out.println("Data tidak ditemukan");
                
                break;
            }
            
            index++;
        }
    }
}
