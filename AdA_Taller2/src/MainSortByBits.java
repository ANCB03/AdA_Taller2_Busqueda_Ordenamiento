
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
        // TODO code application logic here
        sortByBits bs = new sortByBits();
        GenerarDatos gd = new GenerarDatos();
        int arr[];
        int numDatos = 5; //Numero de datos que se van a generar "Solo para probar por medio de un IDE".
        arr = new int[numDatos];
        if(args.length!=0 && Integer.parseInt(args[0])>0 && Integer.parseInt(args[0])<=500){
            arr = new int[Integer.parseInt(args[0])];
            gd.generarDatos(Integer.parseInt(args[0]));
        }else if(numDatos>0 && numDatos<=500){
            gd.generarDatos(numDatos);
        }else{
            arr = new int[10];
            gd.generarDatos(10);
            System.out.println("Numero de datos excedido/dato invalido, se hizo la prueba con 10 datos generados aleatoriamente.");
        }
        System.out.println("El arreglo desordenado es: \n" + Arrays.toString(gd.llenarArreglo(arr)));
        System.out.println("El arreglo ordenado por bits es: \n" + Arrays.toString(bs.sortByBits(gd.llenarArreglo(arr))));
    }
    
}
