import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Выберите номер задание:\n" +
                "1. Задача о закрашенной области\n" +
                "2. Задача о звонке и его стоимости\n" +
                "3. Задача про условие");
        int num = input.nextInt();
        switch (num){
            case 1 -> zad1();
            case 2 -> zad2();
            case 3 -> zad3();
            default -> System.out.println("Задание выбрано неправильно, ухади!!");
        }
    }
    public static void zad1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = input.nextDouble();
        System.out.print("Введите y: ");
        double y = input.nextDouble();
        if (Math.abs(x) <= 1 && Math.abs(y) <= 1 && Math.abs(x) + Math.abs(y) >= 1){
            System.out.println("Точка находится в закрашенной области");
        }
        else {
            System.out.println("Неверно. Точка вне закрашенной области");
        }
    }
    public static void zad2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите время начала звонка (0-23 часа): ");
        int t = input.nextInt();
        System.out.print("Введите сколько длился звонок в минутах: ");
        int dt = input.nextInt();
        System.out.print("Введите стоимость минуты разговора: ");
        double s = input.nextDouble();
        System.out.print("Введите день недели когда начался звонок: ");
        int d = input.nextInt();
        double sk = 1;
        if(t < 8 || t > 22){
            sk = sk * 0.8;
        }
        if (d == 6 || d == 7){
            if (sk == 0.8){
                System.out.println("Скидка составит 30%");
                sk = 0.7;
            }
            else {
                System.out.println("Скидка составит 20%");
            }
        }
        System.out.println("Полная стоимость звонка будет равна: " + s * sk * dt);
    }
    public static void zad3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Какое условие запустить(1-2)? ");
        int num = input.nextInt();
        switch (num){
            case 1 -> {
                System.out.print("Введите A: ");
                int a = input.nextInt();
                System.out.print("Введите B: ");
                int b = input.nextInt();
                System.out.println(a%2==0 || b%2==0);
            }
            case 2 -> {
                System.out.print("Введите A: ");
                int a = input.nextInt();
                System.out.print("Введите B: ");
                int b = input.nextInt();
                System.out.print("Введите C: ");
                int c = input.nextInt();
                System.out.println(a%3==0 && b%3==0 && c%3==0);
            }
        }

    }
}