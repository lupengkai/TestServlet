import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Created by tage on 11/5/15.
 */
public class ShowRs extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Connection coon = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/testJDBC";

        resp.setContentType("text/html");
        resp.setCharacterEncoding("gb2312");
        PrintWriter out = resp.getWriter();


        try {
            Class.forName("com.mysql.jdbc.Driver");
            coon = DriverManager.getConnection(url, "root", "0715");
            stmt = coon.createStatement();
            rs = stmt.executeQuery("select * from student");
            out.println("<html><head></head><body>");
            out.println("<table border=1>");
            out.println("<tr><th>Content</th></tr>");
            while (rs.next()) {
                out.println("<tr><td>" +
                        rs.getString("studentName") +
                        "</td></tr>");
            }


            out.println("</table></body></html>");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (null != stmt) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (null != coon) {
                try {
                    coon.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
