import java.util.Scanner;

public class mainNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int n = in.nextInt();
        
        Number num = new Number();
        Cube c = new Cube();
        Square s = new Square();

        num.returnValueToMain(n);
        s.returnValueToMain(n);
        c.returnValueToMain(n);
     
        in.close();
    }
}
