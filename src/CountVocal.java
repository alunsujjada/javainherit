
import javax.swing.*;
public class CountVocal {
    
    public static void main(String[] args) {
        
        String sentences = JOptionPane.showInputDialog("Isikan Kalimat");
        
        int jmlA = 0;
        
        for(int i=0;i<sentences.length();i++){
            char letter = sentences.toUpperCase().charAt(i);
            if(letter == 'A'){
                jmlA++;
            } 
        }
        
        System.out.println("Jumlah HURUF A:" + jmlA);
        JOptionPane.showMessageDialog(null, "Jumlah HURUF A:" + jmlA);
       
    }
    
}
