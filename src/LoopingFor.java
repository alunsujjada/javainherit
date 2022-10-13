
import javax.swing.*;

public class LoopingFor {
    public static void main(String[] args) {
        
        String answer = "Y";
        
        while(answer.equals("Y")){
                String result = "";
                int faktor = 0;
                int angka = Integer.parseInt(JOptionPane.showInputDialog("Isikan Angka"));
                for(int i = 1; i <= angka;i++){
                    if(angka % i ==0){
                        faktor++;
                    }
                }

                if(faktor==2){
                    result = angka + " BILANGAN PRIMA";
                }
                else{
                    result = angka + " BUKAN BILANGAN PRIMA";
                }
                JOptionPane.showMessageDialog(null, result );
                
                answer = JOptionPane.showInputDialog("Apakah Mau Mengulang: Y/N");
                
        }
       
        
        
    }
    
}

