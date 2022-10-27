import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String exp = scan.nextLine();





        String opps = "*/+-%^";
        int l=-1;




        for (int i = 0; i<exp.length(); i+=1) {
            l = opps.indexOf(exp.substring(i, i+1));
            if (l!=-1) {
                break;
            }
        }

        int n1 = Integer.parseInt(exp.substring(0, l-1));
        int n2 =  Integer.parseInt(exp.substring(l));
        String o = exp.substring(l-1, l);

        Calculator calc = new Calculator();

        calc.eval(n1, n2, o);



    }
}
