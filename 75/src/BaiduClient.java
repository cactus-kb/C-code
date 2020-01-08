import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class BaiduClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("45.40.254.164",80);
        String request = "GET / HTTP/1.0\r\nHost: www.bitedu.vip\r\n\r\n";
        socket.getOutputStream().write(request.getBytes("UTF-8"));
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        byte[] buf = new byte[8192];
        socket.getInputStream().read(buf);
        socket.close();
    }
}
