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
        double t;
        double dt;
        double s;
        int d;
        do {
            System.out.print("Введите время начала звонка (0-23 часа, если например время 23:30, то введите 23.5): ");
            t = input.nextDouble();
        } while (!(t >= 0) || !(t < 24));
        do {
            System.out.print("Введите сколько длился звонок в минутах: ");
            dt = input.nextDouble();
        } while (!(dt >= 0));
        do {
            System.out.print("Введите стоимость минуты разговора (в рублях): ");
            s = input.nextDouble();
        } while (!(s >= 0) || !(s < 24));

        do {
            System.out.print("Введите день недели когда начался звонок: ");
            d = input.nextInt();
        } while (!(d > 0) || !(d <= 7));
        double itog = 0;
        int hour = (int) t;
        int minutes = (int)Math.ceil((t-hour)*60);
        System.out.println(hour);
        System.out.println(minutes);
        while(dt>0){
            if (minutes > 59){
                hour += 1;
                minutes = 0;
            }
            if (hour > 23){
                hour = 0;
                d += 1;
            }
            if (d > 7){
                d = 1;
            }
            double sk = 1;
            if(t < 8 || t > 22){
                sk = sk * 0.8;
            }
            if (d == 6 || d == 7){
                sk = sk * 0.7;
            }
            itog = itog + 1 * s * sk;
            dt -= 1;
            minutes += 1;
        }
        System.out.println("Полная стоимость звонка будет равна: " + itog + " рублей");
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