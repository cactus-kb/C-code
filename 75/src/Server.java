import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ServerSocket serverSocket = new ServerSocket(9876);
        System.out.println("LISTENING");
        scanner.nextLine();
        System.out.println("等待客户端连接");
        Socket socket = serverSocket.accept();
        System.out.println("ESTABLESHED");
        System.out.println("等待客户端先调用close");
        System.out.println("CLOSE_WAIT");
        scanner.nextLine();
        socket.close();//关闭连接
        System.out.println("真正关闭");
    }

}
