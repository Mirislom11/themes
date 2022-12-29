package url;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionExampleThree {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://randomuser.me/api/");
            URLConnection connection = url.openConnection();

            InputStream stream = connection.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            int len = stream.available();
            byte[] data = new byte[len];
            int n;

            while ((n = stream.read(data)) > 0) {
                baos.write(data, 0, n);
            }

            String content = new String(baos.toByteArray(), "UTF-8");
            System.out.println(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
