
import java.util.Arrays;
import java.util.Scanner;

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
            int pruebas = 0;
            int j = 0;
            int numDatos = 0;
            if (args.length > 0) {
                pruebas = Integer.parseInt(args[0]);
            }else{
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de pruebas que desea realizar:");
                pruebas = sc.nextInt();
            }
            while (j < pruebas) {
                if (args.length == 2) {
                    numDatos = Integer.parseInt(args[1]);
                }else numDatos = (int) Math.floor(Math.random() * (500 - 0 + 1) + 0);
                SortByBits bs = new SortByBits();
                GenerarDatos gd = new GenerarDatos();
                int arr[];
                arr = new int[numDatos];
                gd.generarDatos(numDatos);
                System.out.println("Prueba " + (j + 1));
                System.out.println("El arreglo desordenado es: \n" + Arrays.toString(gd.llenarArreglo(arr)));
                System.out.println("El arreglo ordenado por bits es: \n" + Arrays.toString(bs.sortByBits(gd.llenarArreglo(arr))));
                j++;
            }
        } catch (Exception e) {
            System.out.println(e + "\n" + "Ingresaste mal un dato.\n(Recuerda leer en la documentacion los pasos a seguir para probar el programa correctamente).");
        }
    }

}
