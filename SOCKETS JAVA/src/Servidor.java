import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) {

        ServerSocket servidor = null;
        Socket socket = null;
        DataInputStream in;
        DataOutputStream out;

        final int PUERTO = 5000;

        try {
            servidor = new ServerSocket (PUERTO);
            System.out.println("Servidor iniciado");

            while (true){

                socket = servidor.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());

                String mensaje = in.readUTF();
                System.out.println(mensaje);
                out.writeUTF("Hola Renato.");

                socket.close();
                System.out.println("Cliente desconectado");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

