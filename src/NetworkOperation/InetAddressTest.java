package NetworkOperation;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = null;
        try {
            Address = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(Address);

        Address = InetAddress.getByName("www.HerbSchildt.com");
        System.out.println(Address);

        InetAddress SW [] = InetAddress. getAllByName ( "www.nba.com");
        for (InetAddress inetAddress : SW) {
            System.out.println(inetAddress);
        }


    }
}
