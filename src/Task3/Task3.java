import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        //Создал объект Random

        int[] randomizedArray = new int[random.nextInt(7) + 3];
        //Создал целочисленный массив со случайным размером (от 3 до 10)

        System.out.print("Randomized array: ");
        for (int count = 0 ; count < randomizedArray.length ; count++) {
            randomizedArray[count] = random.nextInt(19) + 1;
            System.out.print(randomizedArray[count] + ", ");
        }
        //Заполнил массив случайными числами от 1 до 20 и вывел в консоль
        System.out.print("\b\b\n");

        System.out.print("Filtered array: ");
        for (int number : randomizedArray) {
            if (number % 3 == 0) {
                System.out.print(number + ", ");
            }
        }
        //Вывел в консоль все числа кратные 3-ём из массива
    }
}