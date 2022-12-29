package NetworkOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExampleServerSocket {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1212);
            Socket socket = serverSocket.accept();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            String line = bufferedReader.readLine();
            while (line != null){
                System.out.println("You have send: " + line);
                printWriter.write("You have send: " + line);
                line = bufferedReader.readLine();
                if (line.equals("Exit")){
                    break;
                }
            }
        }catch (IOException e){

        }
    }
}
