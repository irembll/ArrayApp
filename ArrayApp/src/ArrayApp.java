import java.util.Random;
import java.util.Scanner;


public class ArrayApp {


    public static void array1D_print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1 + " inci elemanı: " + array[i]);
        }
    }
    public static void addvals_array1D(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(51);  //0-50 arası rastgele üretilen sayıyı atarız
        }
    }

    public static void dizialma(int[] array) {
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println( (i+1) + " inci elemanını giriniz " );
            array[i] = sc.nextInt();
        }
    }
}
