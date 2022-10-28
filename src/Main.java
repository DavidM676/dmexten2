import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String exp = scan.nextLine();





        String opps = "*/+-%^";
        int l=-1;
        int i;



        for (i=0; i<exp.length(); i+=1) {
            l = opps.indexOf(exp.substring(i, i+1));
            if (l!=-1) {
                break;
            }
        }

        double n1 = Double.parseDouble(exp.substring(0, i).replaceAll("\\s", ""));
        double n2 = Double.parseDouble(exp.substring(i+1).replaceAll("\\s", ""));


        String o = opps.substring(l, l+1);


        Calculator calc = new Calculator();

        System.out.println(calc.eval(n1, n2, o));



    }
}
