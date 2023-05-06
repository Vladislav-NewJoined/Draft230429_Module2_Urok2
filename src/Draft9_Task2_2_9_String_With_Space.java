import java.util.Scanner;


/* 9.	Пока пользователь не введёт строку, содержащую пробел, считывайте строки и выводите их первые буквы*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494


public class Draft9_Task2_2_9_String_With_Space {

    //        Пример 3 ППППППППППППППППППППППППППППППППППП Первый счетчик УДАЛСЯ!!!!!!!!!!!!!!!!!! без вывода первой буквы
    public static void main(String[] args) {

        String strEntered;

        Scanner scanner = new Scanner(System.in); // видео мин 23.05
        int i = 1;
        System.out.print("Введите строку: ");

        // Задаем действия для первого счетчика
        while (i == 1) {
            strEntered = scanner.nextLine();
            if (!strEntered.contains(" ")) {
                System.out.println("Строка не содержит пробела.");
                System.out.println("Первая буква строки: " + strEntered.charAt(0));
                System.out.print("\nВведите другую строку: ");
            } else {
                System.out.println("Строка содержит пробел!" + "\nПервая буква строки: " + strEntered.charAt(0) + "\nКонец программы!");
                break;
            }
        }
} //        Конец Примера 3 КККККККККККККККК







//    //        Пример 2 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) {
//        System.out.println("Задание: \n9.\tПока пользователь не введёт строку, " +
//                "содержащую пробел, считывайте строки и выводите их первые буквы\n");
//        System.out.println("Решение: ");
//
//        String strEntered = "";
//        Scanner scanner = new Scanner(System.in); // видео мин 23.05
//        int i = 1;
//
//        while (i == 1) {
//            System.out.print("Введите строку: ");
//            strEntered = scanner.nextLine();
//            while (!strEntered.contains(" ")) {
//                System.out.println("Строка не содержит пробела.");
//                i++;
//            }
//            System.out.println("Строка содержит пробел! Конец программы!");
//            break;
//        }
//        System.out.print("Введите строку: ");
//        strEntered = scanner.nextLine();
//        while (!strEntered.contains(" ")) {
//            System.out.println("Строка не содержит пробела.");
//            i++;
//        }
//            //        System.out.print("Введите строку: ");
////        strEntered = scanner.nextLine();
//        System.out.println("Строка содержит пробел! Конец программы!");
//    } //        Конец Примера 2 КККККККККККККККК








//    //        Пример 1 ПППППППППППППППППППППППППППППППП // из задания 7
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n9.\tПока пользователь не введёт строку, " +
//                "содержащую пробел, считывайте строки и выводите их первые буквы\n");
//        System.out.println("Решение: ");
//
//
//        System.out.println("Создаем файл 'textForTask_7.txt'. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nВенесуэлла\n");
//        String secrWord = "Каракас";
//        File myFile = new File("src\\" + "textForTask_7.txt");
//
//        try {
//            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, false)));
//            writer.println("Каракас");
//            writer.flush();
//            writer.close();
//            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//            writer2.println("Венесуэлла");
////            writer2.flush();
//            writer2.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
////        String str = ""; // видео мин 23.05
//        Scanner scanner = new Scanner(System.in); // видео мин 23.05
//        System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
//        String str = scanner.nextLine();
//
//        while (!str.equals("Каракас")) {
//            if ((secrWord.contains(str)) && (!str.equals(""))) {
//                System.out.println("Горячо.");
//                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
//                str = scanner.nextLine();
////            } else if (str.equals(secrWord)) {
////                System.out.println("Правильно!");
//            } else {
//                System.out.println("Не верно.");
//                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
//                str = scanner.nextLine();
//            }
//        }
//        System.out.println("Правильно!");
//    } //        Конец Примера 1 ККККККККККККККККК


}