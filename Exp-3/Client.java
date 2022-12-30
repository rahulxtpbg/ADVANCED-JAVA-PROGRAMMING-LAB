import java.io.*;
import java.util.*;
import java.net.*;

class Client {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 9999);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String server = "";
        String client = "";

        while (server != "Stop") {
            client = br.readLine();
            dos.writeUTF();
            dos.flush();
            server = dis.readUTF();
            Sytem.out.println("Received message from server:" + " " + server);
        }

        dos.close();
        s.close();
    }
}
