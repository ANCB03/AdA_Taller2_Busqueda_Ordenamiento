
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ANDRES
 */
public class SortByBits {

    public int[] sortByBits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {//1+1+1 (1+1)
            arr[i] += Integer.bitCount(arr[i]) * 10001; //2+1  (6n)
            // 100001 corresponde al tamaño maximo de los elementos (10^4)
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {//1+1 (1+1)
            arr[i] = arr[i] % 10001;//1+1 (5n)
        }
        return arr;//1  T(n)=11n+1 ,  O(N).
    }

}
