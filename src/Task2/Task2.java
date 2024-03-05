import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Создал обект scanner для ввода с консоли

        String name = scanner.nextLine();
        //Создал строчную переменную name и просвоил значение с консоли
        switch (name) {
            case "Вячеслав" : {
                System.out.println("Привет, Вячеслав");
                break;
            }
            default: {
                System.out.println("Нет такого имени");
                break;
            }
        }
        //Проверка равно ли name "Вячеслав"
    }
}