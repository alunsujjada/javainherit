
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itsttar
 */
public class GanjilGenap {
    
    public static void main (String [] args){
        int bil;
        String result="";
        Scanner sc = new Scanner (System.in);
        System.out.print("Isikan bilangan :");
        bil = sc.nextInt();
        
        if(bil % 2 ==0){
            result = bil + " adalah bilangan Genap";
        }
        
        
        System.out.println(result);
        
    }
    
}
