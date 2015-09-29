import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tage on 15-9-28.
 */
public class TestLifeCycleServlet extends HttpServlet {

    public TestLifeCycleServlet() {
        System.out.println("constructor");
    }

    @Override
    public void destroy() {
        System.out.println("destory");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init");
    }
}
