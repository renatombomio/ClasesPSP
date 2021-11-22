package Ejercicios;

import java.io.*;
import java.net.*;
import java.sql.SQLOutput;
import java.util.Locale;

public class Ejercicio2 {

    public static void main(String[] args)
    {
        int port = 2050;

        try {
            ServerSocket serverSocket= new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String inputLine =in.readLine();
            System.out.println("Recibir: " +inputLine);
            String outputLine= inputLine.toUpperCase(Locale.ROOT);
            System.out.println("Enviar: "+outputLine);
            out.println(outputLine);

            out.close();
            in.close();

            clientSocket.close();
            serverSocket.close();
        }
        catch (UnknownHostException e){
            System.out.println(e);
        }catch (IOException e){
            System.out.println(e);
        }
        }
}
