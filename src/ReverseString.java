
import javax.swing.*;
public class ReverseString {
    
    public static void main(String[] args) {
        
        String result = "";
        String sentence = JOptionPane.showInputDialog("Isikan Kalimat");
        
        for(int i = sentence.length()-1;i >=0;i--){
            char letter = sentence.charAt(i);
            result = result + letter;
        }
        System.out.println(result);
    }
}

