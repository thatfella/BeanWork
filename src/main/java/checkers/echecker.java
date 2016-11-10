package checkers;



public class echecker implements nchecker {

    public String check(int n) {
        String result;
        if (n % 2 == 0) {
            result = "even";
            System.out.println(result);
        } else {
            result = "NOT even";
            System.out.println(result);
        }
        return result;


    }
}