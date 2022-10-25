import java.lang.reflect.Method;

public class Calculator {
    private double a;
    private double b;
    private int l;
    String opps = "*/+-%^";
    private Method name;

    public Calculator() {

    }

    public void eval(String x) {

        for (int i = 0; i<x.length(); i+=1) {
            l = opps.indexOf(x.substring(i, i+1));
            System.out.println()
            if (l!=-1) {
                break;
            }
        }
        System.out.println(l);

    }




}
