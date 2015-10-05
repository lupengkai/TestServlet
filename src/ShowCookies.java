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


//读取客户端的Cookie
public class ShowCookies extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=gb2312");
        PrintWriter out = resp.getWriter();
        String title = "Active Cookies";
        out.println("<html><head><title>获取客户端Cookie</title></head>"
                        + "<body bgcolor=\"#fdf5e6\">\n" + "<h1 align=\"center\">" + title + "</h1>\n"
                        + "<table border=1 align=\"center\">\n"
                        + "<tr bgcolor=\"#FFAD00\">\n" + "<th>Cookie Name</th>" + "<th>Cookie Value</th>\n</tr>"
        );
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            Cookie cookie = null;
            for (int i = 0; i < cookies.length; i++) {
                cookie = cookies[i];
                out.println("<tr>\n<td>" + cookie.getName() + "</td>"
                                + "<td>" + cookie.getValue() + "</td>"
                );
            }

        }
        out.println("</table>\n</body>\n</html>");
    }
}
