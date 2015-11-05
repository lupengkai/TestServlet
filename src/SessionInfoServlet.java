import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tage on 11/4/15.
 */
public class SessionInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession mySession = req.getSession(true);

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Session Info Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Session Information</h3>");
        out.println("New Session: " + mySession.isNew());
        out.println("<br>Session ID: " + mySession.getId());
        out.println("<br>Session Creation Time: " + new java.util.Date(mySession.getCreationTime()));
        out.println("<br>Session Last Accessed Time: " + new java.util.Date(mySession.getLastAccessedTime()));
        out.println("<h3>Request Information</h3>");
        out.println("Session ID from Request: " + req.getRequestedSessionId());
        out.println("<br>Session ID via Cookie: " + req.isRequestedSessionIdFromCookie());
        out.println("<br>Session ID via rewritten URL: " + req.isRequestedSessionIdFromURL());
        out.println("<br>Valid Session ID: " + req.isRequestedSessionIdValid());
        out.println("<br><a href=" + resp.encodeURL("SessionInfoServlet") + ">refresh</a>");
        out.println("</body></html>");
        out.close();

    }
}
