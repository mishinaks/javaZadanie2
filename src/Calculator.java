import java.util.Scanner; // Импортирование класса Scanner

/**
 * @author Mishna Christina
 * @see #main(String[])
 */

//Описание класса Calculator:
public class Calculator {
    //Описание главного метода программы:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//Создание объекта in класса Scanner
        /*Считывание перого числа.
        Запись первого числа в переменную x.*/
        System.out.println("Enter the first number: ");
        double x = in.nextDouble();
        /*Считывание второго числа.
        Запись второго числа в переменную y.*/
        System.out.println("Enter the second number: ");
        double y = in.nextDouble();
        //Получение суммы двух чисел:
        double result = x + y;
        System.out.printf("Sum is:  %.4f", result);//Вывод результата на консоль
    }
}