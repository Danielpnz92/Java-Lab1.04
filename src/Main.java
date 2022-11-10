import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] test= {9,10,5,4,7,8,3};
        masPeq(test);
        System.out.println(diferencia(test));
        System.out.println(oper(2,5));
    }

    //Write a method in Java to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
    public static int diferencia (int[] lista){
        if (lista.length>0){
            int max=0;
            int min=9999;
            for (int i : lista) {
                max= (i > max) ? max=i : max;
                min= (i < min) ? min=i : min;
            }
            return max-min;
        }else{
            return 0;
        }
    }

    //Write a method in Java to find the smallest and second smallest elements of a given array and print it in the console.
    public static void masPeq(int[] lista){
        if (lista.length>1){
            int min=9999;
            int j=0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i]<min){
                    min=lista[i];
                    j=i;
                }
            }
            //se crea otro array sin el elemento más bajo
            int[] listaReducida = new int[lista.length-1];
            int k=0;
            for (int i = 0; i < listaReducida.length+1; i++) {
                if (i != j){
                    listaReducida[k]=lista[i];
                    k++;
                }
            }
            //se busca el menor para ese array reducido
            int min2=9999;
            j=0;
            for (int i = 0; i < listaReducida.length; i++) {
                if (listaReducida[i]<min2){
                    min2=listaReducida[i];
                    j=i;
                }
            }

            System.out.println("Los dos números menores son: "+ min + " y "+ min2);
        }else {
            System.out.println("Error");
        }
    }

    //Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.
    public static double oper (int x, int y){
        return Math.pow(x, 2) + Math.pow((4/5*y-x),2);
    }
}
