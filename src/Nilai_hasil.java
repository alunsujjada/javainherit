/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itsttar
 */
import java.util.Scanner;

public class Nilai_hasil{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int bil=-11;
        String result = "";
        int hasil = bil % 2;
        
        switch (hasil){
            case 0 :
                result = "GENAP";
                break;
            case 1 :
                result = "GANJIL";
                break;
            default :
                result = "BUKAN GENAP & GANJIL";
                break;
        }
        
        System.out.println(result);
        
        
       
    }
}