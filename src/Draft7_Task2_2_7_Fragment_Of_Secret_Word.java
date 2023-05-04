import java.io.*;
import java.util.Scanner;


/* 7.	Предыдущее задание, но если пользователь ввел хотя бы часть слова верно, то писать: горячо.
(Проверять с помощью str.contains).*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494


public class Draft7_Task2_2_7_Fragment_Of_Secret_Word {
    // Как создать файл .txt и как сделать запись в него, инфо здесь: https://yandex.ru/video/preview/9761637152705084468

    //        Пример 5 УДАЛСЯ!!!!!!!!!!!!!!!!!! ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП

    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n7.\tПредыдущее задание, но если пользователь ввел хотя бы часть слова верно, \nто писать: горячо. (Проверять с помощью str.contains).\n");
        System.out.println("Решение: ");


        System.out.println("Создаем файл 'textForTask_7.txt'. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nВенесуэлла\n");
        String secrWord = "Каракас";
        File myFile = new File("src\\" + "textForTask_7.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, false)));
            writer.println("Каракас");
            writer.flush();
            writer.close();
            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer2.println("Венесуэлла");
//            writer2.flush();
            writer2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        String str = ""; // видео мин 23.05
        Scanner scanner = new Scanner(System.in); // видео мин 23.05
        System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
        String str = scanner.nextLine();

        while (!str.equals("Каракас")) {
            if ((secrWord.contains(str)) && (!str.equals(""))) {
                System.out.println("Горячо.");
                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
                str = scanner.nextLine();
//            } else if (str.equals(secrWord)) {
//                System.out.println("Правильно!");
            } else {
                System.out.println("Не верно.");
                System.out.println("Введите другую строку (т.е. предполагаемое секретное слово): ");
                str = scanner.nextLine();
            }
        }
        System.out.println("Правильно!");
    } //        Конец Примера 5 ККККККККККККККККККККККККККККККККККК


//    //        Пример 1.2. ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n7.\tПредыдущее задание, но если пользователь ввел хотя бы часть слова верно, \nто писать: горячо. (Проверять с помощью str.contains).\n");
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
////// Проверяем, отгадано или нет секретное слово.
////        String str = ""; // видео мин 23.05
////        Scanner scanner = new Scanner(System.in);
//////        while (!str.equals("Каракас")) {
////            System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////            str = scanner.nextLine();
////
////            while (str.contains(secrWord)) {  // первый while
////                System.out.println("Горячо.");
////                System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                str = scanner.nextLine();
////
////
////
//////                while (!str.equals("Каракас")) {  // второй встроенный while
//////                    System.out.println("Не верно.");
//////                    System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
//////                    str = scanner.nextLine();
//////                }  // конец второго while
////
////
////
////
////
////
////            } // конец первого while
////            System.out.println("Правильно!");
////
//////        }
//
//        String str = ""; // видео мин 23.05
//        Scanner scanner = new Scanner(System.in);
////        while (!str.equals("Каракас")) {
//        System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
//        str = scanner.nextLine();
//
//        if ((secrWord.contains(str)) && (!str.equals(secrWord)) && (!str.equals(""))) {
//            System.out.println("Горячо.");
//        } else if (str.equals(secrWord)) {
//            System.out.println("Правильно!");
//        } else {
//            System.out.println("Не верно.");
//            System.out.println("Ведите другое слово.");
//        }
//
////        //        Пример из задания 6
////
////        public static void main(String[] args) throws IOException {
////            System.out.println("Задание: \n6.\tВ файле две строки: секретное слово и подсказка. \nВывести подсказку. Считывать строку за строкой, пока игрок \nне отгадает секретное слово(не введёт его)\n");
////            System.out.println("Решение: ");
////
//////        File myFile = new File("src\\");
//////        myFile.createNewFile();
//////        String str = "";
//////        Scanner scanner = new Scanner(System.in);
//////        while (!str.equals("Хватит")) {
//////            System.out.println("Еще не хватит");
//////            System.out.println("Введите строку: ");
//////            str = scanner.nextLine();
//////        }
//////        System.out.println("Ладно, достаточно");
////
//////            try {
//////                Printwriter writer =
//////                        new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//////                writer.println("Каракас");
//////                writer.flush();
//////                writer.close();
//////            }catch (IOException ex){
//////                ex.printStackTrace();
//////            }
////        System.out.println("Создаем файл txt. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n");
////// инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
////        System.out.println("Подсказка: \nВенесуэлла\n");
////        File myFile = new File("src\\" + "textForTask.txt");
////        try {
//////            File textForTask = new File("src\\" + "textForTask.txt");
//////            textForTask.createNewFile();
////            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
////            writer.println("Каракас");
////            writer.flush();
////            writer.close();
////            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
////            writer2.println("Венесуэлла");
////            writer2.flush();
////            writer2.close();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////
////// Проверяем, отгадано или нет секретное слово.
////        String str = ""; // видео мин 23.05
////        Scanner scanner = new Scanner(System.in);
////            while (!str.equals("Каракас")) {
////                System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                str = scanner.nextLine();
////
////                while (!str.equals("Каракас")) {
////                    System.out.println("Не верно.");
////                    System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                    str = scanner.nextLine();
////                }
////                System.out.println("Правильно!");
////
////            }
////    }
////
////        //        Конец Примера из задания 6
//
//    } // Конец Примера 1.2. ККККККККККККККККККККККККККККККККККК


////        Пример 4 ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//
//    public static void main(String[] args) {
//        String s = "Каракас";
//        String seq = "ччч";
//
//        if ((s.contains(seq)) && (!seq.equals(s)) && (!seq.equals(""))) {
//            System.out.println("Горячо.");
//        } else if (seq.equals(s)) {
//            System.out.println("Правильно!");
//        } else {
//            System.out.println("Не верно.");
//            System.out.println("Ведите другое слово.");
//        }
//
//} //        Конец Примера 4 ККККККККККККККККККККККККККККККККККК


////        Пример 3 ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//
//    public static void main(String[] args) {
//        String s = "Каракас";
//        String seq = "хххххххххххх";
////        int i = 1;
//        for (int i = 1, s.contains(seq), i++); {
////            s.contains(seq);
//            System.out.println("Горячо");
////            i++;
//        }
//        System.out.println("Холодно");
//
//    }
////        Конец Примера 3 ККККККККККККККККККККККККККККККККККК


////        Пример 2 ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//private static boolean isSubstring(String s, String seq) {
//    return s.contains(seq);
//}
//
//    public static void main(String[] args) {
//        String s = "Saturday";
//        String seq = "xxx";
//
//        System.out.println(isSubstring(s, seq)? "Yes": "No");        // Yes
//    }
//
////        Конец Примера 2 ККККККККККККККККККККККККККККККККККК


////        Пример 1 ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n7.\tПредыдущее задание, но если пользователь ввел хотя бы часть слова верно, \nто писать: горячо. (Проверять с помощью str.contains).\n");
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
//// Проверяем, отгадано или нет секретное слово.
//        String str = ""; // видео мин 23.05
//        Scanner scanner = new Scanner(System.in);
////        while (!str.equals("Каракас")) {
//            System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
//            str = scanner.nextLine();
//
//            while (str.contains(secrWord)) {  // первый while
//                System.out.println("Горячо.");
//                System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
//                str = scanner.nextLine();
//
//
//
////                while (!str.equals("Каракас")) {  // второй встроенный while
////                    System.out.println("Не верно.");
////                    System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                    str = scanner.nextLine();
////                }  // конец второго while
//
//
//
//
//
//
//            } // конец первого while
//            System.out.println("Правильно!");
//
////        }
//
//
//
////        //        Пример из задания 6
////
////        public static void main(String[] args) throws IOException {
////            System.out.println("Задание: \n6.\tВ файле две строки: секретное слово и подсказка. \nВывести подсказку. Считывать строку за строкой, пока игрок \nне отгадает секретное слово(не введёт его)\n");
////            System.out.println("Решение: ");
////
//////        File myFile = new File("src\\");
//////        myFile.createNewFile();
//////        String str = "";
//////        Scanner scanner = new Scanner(System.in);
//////        while (!str.equals("Хватит")) {
//////            System.out.println("Еще не хватит");
//////            System.out.println("Введите строку: ");
//////            str = scanner.nextLine();
//////        }
//////        System.out.println("Ладно, достаточно");
////
//////            try {
//////                Printwriter writer =
//////                        new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//////                writer.println("Каракас");
//////                writer.flush();
//////                writer.close();
//////            }catch (IOException ex){
//////                ex.printStackTrace();
//////            }
////        System.out.println("Создаем файл txt. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n");
////// инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
////        System.out.println("Подсказка: \nВенесуэлла\n");
////        File myFile = new File("src\\" + "textForTask.txt");
////        try {
//////            File textForTask = new File("src\\" + "textForTask.txt");
//////            textForTask.createNewFile();
////            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
////            writer.println("Каракас");
////            writer.flush();
////            writer.close();
////            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
////            writer2.println("Венесуэлла");
////            writer2.flush();
////            writer2.close();
////        } catch (IOException ex) {
////            ex.printStackTrace();
////        }
////
////// Проверяем, отгадано или нет секретное слово.
////        String str = ""; // видео мин 23.05
////        Scanner scanner = new Scanner(System.in);
////            while (!str.equals("Каракас")) {
////                System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                str = scanner.nextLine();
////
////                while (!str.equals("Каракас")) {
////                    System.out.println("Не верно.");
////                    System.out.println("Введите строку (т.е. предполагаемое секретное слово): ");
////                    str = scanner.nextLine();
////                }
////                System.out.println("Правильно!");
////
////            }
////    }
////
////        //        Конец Примера из задания 6
//
//    } // Конец Примера 1 ККККККККККККККККККККККККККККККККККК

}