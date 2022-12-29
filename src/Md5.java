import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Md5 {
    public static void main(String[] args) {
        DateTimeFormatter oldPattern = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.of("+05:00")));
        System.out.println(Instant.now().minusSeconds(3600 * 5));
        System.out.println(LocalDateTime.now().format(oldPattern));
        System.out.println(LocalDateTime.now().toInstant(ZoneOffset.UTC));
    }

    public static String getMD5(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }

        return sb.toString();
    }

}
