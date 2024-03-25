import java.util.Random;
public class Array {
    public static void main(String[] args) {
        int[] array = new int[9];
        new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomNumberGenerator.generateRandomNumber() ;
        }
        for (int num : array) {
            System.out.println(num);
        }
    }
}
