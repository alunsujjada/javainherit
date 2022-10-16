
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
public class VariabelTipeData {
    
    public static void main(String[] args) {
        int bil1, bil2,hasil;
        String result;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Isikan Bilangan 1 :");
        bil1 = sc.nextInt();
        System.out.print("Isikan Bilangan 2 :");
        bil2 = sc.nextInt();
        
        hasil = bil1 + bil2;
        
        System.out.println("Hasil penjumlahan " + bil1 + " dengan " + bil2 + "=" + hasil);
        
    }
}
