
public class Othello {
    //bw -> bwb -> bbbw -> bbbbw -> wwwww
    public static void main(String[] args) {
        
        String input = "RLRL";
        String board = "bw";
        String result = "";
        
        int jmlb = 0;
        int jmlw = 0;
        
        for(int i=0;i<input.length();i++){
            char in = input.charAt(i);
            
            if(in=='R' && i  % 2==0){
                board += "b";
            }
            else if(in=='R' && i % 2==1){
                board +=  "w";
            }
            
            
            if(in=='L' && i  % 2==0){
                board = "b" + board;
            }
            else if(in=='L' && i  % 2==1){
                board = "w" + board;
            }  
            
            if(board.charAt(0)==board.charAt(board.length()-1)){
                for(int j=0;j<board.length();j++){
                    result = result + board.charAt(0); 
                }
                
                board = result;
                result = "";
           
            }
        }
        
        for(int k=0;k<board.length();k++){
            if(board.charAt(k)=='b'){
                jmlb++;
            }
            else{
                jmlw++;
            }
        }
        System.out.println(jmlb + " " + jmlw);
    }
    
}
