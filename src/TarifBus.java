
import java.util.ArrayList;
import java.util.Scanner;


public class TarifBus {
    
    public static void main(String[] args) {
        ArrayList <String> kota = new ArrayList<String>();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Isikan Jumlah Kota : ");
        int jmlkota = sc.nextInt();
       
        for(int i=0;i <jmlkota;i++){
            System.out.print("Kota ke " + (i+1) + " : ");
            String kotajabar = sc.next();
            kota.add(kotajabar);
        }
        
        System.out.println(kota);
        
        System.out.print("Isikan Kota Keberangkatan:");
        String kota_berangkat = sc.next();
        
        System.out.print("Isikan Kota Tujuan:");
        String kota_tujuan = sc.next();
        boolean isBerangkat = false;
        boolean isTujuan = false;
        
        int posBerangkat = 0;
        int posTujuan = 0;
        
        for(int i=0;i<kota.size();i++){
            if(kota_berangkat.equals(kota.get(i))){
                isBerangkat = true;
                posBerangkat = i;
            }
            
            if(kota_tujuan.equals(kota.get(i))){
                isTujuan = true;
                posTujuan = i;
            }
        }
        
        if(isBerangkat==false){
            System.out.println("Kota Berangkat tidak ada didalam list");
        }
        
        if(isTujuan==false){
            System.out.println("Kota Tujuan tidak ada didalam list");
        }
        
        if(isBerangkat==true && isTujuan==true){
            int tarif = Math.abs((posTujuan - posBerangkat) * 15000);
            /*if(tarif < 0){
                tarif = tarif * -1;
            }*/
            System.out.println("Tarif anda : "+tarif);
        }
    }
}
