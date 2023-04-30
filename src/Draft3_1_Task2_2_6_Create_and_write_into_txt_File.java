import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
//package com.company;

/* 6.	В файле две строки: секретное слово и подсказка.
 Вывести подсказку. Считывать строку за строкой, пока игрок
 не отгадает секретное слово (не введёт его)*/

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494
public class Draft3_1_Task2_2_6_Create_and_write_into_txt_File {
    // Как создать файл .txt и как сделать запись в него, инфо здесь: https://yandex.ru/video/preview/9761637152705084468
    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n6.\tВ файле две строки: секретное слово и подсказка. \nВывести подсказку. Считывать строку за строкой, пока игрок \nне отгадает секретное слово(не введёт его)\n");
        System.out.println("Решение: ");

//        File myFile = new File("src\\");
//        myFile.createNewFile();
//        String str = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!str.equals("Хватит")) {
//            System.out.println("Еще не хватит");
//            System.out.println("Введите строку: ");
//            str = scanner.nextLine();
//        }
//        System.out.println("Ладно, достаточно");

//            try {
//                Printwriter writer =
//                        new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
//                writer.println("Каракас");
//                writer.flush();
//                writer.close();
//            }catch (IOException ex){
//                ex.printStackTrace();
//            }
        System.out.println("Создаем файл txt. В нем две строки: секретное слово и подсказка: \nКаракас\nВенесуэлла\n");
// инфо, как создать файл txt здесь: https://yandex.ru/video/preview/9761637152705084468
        System.out.println("Подсказка: \nВенесуэлла\n");
        File myFile = new File("src\\" + "textForTask.txt");
        try {
//            File textForTask = new File("src\\" + "textForTask.txt"); // todo восстановить
//            textForTask.createNewFile(); // todo восстановить
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer.println("Каракас");
            writer.flush();
            writer.close();
            PrintWriter writer2 = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
            writer2.println("Венесуэлла");
            writer2.flush();
            writer2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

// Проверяем, отгадано или нет секретное слово.
        String str = ""; // видео мин 23.05
        Scanner scanner = new Scanner(System.in);
            while (!str.equals("Каракас")) {
                System.out.println("Не верно.");
                System.out.println("Введите строку: ");
                str = scanner.nextLine();
            }
            System.out.println("Правильно!");
    }
}