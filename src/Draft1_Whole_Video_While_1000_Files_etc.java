// Задание здесь: https://lms.synergy.ru/learning/view/68550/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

import java.io.IOException;
import java.util.Scanner;

public class Draft1_While_1000_Files_etc {
    public static void main(String[] args) {

//        1 код
//        int x = 1;
//        while (x < 11) {  // ввидео мин 02.15
////            File file = new File("C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\files\\" + "File" + x);
//            System.out.println("Loop can do a lot of things.");
//            File file = new File("files\\" + "File" + x);
//            file.createNewFile();
//            x = x + 1;
//        }

//        2 код
//        int x = 1;
//        while (x < 6) {  // видео мин 11.59
//            System.out.print("\t" + x);
//            x++;
//        }

//        3 код
//        int x = 100;
//        while (x >= 50) {  // видео мин 11.59
//            System.out.print("\t" + x);
//            x--;
//        }

//        4 код
//        int x = 1;
//        while (x <= 50) {  // видео мин 15.35
//            if (x % 2 == 0) {
//            System.out.print("\t" + x);
//            }
//            x++;
//        }

//        Код 5
//        int x = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (x != 777) {
//            System.out.println(x + " это не 777");
//            System.out.println("Введите x: ");
//            x = scanner.nextInt();
//        } System.out.println("Bы ввели 777");

//        Код 5
        String str = "";
        Scanner scanner = new Scanner(System.in);
        while (!str.equals("Хватит")) {
            System.out.println("Еще не хватит");
            System.out.println("Введите строку: ");
            str = scanner.nextLine();
        } System.out.println("Ладно, достаточно");

//        Код 6
//        factorial здесь видео мин 28.09 https://lms.synergy.ru/learning/view/68494/?groupPeriodId=1045153&disciplineVersionId=25858&start=1

    }
}
