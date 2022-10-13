

import javax.swing.*;
public class SquareNumber {
    
    public static void main(String[] args) {
        
       
        int bil = Integer.parseInt(JOptionPane.showInputDialog("Isikan Bilangan"));
        int pangkat = Integer.parseInt(JOptionPane.showInputDialog("Isikan Pangkat"));
        
        int result = 1;
        for(int i = 1;i <=pangkat;i++){
           result = result * bil;
        }
        System.out.println(result);
        System.out.println(Math.pow(bil, pangkat));
        
        System.out.println("------------------------------------------");
        
        int resultf=1;
        for(int i=1;i<=bil;i++){
            resultf = resultf * i;
        }
        
        System.out.println(bil+"!" + " = " + resultf);
    }
}

