import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by tage on 15-10-3.
 */
public class ShowParameters extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=gb2312");
        PrintWriter out = resp.getWriter();
        String title = "Reading All Request Parameters";
        out.println("<html><head><title>读取所有参数</title></head>"
                + "<body bgcolor='#fdf5e6'>\n" + "<h1 align=center>" + title
                + "</h1>\n" + "<table border=1 align=center>\n"
                + "<tr bgcolor=\"#ffad00\">\n"
                + "<th>Parameters Name</th><th>Parameter Values</th></tr>"
        );
        Enumeration paramNames = req.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = (String) paramNames.nextElement();
            out.println("<tr><td>" + paramName + "</                                        td>");
            out.println("<td>");
            String[] paramValues = req.getParameterValues(paramName);
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0)
                    out.println("<i>No Value</i>");
                else
                    out.println(paramValue);
            }
            else {
                out.println("<ul>");
                for (int i = 0; i < paramValues.length; i++) {
                    out.println("<li>" + paramValues[i]);
                }
                out.println("</ul>");
            }
            out.println("</td>");
            out.println("</tr>");
        }
        out.println("</table>\n</body></html>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
