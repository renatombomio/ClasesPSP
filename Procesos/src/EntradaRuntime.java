import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EntradaRuntime {
    public static void main(String[] args) {

        //hacer el Runtime/tiempo de ejecucion en Java

        Runtime builder = Runtime.getRuntime();

        //ejecutar linea de comando
        String cmd = "ls -l";

        try {
            //ejecutar el comando y guardar el proceso fuera
            Process out = builder.exec(cmd);
            //coger el resultado e imprimirlo en pantalla
            BufferedReader bf= new BufferedReader(new InputStreamReader(out.getInputStream()));
            String linea;
            while ( (linea= bf.readLine()) != null){
                System.out.println(linea);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
