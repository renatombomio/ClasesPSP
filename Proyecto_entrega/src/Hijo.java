import java.io.*;

public class Hijo {

    static BufferedReader bufferedReader;
    static BufferedWriter bufferedWriter;

    static {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            File f = new File("e:\\RENATO.txt");
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), "GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String leerProcesoPadre() throws Exception {
        String result = bufferedReader.readLine();
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) throws Exception {
        File f = new File("e:\\111.txt");
        String s = leerProcesoPadre();
        bufferedWriter.write(s);
        System.out.println("sub class");
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }

}
