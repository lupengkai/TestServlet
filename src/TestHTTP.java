import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by tage on 15-9-27.
 */
public class TestHTTP {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",8080);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bw.write("GET / HTTP/1.1");
        bw.newLine();
        bw.write("Host: localhost:8080");
        bw.newLine();
        bw.write("Content-Type: text/html");
        bw.newLine();
        bw.newLine();
        bw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        bw.close();
        br.close();
        s.close();
    }
}
