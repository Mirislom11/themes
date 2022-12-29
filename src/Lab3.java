import java.util.List;

public class Lab3 {

    public static void main(String[] args) {
        byte[] message = new byte[14];

        // message
        message[0] = 13; //m
        message[1] = 9;  //i
        message[2] = 18; //r
        message[3] = 9;  //i
        message[4] = 18; //s
        message[5] = 11; //l
        message[6] = 14; //o
        message[7] = 12; //m
        message[8] = 25; //z
        message[9] = 14; //o
        message[10] = 9;//i
        message[11] = 18;//r
        message[12] = 14;//o
        message[13] = 21;//v

        byte[] key = new byte[14];

        // key
        key[0] = 10;
        key[1] = 4;
        key[2] = 24;

        for (int i = 3; i < key.length; i++) {
            key[i] = key[(i % 3)];
        }

        byte[] result = new byte[14];

        for (int i = 0; i < message.length; i++) {
            byte cipher = (byte) (message[i] ^ key[i]);
            result[i] = cipher;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " - " + Integer.toBinaryString(result[i]));
        }
    }
}
