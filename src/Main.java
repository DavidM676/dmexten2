import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String exp = scan.nextLine();


        Calculator calc = new Calculator();

        calc.eval(exp);


    }
}
