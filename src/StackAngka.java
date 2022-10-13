
public class StackAngka {
    
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.pop());
        s.infoStack();
        System.out.println(s.empty());
        System.out.println("-------------------------------");
        s.push("1");
        System.out.println(s.empty());
        s.push("2");
        s.push("3");
        s.push("4");
        s.push("5");
        s.push("6");
        s.push("7");
        s.push("8");
        
        s.infoStack();
        System.out.println("--------------------------------");
        System.out.println("Data yang dihapus adalah :" + s.pop());
        System.out.println("Data yang dihapus adalah :" + s.pop());
        s.infoStack();
    }
    
}
