package url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectExampleOne {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.zippopotam.us/us/33162");
            URLConnection connection = url.openConnection();

            InputStream stream = connection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
            String line  = bufferedReader.readLine();
            while (line != null) {
                System.out.print(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
