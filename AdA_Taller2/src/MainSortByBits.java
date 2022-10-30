
import java.io.IOException;
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author ANDRES
 */
public class MainSortByBits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            sortByBits bs = new sortByBits();
            GenerarDatos gd = new GenerarDatos();
            int arr[];
            int numDatos = 2; //Numero de datos que se van a generar "Solo para probar por medio de un IDE".
            arr = new int[numDatos];
            if (args.length == 1 && Integer.parseInt(args[0]) > 0 && Integer.parseInt(args[0]) <= 500 && !args[0].equals("file")) {
                arr = new int[Integer.parseInt(args[0])];
                gd.generarDatos(Integer.parseInt(args[0]));
            } else if (args.length == 2 && args[0].equals("file")) {
                arr = new int[gd.tamArr(args[1])];
                gd.setNombreArchivo(args[1]);
            } else if (numDatos > 0 && numDatos <= 500) {
                gd.generarDatos(numDatos);
            } else{
                arr = new int[10];
                gd.generarDatos(10);
                System.out.println("Numero de datos excedido/dato invalido, se hizo la prueba con 10 datos generados aleatoriamente.");
            }
            System.out.println("El arreglo desordenado es: \n" + Arrays.toString(gd.llenarArreglo(arr)));
            System.out.println("El arreglo ordenado por bits es: \n" + Arrays.toString(bs.sortByBits(gd.llenarArreglo(arr))));
        } catch (Exception e) {
            System.out.println(e+"\n" + "Ingresaste mal un dato, o el nombre del archivo esta mal.\n(Recuerda leer en la documentacion los pasos a seguir para probar el programa correctamente).");
        }
    }

}
