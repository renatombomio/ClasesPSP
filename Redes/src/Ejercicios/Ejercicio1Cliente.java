package Ejercicios;


import java.net.*;

public class Ejercicio1Cliente {

    public static void main(String[] args) throws Exception {
        String Host = "localhost";
        int Puerto= 6000;//puerto remoto
        //ABRIR SOCKET
        Socket Cliente = new Socket(Host, Puerto);//conecta
        InetAddress i= Cliente.getInetAddress();
        System.out.println ("Puerto local:  "+ Cliente.getLocalPort());
        System.out.println  ("Puerto Remoto:  "+ Cliente.getPort());
        System.out.println ("Host Remoto:  "+ i.getHostName() .toString());
        System.out.println ("IP Host Remoto:  "+ i.getHostAddress() .toString());
        Cliente.close();// Cierra el socket


    }
}
