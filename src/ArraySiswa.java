
public class ArraySiswa {
    
    public static void main(String[] args) {
        
        int [] arrNilai1 ; // Deklarasi Array Kosong
        int arrNilai2 [] = new int[4]; // Deklarasi array dengan ukuran 4
        int arrNilai3 [] = {70,60,30,40,50,63,70,100,100}; //Deklarasi
        
        //Cara memberikan nilai elemen
        arrNilai2[0]= 20;
        arrNilai2[1] = 100;
        arrNilai2[2] = 70;
        arrNilai2[3] = 80;
     
        arrNilai2[0] = arrNilai2[1] + arrNilai2[3];
        
        System.out.println(arrNilai2[0]);
        System.out.println(arrNilai2[1]);
        System.out.println(arrNilai2[2]);
        System.out.println(arrNilai2[3]);
        
        System.out.println("-----------------------------");
        
        double total = 0;
        
        for(int i=0;i<arrNilai3.length;i++){
            total = total + arrNilai3[i];
        }
        
        double rata2 = total / arrNilai3.length;
        System.out.println(total + "/" + arrNilai3.length + "=" + rata2);
        
        int jmlLulus = 0;
        
        for(int i=0;i<arrNilai3.length;i++){
            if(arrNilai3[i] >= 60){
                jmlLulus = jmlLulus + 1;
            }
        }
        System.out.println("Jumlah mahasiswa lulus :" + jmlLulus);
    }
}
