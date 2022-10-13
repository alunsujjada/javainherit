
public class Stack {
    
    final int MAX_DATA = 10;
    int teratas;
    String tumpukan [] = new String [MAX_DATA];
    
    public Stack(){
        teratas = 0;
    }
    
    public boolean empty(){
        return teratas==0;
    }
    
    public String pop(){
        String data=null;
        if(empty()){
           return "Tumpukan Sudah kosong"; 
        }
        else{
            data = tumpukan[MAX_DATA-teratas];
            tumpukan[MAX_DATA-teratas] = null;
            teratas--;
            return data;
        }
    }
    
    public void push(String data){
        if(teratas==MAX_DATA){
            System.out.println("Penuh");
        }
        else{
            teratas++;
            tumpukan[MAX_DATA-teratas] = data;
        }
    }
    
    public void infoStack(){
        for(int i=0;i<tumpukan.length;i++){
            if(tumpukan[i] != null)
            System.out.println(tumpukan[i]);
        }
    }
}
