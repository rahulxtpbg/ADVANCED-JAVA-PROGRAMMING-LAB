import java.io.*;
import java.util.*;
import java.net.*;

class Reader {
    public static void main(String args[]) {
        try {
            URL u = new URL(
                    "https://www.theverge.com/23523563/read-microsoft-response-ftc-antitrust-complaint-activision-blizzard-king");
            URLConnection uc = u.openConnection();
            InputStream str = uc.getInputStream();
            int i;
            while ((i = str.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
