import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by tage on 11/4/15.
 */
public class ShowSession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(true);

        resp.setContentType("text/html");

        String title = "Session Tracking Example";

        String heading;

        Integer accessCount = (Integer) session.getAttribute("accessCount");
        if (accessCount == null) {
            accessCount = new Integer(0);
            heading = "Welcome Newcomer";
        } else {
            heading = "Welcome Back";
            accessCount = new Integer(accessCount.intValue() + 1);
        }

        session.setAttribute("accessCount", accessCount);
        out.println("<html><head><title>" + title + "</title></head>"
                        + "<body bgcolor=\"#fdf5e6\">\n" + "<h1 align=\"center\">"
                        + heading + "</h1>\n"
                        + "<h2>Information on Your Session:</h2>\n"
                        + "<table border=1 align=\"center\">\n"

                        + "<tr bgcolor=\"#ffado0\">\n" + "<th>Info Type</th><th>Value</th>\n</tr>"
                        + "<tr><td>ID</td><td>" + session.getId() + "</td></tr>"
                        + "<tr><td>Creation Time</td><td>" + new Date(session.getCreationTime()) + "</td></tr>"
                        + "<tr><td>Time of Last Access</td><td>" + new Date(session.getLastAccessedTime()) + "</td></tr>"
                        + "<tr><td>Number of Previous Access</td><td>" + session.getAttribute("accessCount") + "</td></tr>"
                        + "</table></body></html>"

        );

    }
}
