package NetworkOperation;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Whois {
    public static void main(String args[]) throws Exception {
        int c;

        Socket socket = new Socket("whois.internic.net", 43);
        socket.setSoTimeout(10000);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        String str ="OraclePressBooks.com";

        byte buf[] = str.getBytes(StandardCharsets.UTF_8);

        outputStream.write(buf);

        while ( (c = inputStream.read()) != -1){
            System.out.print((char) c);
        }
        socket.close();
    }
}
