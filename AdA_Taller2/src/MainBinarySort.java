
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ANDRES
 */
public class MainBinarySort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinarySort bs = new BinarySort();
        GenerarDatos gd = new GenerarDatos();
        int arr[];
        int numDatos = 15; //Numero de datos que se van a generar "Solo para probar por un IDE".
        arr = new int[numDatos];
        if(args.length!=0 && Integer.parseInt(args[0])>0 && Integer.parseInt(args[0])<=500){
            arr = new int[Integer.parseInt(args[0])];
            gd.generarDatos(Integer.parseInt(args[0]));
        }else{
            gd.generarDatos(numDatos);
        }
        System.out.println(Arrays.toString(bs.sortByBits(gd.llenarArreglo(arr))));
    }
    
}
