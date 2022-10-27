import java.lang.reflect.Method;

public class Calculator {
    private String opps = "*/+-%^";

    public Calculator() {

    }

    public void eval(int a, int b, String x) {
        int y = opps.indexOf(x);
        System.out.println(y);
        switch (y) {
            case 0:
                return a*b;
                break;
        }



    }




}
