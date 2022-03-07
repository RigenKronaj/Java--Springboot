import java.util.Scanner;

public class OperationMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();

        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();

        add.operations(a, b);
        sub.operations(a, b);
        mul.operations(a, b);
        div.operations(a, b);

        in.close();
    }
}
