
import java.util.ArrayList;

public class MyList {
    
    public static void main(String[] args) {
        ArrayList listKota = new ArrayList();
        ArrayList <String> listKotaJabar = new ArrayList <String>();
        
        listKotaJabar.add("Sukabumi");
        listKotaJabar.add("Cianjur");
        listKotaJabar.add("Bandung");
          
        System.out.println(listKotaJabar);
        
        listKotaJabar.add(0, "Ciamis");
        
        System.out.println(listKotaJabar);
        listKotaJabar.add(4, "Garut");
        
        System.out.println(listKotaJabar);
        
        listKotaJabar.set(0, "Purwakarta");
        System.out.println(listKotaJabar);
        
        listKotaJabar.remove(0);
        for(int i=0;i<listKotaJabar.size();i++){
            System.out.println(listKotaJabar.get(i));
        }
        
        listKotaJabar.clear();
        System.out.println(listKotaJabar);
        
    }
    
}
