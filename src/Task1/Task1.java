import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Создал обект scanner для ввода с консоли

        int num = scanner.nextInt();
        //Создал целочисленную переменную num и просвоил значение с консоли
        if (num > 7) {
            System.out.println("Привет");
        }
        //Проверка является ли num больше 7-ми
    }
}