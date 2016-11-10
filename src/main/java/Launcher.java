import checkers.nchecker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class Launcher implements nchecker {
    private List<nchecker> ncheckers;

    public String check(int num) throws Exception {
        for (nchecker NCHECKER : ncheckers) {
            NCHECKER.check(num);
        }
        return "DONE";
    }

    public void setCheckerList(List<nchecker> ncheckers) {
        this.ncheckers = ncheckers;
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("myconfig.xml");
        nchecker ch = (nchecker) ctx.getBean("caller");
        ch.check(22);
    }


}
