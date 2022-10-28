import java.lang.reflect.Method;

public class Calculator {
    private String opps = "*/+-%^";
    private String str;

    public Calculator() {


    }

    public double eval(double a, double b, String x) {
        int y = opps.indexOf(x);
        switch (y) {
            case 0:
                return a*b;
            case 1:
                return a/b;
            case 2:
                return a+b;
            case 3:
                return a-b;
            case 4:
                return a%b;
            case 5:
                return Math.pow(a, b);
            default:
                break;
        }


        return 0.0;
    }




}
