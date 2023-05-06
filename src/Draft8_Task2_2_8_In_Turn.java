import java.io.*;
import java.util.Scanner;


/* 8.	Первый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй.
Игра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово противника.*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494

public class Draft8_Task2_2_8_In_Turn {

    //        Пример 10 ППППППППППППППППППППППППППППП УДАЛСЯ!!!!!!!!!!!!!!!!!! ( Доработанный Пример 3 )
    public static void main(String[] args) {
        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
        System.out.println("Решение: ");

        // Первый игрок создает файл и пишет подсказку
        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nФранция\n");
        String secrWord_Of_First_Player = "Париж";
        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");

        try {
            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
            writer_First_Player.println("Париж");
            writer_First_Player.flush();
            writer_First_Player.close();
            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
            writer2_First_Player.println("Франция");
//            writer2_First_Player.flush();
            writer2_First_Player.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Второй игрок создает файл и пишет подсказку
        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nИспания\n");
        String secrWord_Of_Second_Player = "Мадрид";
        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");

        try {
            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
            writer_Second_Player.println("Мадрид");
            writer_Second_Player.flush();
            writer_Second_Player.close();
            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
            writer2_Second_Player.println("Испания");
//            writer2_Second_Player.flush();
            writer2_Second_Player.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Теперь поочерёдно вводят слова
        String str_FromFirstPl;
        String str_FromSecondPl;

        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
        Scanner scanner_FromSecond_Player = new Scanner(System.in);

        while (true) {
            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
            str_FromFirstPl = scanner_FromFirst_Player.nextLine();
            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) && (!str_FromFirstPl.equals(""))) {
                System.out.println("Горячо.");
            } else if
            ((!secrWord_Of_Second_Player.contains(str_FromFirstPl)) || (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) || (str_FromFirstPl.equals(""))) {
                System.out.println("Не верно.");
            } else {
                System.out.println("Правильно!");
                System.out.println("Победил первый игрок.");
                break;
            }

            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(secrWord_Of_First_Player)) && (!str_FromSecondPl.equals(""))) {
                System.out.println("Горячо.");
            } else if
            ((!secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals(secrWord_Of_First_Player)) || (str_FromSecondPl.equals(""))) {
                System.out.println("Не верно.");
            } else {
                System.out.println("Правильно!");
                System.out.println("Победил второй игрок.");
                break;
            }
        }
} //        Конец Примера 10 ККККККККККККККК  ( Доработанный Пример 3 )







//    //        Пример 9 ППППППППППППППППППППППППППППППППППП Примеры из интернет для остановки всего кода, еще break и continue
//    public static void main(String[] args) {
//
////        int i = 1;
////        while (true) {
////            if (i == 16) {
////                break;
////            }
////            System.out.println(i);
////            i++;
////        }
////        System.out.println("Мы вышли из цикла break.");
//
//        // Теперь оператор continue
//        for (int i = 0; i <= 15; i++){
//                if (i%2 == 0){
//                    continue;
//                }
//            System.out.println("это нечетное число " + i);
//        }
//} //        Конец Примера 9 КККККККККККККККК





//    //        Пример 8 ППППППППППППППППППППППППППППППППППП Примеры из интернет для остановки всего кода, break
//    public static void main(String[] args) {
//        int i = 5;
//        if (i !== 6) {
//            System.out.println("All is fine...java programm executes without problem");
//        }   else break;
//            System.out.println("ERROR occured :::: java programm has stopped!!!");
//            System.exit(1); {
//
//        }
//    } //        Конец Примера 8 КККККККККККККККК


//    //        Пример 7 ППППППППППППППППППППППППППППППППППП Примеры из интернет для остановки всего кода, return
//        public static void main(String[] args) {
////    public void onClick() {
//
//        int i = 5;
////        boolean condition = i == 6;
//        if(i == 6) {
////        if(condition == true) {
//            return;
////                    <or>
////            throw new YourException();
//        }
//        Label string = null;
//        string.setText("This string should not change if condition = true");
//        System.out.println("Если Вы видите эту строку, значит условие выполнено");
//} //        Конец Примера 7 КККККККККККККККК



//    //        Пример 6 ППППППППППППППППППППППППППППППППППП Примеры из интернет для остановки всего кода , return
//public static void main(String[] args) {
////    public void onClick() {
//
//        if(condition == true) {
//            return;
//        }
//        string.setText("This string should not change if condition = true");
//} //        Конец Примера 6 КККККККККККККККК






//    //        Пример 5 ППППППППППППППППППППППППППППППППППП Пробуем остановить весь код, когда правильно ( else break или System.exit(1); )
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//        System.out.println("Решение: ");
//
//        // Первый игрок создает файл и пишет подсказку
//        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nФранция\n");
//        String secrWord_Of_First_Player = "Париж";
//        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//        try {
//            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//            writer_First_Player.println("Париж");
//            writer_First_Player.flush();
//            writer_First_Player.close();
//            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//            writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//            writer2_First_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Второй игрок создает файл и пишет подсказку
//        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nИспания\n");
//        String secrWord_Of_Second_Player = "Мадрид";
//        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//        try {
//            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//            writer_Second_Player.println("Мадрид");
//            writer_Second_Player.flush();
//            writer_Second_Player.close();
//            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//            writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//            writer2_Second_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Теперь поочерёдно вводят слова
//        String str_FromFirstPl = "";
//        String str_FromSecondPl = "";
//
////        String gameOver = "";
////        String gameGoingOn = "";
//
//
//        // ЭКСПЕРИМЕНТИРУЮ
//
////        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//
//        // Первый игрок вводит, если не угадал, то вводит второй игрок
//        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_FromSecond_Player = new Scanner(System.in);
//
//
//        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromFirstPl = (scanner_FromFirst_Player.nextLine());
//            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals("")) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player))) {
//                System.out.println("Горячо.");
//            } else {
//                System.out.println("Не верно.");
//            }
//
//            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
//            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals("")) && (!str_FromSecondPl.equals(secrWord_Of_First_Player))) {
//                System.out.println("Горячо.");
//            } else {
//                System.out.println("Не верно.");
//            }
//        }
//        System.out.println("Правильно!");
//
//
//    } //        Конец Примера 5 КККККККККККККККК






//    //        Пример 4 ППППППППППППППППППППППППППППППППППП
//
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//        System.out.println("Решение: ");
//
//        // Первый игрок создает файл и пишет подсказку
//        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nФранция\n");
//        String secrWord_Of_First_Player = "Париж";
//        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//        try {
//            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//            writer_First_Player.println("Париж");
//            writer_First_Player.flush();
//            writer_First_Player.close();
//            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//            writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//            writer2_First_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Второй игрок создает файл и пишет подсказку
//        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nИспания\n");
//        String secrWord_Of_Second_Player = "Мадрид";
//        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//        try {
//            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//            writer_Second_Player.println("Мадрид");
//            writer_Second_Player.flush();
//            writer_Second_Player.close();
//            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//            writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//            writer2_Second_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Теперь поочерёдно вводят слова
//        String str_FromFirstPl = "";
//        String str_FromSecondPl = "";
//
////        String gameOver = "";
////        String gameGoingOn = "";
//
//
//        // ЭКСПЕРИМЕНТИРУЮ
//
////        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//
//        // Первый игрок вводит, если не угадал, то вводит второй игрок
//        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_FromSecond_Player = new Scanner(System.in);
//
//
//        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//            System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromFirstPl = (scanner_FromFirst_Player.nextLine());
//            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals("")) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player))) {
//                System.out.println("Горячо.");
//            } else {
//                System.out.println("Не верно.");
//            }
//
//            System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//            str_FromSecondPl = scanner_FromSecond_Player.nextLine();
//            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals("")) && (!str_FromSecondPl.equals(secrWord_Of_First_Player))) {
//                System.out.println("Горячо.");
//            } else {
//                System.out.println("Не верно.");
//            }
//        }
//        System.out.println("Правильно!");
//
//    } //        Конец Примера 4 КККККККККККККККК



//    //        Пример 3 ППППППППППППППППППППППППППППП Очередность есть, но на правильный ввод - пишет Не верно и у первого игрока не закрывает.
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//        System.out.println("Решение: ");
//
//        // Первый игрок создает файл и пишет подсказку
//        System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nФранция\n");
//        String secrWord_Of_First_Player = "Париж";
//        File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//        try {
//            PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//            writer_First_Player.println("Париж");
//            writer_First_Player.flush();
//            writer_First_Player.close();
//            PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//            writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//            writer2_First_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Второй игрок создает файл и пишет подсказку
//        System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//                "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//        System.out.println("Подсказка: \nИспания\n");
//        String secrWord_Of_Second_Player = "Мадрид";
//        File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//        try {
//            PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//            writer_Second_Player.println("Мадрид");
//            writer_Second_Player.flush();
//            writer_Second_Player.close();
//            PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//            writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//            writer2_Second_Player.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        // Теперь поочерёдно вводят слова
//        String str_FromFirstPl = "";
//        String str_FromSecondPl = "";
//
////        String gameOver = "";
////        String gameGoingOn = "";
//
//
//        // ЭКСПЕРИМЕНТИРУЮ
//
////        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//
//        // Первый игрок вводит, если не угадал, то вводит второй игрок
//        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//        Scanner scanner_FromSecond_Player = new Scanner(System.in);
//
//
//        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player) || !str_FromSecondPl.equals(secrWord_Of_First_Player)) {
//                System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//                str_FromFirstPl = (scanner_FromFirst_Player.nextLine());
//                if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals("")) && (!str_FromFirstPl.equals(secrWord_Of_Second_Player))) {
//                    System.out.println("Горячо.");
//                } else {
//                    System.out.println("Не верно.");
//                }
//
//                System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//                str_FromSecondPl = scanner_FromSecond_Player.nextLine();
//                if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals("")) && (!str_FromSecondPl.equals(secrWord_Of_First_Player))) {
//                    System.out.println("Горячо.");
//                } else {
//                    System.out.println("Не верно.");
//                }
//        }
//        System.out.println("Правильно!");
//
////        while (!str_FromSecondPl.equals(secrWord_Of_First_Player) || !str_FromFirstPl.equals(secrWord_Of_Second_Player)) {
////            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) || (!str_FromSecondPl.equals("")) && (!str_FromSecondPl.equals(secrWord_Of_First_Player))) {
////                System.out.println("Горячо.");
////                System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
////                str_FromFirstPl = scanner_FromFirst_Player.nextLine();
////            } else {
////                System.out.println("Не верно.");
////                System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
////                str_FromFirstPl = scanner_FromFirst_Player.nextLine();
////            }
////        }
////        System.out.println("Правильно!");
//
//
//        // КОНЕЦ ЭКСПЕРИМЕНТА
//
//
////        // Первый игрок вводит, смотрит ответ
////        Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
////        System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
////        str_FromFirstPl  = (scanner_FromFirst_Player.nextLine());
////
////        while (!str_FromFirstPl.equals(secrWord_Of_Second_Player)) {
////            if ((secrWord_Of_Second_Player.contains(str_FromFirstPl)) && (!str_FromFirstPl.equals(""))) {
////                System.out.println("Горячо.");
////                System.out.println("Первый игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
////                str_FromFirstPl = scanner_FromFirst_Player.nextLine();
////            } else {
////                System.out.println("Не верно.");
////                System.out.println("Первый игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
////                str_FromFirstPl = scanner_FromFirst_Player.nextLine();
////            }
////        }
////        System.out.println("Правильно!");
////
////        // Второй игрок вводит, смотрит ответ
////        Scanner scannerFromSecond_Player = new Scanner(System.in); // видео мин 23.05
////        System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
////        str_FromSecondPl = (scannerFromSecond_Player.nextLine());
////
////        while (!str_FromSecondPl.equals(secrWord_Of_First_Player)) {
////            if ((secrWord_Of_First_Player.contains(str_FromSecondPl)) && (!str_FromSecondPl.equals(""))) {
////                System.out.println("Горячо.");
////                System.out.println("Второй игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
////                str_FromSecondPl = scannerFromSecond_Player.nextLine();
////            } else {
////                System.out.println("Не верно.");
////                System.out.println("Второй игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
////                str_FromSecondPl = scannerFromSecond_Player.nextLine();
////            }
////        }
////        System.out.println("Правильно!");
//    } //        Конец Примера 3 ККККККККККККККК






//    //        Пример 2 (Правильный, но недоделанный) ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
//public static void main(String[] args) throws IOException {
//    System.out.println("Задание: \n8.\tПервый игрок сохраняет слово и подсказку в первый файл, второй игрок во второй. \nИгра начинается, выводятся подсказки, игроки по-очереди пытаются отгадать слово \nпротивника.\n");
//    System.out.println("Решение: ");
//
//    // Первый игрок создает файл и пишет подсказку
//    System.out.println("Первый игрок создает файл 'textForTask_8_First_Player.txt'. В нем две строки: " +
//            "секретное слово и подсказка: \nПариж\nФранция\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//    System.out.println("Подсказка: \nФранция\n");
//    String secrWord_First_Player = "Париж";
//    File myFile_First_Player = new File("src\\" + "textForTask_8_First_Player.txt");
//
//    try {
//        PrintWriter writer_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, false)));
//        writer_First_Player.println("Париж");
//        writer_First_Player.flush();
//        writer_First_Player.close();
//        PrintWriter writer2_First_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_First_Player, true)));
//        writer2_First_Player.println("Франция");
////            writer2_First_Player.flush();
//        writer2_First_Player.close();
//    } catch (IOException ex) {
//        ex.printStackTrace();
//    }
//
//    // Второй игрок создает файл и пишет подсказку
//    System.out.println("Второй игрок создает файл 'textForTask_8_Second_Player.txt'. В нем две строки: " +
//            "секретное слово и подсказка: \nМадрид\nИспания\n"); // инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
//    System.out.println("Подсказка: \nИспания\n");
//    String secrWord_Second_Player = "Мадрид";
//    File myFile_Second_Player = new File("src\\" + "textForTask_8_Second_Player.txt");
//
//    try {
//        PrintWriter writer_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, false)));
//        writer_Second_Player.println("Мадрид");
//        writer_Second_Player.flush();
//        writer_Second_Player.close();
//        PrintWriter writer2_Second_Player = new PrintWriter(new BufferedWriter(new FileWriter(myFile_Second_Player, true)));
//        writer2_Second_Player.println("Испания");
////            writer2_Second_Player.flush();
//        writer2_Second_Player.close();
//    } catch (IOException ex) {
//        ex.printStackTrace();
//    }
//
//    // Теперь поочерёдно вводят слова
//    String gameOver = "Правильно!";
//
//    // Первый игрок вводит, смотрит ответ
//    Scanner scanner_FromFirst_Player = new Scanner(System.in); // видео мин 23.05
//    System.out.println("Первый игрок: введите строку (т.е. предполагаемое секретное слово): ");
//    String str_ForFirstPl = scanner_FromFirst_Player.nextLine();
//
//
//    while (!str_ForFirstPl.equals(secrWord_Second_Player)) {
//        if ((secrWord_Second_Player.contains(str_ForFirstPl)) && (!str_ForFirstPl.equals(""))) {
//            System.out.println("Горячо.");
//            System.out.println("Первый игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
//            str_ForFirstPl = scanner_FromFirst_Player.nextLine();
//        } else {
//            System.out.println("Не верно.");
//            System.out.println("Первый игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
//            str_ForFirstPl = scanner_FromFirst_Player.nextLine();
//        }
//    }
//    System.out.println("Правильно!");
//
//    // Второй игрок вводит, смотрит ответ
//    Scanner scannerFromSecond_Player = new Scanner(System.in); // видео мин 23.05
//    System.out.println("Второй игрок: введите строку (т.е. предполагаемое секретное слово): ");
//    String str_ForSecondPl = scannerFromSecond_Player.nextLine();
//
//    while (!str_ForSecondPl.equals(secrWord_First_Player)) {
//        if ((secrWord_First_Player.contains(str_ForSecondPl)) && (!str_ForSecondPl.equals(""))) {
//            System.out.println("Горячо.");
//            System.out.println("Второй игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
//            str_ForSecondPl = scannerFromSecond_Player.nextLine();
//        } else {
//            System.out.println("Не верно.");
//            System.out.println("Второй игрок: введите другую строку (т.е. предполагаемое секретное слово): ");
//            str_ForSecondPl = scannerFromSecond_Player.nextLine();
//        }
//    }
//    System.out.println("Правильно!");
//
//
//} //        Конец Примера 2 (Правильный, но недоделанный) ККККККККККККККККККККККККККККККККККК


//    //        Пример 1 из предыдущего задания 7 ПППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППППП
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
//    } //        Конец Примера 1 ККККККККККККККККККККККККККККККККККК


}