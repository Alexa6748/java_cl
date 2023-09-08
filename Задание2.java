import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.println("До замены: a = " + a + ", b = " + b);
        
        swap(a, b);
        
        System.out.println("После замены: a = " + a + ", b = " + b);
    }
    
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
