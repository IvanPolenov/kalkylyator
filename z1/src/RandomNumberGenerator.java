import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(6901) + 100;
    }
    public static void main(String[] args) {
        int randomNumber;
        randomNumber = generateRandomNumber();
        System.out.println(STR."Случайное число: \{randomNumber}");
    }
}