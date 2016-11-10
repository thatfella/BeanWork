package checkers;


public class fchecker implements nchecker {
    public String check(int n) {
        String result;
        if (n == 21) {
            result = "My Favourite";
            System.out.println(result);
        } else {
            result = "NOT myfav";
            System.out.println(result);
        }
        return result;


    }
}
