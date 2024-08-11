import java.util.Scanner;

public class Main {
    static int a;
    public static void main(String[] args) {
        a = inputNumber();
        evenOrOdd();
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
    }
    public static int inputNumber(){
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
    public static void evenOrOdd() {
        if (a % 2 == 0) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}


