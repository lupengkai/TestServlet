import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tage on 15-10-4.
 */
public class SetCookies extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (int i = 0; i < 3; i++) {
            Cookie cookie = new Cookie("Session-Cookie-" + i, "Cookie-Value-S" + i);
            resp.addCookie(cookie);
            cookie = new Cookie("Persistent-Cookie-" + i, "Cookie-Value-P" + i);
            cookie.setMaxAge(3600);
            resp.addCookie(cookie);
        }
        resp.setContentType("text/html;charset=gb2312");
        PrintWriter out = resp.getWriter();
        String title = "Setting Cookies";
        out.println("<html><head><title>设置Cookie</title></head>"
                + "<body bgcolor=\"#fdf5e6\">\n" + "<h1 align=\"center\">" + title + "</h1>"
                + "<a href=\"ShowCookies\">\n"
                + "<code>ShowCookies</code>servlet</a></body></html>"
        );
    }
}
