import java.io.*;
import java.util.*;
import java.net.*;

class Server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String server = "";
        String client = "";

        while (client != "Stop") {
            client = dis.readUTF();
            System.out.println("Received message from client:" + " " + client);
            server = br.readLine();
            dos.writeUTF(server);
            dos.flush();
        }

        dis.close();
        s.close();
        ss.close();
    }
}
