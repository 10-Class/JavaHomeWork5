package homework5;

public class HomeWork5 {
    public static void main(String[] args) {
        /* 1. Напишите с помощью switch функцию,
        которая принимает на вход название валюты и возвращает ее международный код.
        Для японской йены, английского фунта, доллара сша, евро и монгольского тугрика.
        Коды валют посмотрите в интернет. Например: "евро" -> "EUR" */
        System.out.println(internationalCode("японская йена"));
        System.out.println(internationalCode("английский фунт"));
        System.out.println(internationalCode("доллар сша"));
        System.out.println(internationalCode("евро"));
        System.out.println(internationalCode("монгольский тугрик"));
        System.out.println(internationalCode("злотый"));

        /* 2. Напишите функцию, которая реализует выбор цифры при нажатии на буквы на телефонном номеронаберателе.
        Функция должна принимать на вход символ и возвращать целое число.
        Буквам 'A','B','C' соответствует цифра 2, буквам 'D','E','F'
        соответствует 3, GHI 4, JKL 5 , MNO 6 , PQRS 7 , TUV 8 , WXYZ 9 . Пример: 'P' -> 7 */
        System.out.println("A -> " + phone('A'));
        System.out.println("D -> " + phone('D'));
        System.out.println("G -> " + phone('G'));
        System.out.println("J -> " + phone('J'));
        System.out.println("M -> " + phone('M'));
        System.out.println("P -> " + phone('P'));
        System.out.println("T -> " + phone('T'));
        System.out.println("W -> " + phone('W'));

        /* *3 Напишите функцию которая принимает на вход трехзначное целое число
        и возвращает самую большу цифру. Например: 382->8 */
        number(382);
        number(493);

    }//main

    //1
    public static String internationalCode(String c) {
        return switch (c) {
            case "японская йена" -> c + " -> " + "JPY";
            case "английский фунт" -> c + " -> " + "GBP";
            case "доллар сша" -> c + " -> " + "USD";
            case "евро" -> c + " -> " + "EUR";
            case "монгольский тугрик" -> c + " -> " + "MNT";
            default -> c + " -> " + "Валюта не найдена!";
        };
    }

    //2
    public static int phone(char b) {
        return switch (b) {
            case 'A', 'B', 'C' -> 2;
            case 'D', 'E', 'F' -> 3;
            case 'G', 'H', 'I' -> 4;
            case 'J', 'K', 'L' -> 5;
            case 'M', 'N', 'O' -> 6;
            case 'P', 'Q', 'R', 'S' -> 7;
            case 'T', 'U', 'V' -> 8;
            case 'W', 'X', 'Y', 'Z' -> 9;
            default -> -1;
        };
    }

    //3
    public static void number(int g){
        int f1 = g / 100;
        int f2 = g / 10 - (f1 * 10);
        int f3 = g - ( f1 * 100) - (f2 * 10);
        if (f3 > f1 && f3 > f2) {
            System.out.println(g + " -> " + f3);
        } else if (f2 > f1 && f2 > f3) {
            System.out.println(g + " -> " + f2);
        }else if (f1 > f2 && f1 > f3) {
            System.out.println(g + " -> " + f1);
        }else if (f1 == f2 && f2 == f3) {
            System.out.println(g + " -> равны");
        }else {
            System.out.println("неверное число");
        }

    }

}
