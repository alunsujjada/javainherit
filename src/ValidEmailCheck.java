import javax.swing.*;
public class ValidEmailCheck {
    public static void main(String[] args) {
        String sentences = JOptionPane.showInputDialog("Isikan Kalimat");
        boolean ishaveat = false,ishavedot = false;
        int posAt = 0;
        int posDot = 0;
        for(int i=0;i<sentences.length();i++){
            char letter = sentences.charAt(i);
            if(letter == '@'){
               ishaveat = true;
               posAt = i;
            } 
            else if(letter=='.'){
                ishavedot = true;
                posDot = i;
            }
        }
           
        if (ishaveat==true && ishavedot==true){
            if(posAt < posDot){
                System.out.println("VALID");
            }
            else{
                System.out.println("TIDAK VALID");
            }
        }
        else{
            System.out.println("TIDAK VALID");
        }
    } 
}
