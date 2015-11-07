import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tage on 11/5/15.
 */
public class TestServletContext extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletContext application = this.getServletContext();

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        Integer accessCount = (Integer) application.getAttribute("accessAcount");

        if (accessCount == null) {
            accessCount = new Integer(0);
        } else {
            accessCount = new Integer(accessCount.intValue() + 1);
        }

        application.setAttribute("accessAcount", accessCount);

        out.println("<html><head></head><body><h1 align=\"center\">" +
                accessCount +
                "</h1></body></html>");
    }
}
