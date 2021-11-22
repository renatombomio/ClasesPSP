import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import  java.lang.String;
import java.util.Arrays;


public class Padre {
    public static BufferedReader inp;
    public static BufferedWriter out;

    public static void Imprimir (String s){

        System.out.println(s);
    }

    public static String mensaje (String msj){
        String ret;
        try {
            out.write(msj + "\n");
            out.flush();
            ret = inp.readLine();
            return ret;
        }catch (Exception e){

        }
        return  "";
    }

    public static void main(String[] args) {
        String cmd= "ls -l";
        try {
            Process p = Runtime.getRuntime().exec(cmd);
            inp = new BufferedReader(new InputStreamReader(p.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            Imprimir(mensaje ("Hola"));
            Imprimir(mensaje ("soy Renato"));

            mensaje("salir");
            inp.close();
            out.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
        }
    }

