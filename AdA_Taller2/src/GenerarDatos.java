
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ANDRES
 */
public class GenerarDatos {

    public void generarDatos(int n) {
        try {
            String ruta = "pruebaF.txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < n; i++) {
                int valorEntero = (int) Math.floor(Math.random() * (10000 - 0 + 1) + 0);
                bw.write(String.valueOf(valorEntero));
                if (i != n - 1) {
                    bw.write("\n");
                }
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int[] llenarArreglo(int arr[]) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("pruebaF.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            int j = 0;
            while ((linea = br.readLine()) != null) {
                arr[j] = Integer.parseInt(linea);
                //System.out.println(linea);
                j++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arr;
    }
}
