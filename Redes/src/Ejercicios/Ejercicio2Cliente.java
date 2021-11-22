package Ejercicios;

import java.io.*;
import java.net.*;

public class Ejercicio2Cliente {

    public static void main(String[] args) {
        int port= 2050;
        try {
            Socket clientSocket = new Socket("192.168.1.37",port);

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            System.out.println("enviar: Hola bro");
            out.println("Hola bro");
            System.out.println("Recibir: "+ in.readLine());

            out.close();
            in.close();
            clientSocket.close();
        }
        catch (UnknownHostException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
    }

}
