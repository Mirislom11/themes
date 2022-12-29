package NetworkOperation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class Internic {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.internic.net");
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            System.out.println(urlConnection.getContentType());
            System.out.println(urlConnection.getHeaderField(0));
            System.out.println(urlConnection.getRequestMethod());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            /*String line = bufferedReader.readLine();
            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }*/

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
