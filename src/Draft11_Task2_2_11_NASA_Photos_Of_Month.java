import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/* 11.	Сохраните снимки NASA за январь 2022 года*/
// /Фото NASA здесь: https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494

public class Draft11_Task2_2_11_NASA_Photos_Of_Month {


//        Пример _ ППППППППППППППППППППППППППППППППППП  Сводим все воедино
    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n11.\tСохраните снимки NASA за январь 2022 года\n");
        System.out.println("Решение: ");
        System.out.println("Создаем новую директорию, 'NASA_Photos_Of_January_2022', куда будем сохранять фотографии,\n" +
                "по адресу: 'C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\NASA_Photos_Of_January_2022',\n" +
                "т.е. в корневом каталоге проекта.\n");

        // Создаем список дат января 2022
        LocalDate ld = LocalDate.of(2022, 1, 1);
        List<String> datesOfJan2022 = new ArrayList<>();
        do {
            System.out.println(ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            datesOfJan2022.add(ld.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
            ld = ld.plusDays(1);
        } while (ld.getDayOfMonth() > 1);  // arrive at 1st of next month
        System.out.println(); // Добавляем пустую строку, как разделитель
        System.out.println(datesOfJan2022);
// Список дат января 2022 г. сформировали. Далее брать инфо из Примера 8.

/* Создаем новую директорию, 'NASA_Photos_Of_January_2022', куда будем сохранять фотографии,
   по адресу: 'C:\Users\PC\IdeaProjectsDrafts\Draft230429_Module2_Urok2\NASA_Photos_Of_January_2022',
   т.е. в корневом каталоге проекта. */



// Далее перебираем массив ArrayList с датами января 2022 г.
        System.out.println();
        for (int i = 1; i <= datesOfJan2022.size(); i++) {
            String currentDate = datesOfJan2022.get(i-1);
            System.out.println(currentDate);

//        Таким образом, берем нужную нам дату, например 2022-01-12 перед ней дописываем '&date='
//        и склеиваем с https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY , т.е.
        /*String PageWithCodeOfCurrentDate = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY" + "&date=" + currentDate;
        String currentCodeItself = downloadWebPage(PageWithCodeOfCurrentDate);
        System.out.println(PageWithCodeOfCurrentDate);
        System.out.println(currentCodeItself);*/



        /*int urlBegin = currentCodeItself.lastIndexOf(",\"url");
        int urlEnd = currentCodeItself.lastIndexOf("}");
        String urlOfCurrentPhoto = currentCodeItself.substring(urlBegin + 8, urlEnd - 1);
        System.out.println(urlOfCurrentPhoto);*/
            /*try (InputStream in = new URL(urlOfCurrentPhoto).openStream()) {*/
            try /*(InputStream in = (InputStream) Paths.get("NASA_Input\\input.jpg"))*/ {


                Files.copy(Paths.get("NASA_Input\\input.jpg"), Paths.get("NASA_Photos_Of_January_2022\\" + "new" + i + ".jpg"), StandardCopyOption.COPY_ATTRIBUTES); /*переделать на COPY_ATTRIBUTES*/
            } catch (IOException exception) {
                out.println("Input/Output error");
            }
        }
    }

    /*private static String downloadWebPage (String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }*/


//        Конец Примера _ КККККККККККККККК



////    //        Пример 11 ППППППППППППППППППППППППППППППППППП здесь список дат месяца и утилита по скачиванию интернет страниц.
//    public static void main(String[] args) throws IOException {
//        // здесь фото за 2015/10/31:    https://epic.gsfc.nasa.gov/archive/natural/2015/10/31/png/epic_1b_20151031041238.png
//        // здесь про то как получать фото:  https://youtu.be/5V2lZpEeRlA    или     https://www.youtube.com/watch?v=5V2lZpEeRlA
//
//        LocalDate ld = LocalDate.of(2022, 1, 1);
//        // Создаем список дат января 2022
//        List<String> datesOfJan2022 = new ArrayList<>();
//        do {
//            System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            datesOfJan2022.add(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            ld = ld.plusDays(1);
//        } while (ld.getDayOfMonth() > 1);  // arrive at 1st of next month
//        System.out.println(); // Добавляем пустую строку, как разделитель
//        System.out.println(datesOfJan2022);
//
//        // КУСОК ИЗ Java Case_1_1_1
//        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//            try (InputStream in = new URL(urlPhoto).openStream()) {
//            Files.copy(in, Paths.get("new.jpg"));
//        }
//
//            System.out.println("\n" + "Картинка сохранена!");
//
//
//    }
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//    } //        Конец Примера 11 КККККККККККККККК





//    //        Пример 10 ППППППППППППППППППППППППППППППППППП  Продолжаем искать способ копирования без перезаписи
//    public static void main(String[] args) {
//    String urlOfCurrentPhoto1 = "https://apod.nasa.gov/apod/image/2201/OrionStarFree3_Harbison_1080.jpg";
//    String urlOfCurrentPhoto2 = "https://apod.nasa.gov/apod/image/2201/PIA19048europa1024.jpg";
//    String urlOfCurrentPhoto3 = "https://apod.nasa.gov/apod/image/2201/DarkNebulaVd_HmoRuuth_960.jpg";
//
//        try /*(InputStream in = new URL(urlOfCurrentPhoto2).openStream())*/ {
//            Path sourcePath = Path.of(urlOfCurrentPhoto2), destinationPath = Paths.get("NASA_Photos_Of_January_2022\\new.jpg");
//            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException exception) {
//            out.println("Input/Output error");
//        }
//    }
//
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//    //        Конец Примера 10 КККККККККККККККК







////        Пример 9 ППППППППППППППППППППППППППППППППППП  Пробуем пример из интернета
////        где файлы сохраняются в одну папку без перезаписи
//public static <StringUTF16> void main(String[] args) {
//
//    String urlOfCurrentPhoto1 = "https://apod.nasa.gov/apod/image/2201/OrionStarFree3_Harbison_1080.jpg";
//    String urlOfCurrentPhoto2 = "https://apod.nasa.gov/apod/image/2201/PIA19048europa1024.jpg";
//    String urlOfCurrentPhoto3 = "https://apod.nasa.gov/apod/image/2201/DarkNebulaVd_HmoRuuth_960.jpg";
//
//    int counter = 0;
//
//    File savedPic = new File("NASA_Photos_Of_January_2022\\new" + counter + ".jpg");
//
//    try {
//        counter++;
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//
////        Конец Примера 9 КККККККККККККККК





//    //        Пример 8 ППППППППППППППППППППППППППППППППППП ЗДЕСЬ ПРАВИЛЬНЫЙ Files.copy и try Получаем фото NASA за определенную дату и сохраняем в папку (но не разными файлами, а пока с перезаписью).
//    public static void main(String[] args) throws IOException {
////        Здесь про фото NASA из обучающего видео ( туториала ) в интернет
////        https://youtu.be/5V2lZpEeRlA	мин 01.12 - получение исторических фото (за прошлые даты ); на мин 02.03. как нужную дату ввести
////        Чтобы фото за нужную дату получить, нужно вот к этому https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY прибавить
////        вот это &date=2022-01-12 и в итоге получить вот это https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2022-01-12
//
////        Таким образом, берем нужную нам дату, например 2022-01-12 перед ней дописываем '&date='
////        и склеиваем с https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY , т.е.
//        String currentDate = "2022-01-22";
//        String PageWithCodeOfCurrentDate = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY" + "&date=" + currentDate;
//        String currentCodeItself = downloadWebPage(PageWithCodeOfCurrentDate);
//        System.out.println(PageWithCodeOfCurrentDate);
//        System.out.println(currentCodeItself);
//
//
//
//       int urlBegin = currentCodeItself.lastIndexOf(",\"url");
//       int urlEnd = currentCodeItself.lastIndexOf("}");
//       String urlOfCurrentPhoto = currentCodeItself.substring(urlBegin + 8, urlEnd - 1);
//        System.out.println(urlOfCurrentPhoto);
//        try (InputStream in = new URL(urlOfCurrentPhoto).openStream()) {
//
//
//            Files.copy(in, Paths.get("NASA_Photos_Of_January_2022\\new.jpg"), StandardCopyOption.REPLACE_EXISTING); /*переделать на COPY_ATTRIBUTES*/
//        }
//    }
//
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
////    } //        Конец Примера 8 КККККККККККККККК




//
////        Пример 7 ППППППППППППППППППППППППППППППППППП Сохранение фотографии NASA (другой, т.е. как пример) в папку
//    public static void main(String[] args) throws IOException {
//        // КУСОК ИЗ Java Case_1_1_1
//        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//
///* Создаем новую директорию, 'NASA_Photos_Of_January_2022', куда будем сохранять фотографии,
//   по адресу: 'C:\Users\PC\IdeaProjectsDrafts\Draft230429_Module2_Urok2\NASA_Photos_Of_January_2022',
//   т.е. в корневом каталоге проекта. */
//
//        try (InputStream in = new URL(urlPhoto).openStream()) {
//            Files.copy(in, Paths.get("NASA_Photos_Of_January_2022\\new.jpg"));
//        }
//        System.out.println("\n" + "Картинка сохранена!");
//    }
//
//    private static String downloadWebPage (String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//
////    } //        Конец Примера 7 КККККККККККККККК




//    //        Пример 6 ППППППППППППППППППППППППППППППППППП
//    public static void main(String[] args) throws IOException {
//
////        // КУСОК ИЗ Whole_Video
////        //        Код 1
////        //        int x = 1;
////        //        while (x < 11) {  // видео мин 02.15
////        ////            File file = new File("C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\files\\" + "File" + x);
////        //            System.out.println("Loop can do a lot of things.");
////        //            File file = new File("files\\" + "File" + x);
////        //            file.createNewFile();
////        //            x = x + 1;
////        //        }
//
//        int x = 1;
//        while (x < 6) {
//
//            try (FileInputStream inputStream = new FileInputStream("src/file.txt")) {
//                File directory = new File("src/folder");
////            if (!directory.exists()) directory.mkdir();
//
//                try (FileOutputStream outputStream = new FileOutputStream(new File("src/folder/fileClone.txt"))) {
////                if (!directory.exists()) directory.mkdir();
//                    byte[] bytes = new byte[inputStream.available()];
//                    int length;
//
//                    while ((length = inputStream.read(bytes)) != -1) {
//                        outputStream.write(bytes, 0, length);
//                    }
//                } catch (IOException exception) {
//                    System.out.println("Output error");
//                }
//            } catch (IOException exception) {
//                System.out.println("Input error");
//
//            }
//            x = x + 1;
//        }
//
//
//
//    } //        Конец Примера 6 ККККККККККККККК






//    //        Пример 5 ППППППППППППППППППППППППППППППППППП
////    public static void main(String[] args) {
//
// Шаблон , утилита  кода для скачивания веб страницы:
//    String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//    int urlBegin = pageNasa.lastIndexOf("url");
//    int urlEnd = pageNasa.lastIndexOf("}");
//    String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream in = new URL(urlPhoto).openStream()) {
//        Files.copy(in, Paths.get("new.jpg"));
//    }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//    int explanationBegin = pageNasa.lastIndexOf("explanation");
//    int explanationEnd = pageNasa.lastIndexOf("hdurl");
//    String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3);
//        System.out.println(explanation);
//
//}
//
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//
//    } //        Конец Примера 5 КККККККККККККККК






////        Пример 4
//    public static void main(String[] args) throws IOException {
//
//        try (FileInputStream inputStream = new FileInputStream("src/file.txt")) {
//            File directory = new File("src/folder");
////            if (!directory.exists()) directory.mkdir();
//
//            try (FileOutputStream outputStream = new FileOutputStream("src/folder/fileClone.txt")) {
////                if (!directory.exists()) directory.mkdir();
//                byte[] bytes = new byte[inputStream.available()];
//                int length;
//
//                while ((length = inputStream.read(bytes)) != -1) {
//                    outputStream.write(bytes, 0, length);
//                }
//            } catch (IOException exception) {
//                System.out.println("Output error");
//            }
//        } catch (IOException exception) {
//            System.out.println("Input error");
//
//        }
//    }
////        Конец Примера 4


////        Пример 3
////        инфо здесь: https://youtu.be/_SYoe99u_-s
//    public static void main(String[] args) throws IOException {
//
//        try (FileInputStream inputStream = new FileInputStream("file.txt")) {
//            File directory = new File("src/folder");
//            if (!directory.exists()) directory.mkdir();
//
//            try (FileOutputStream outputStream = new FileOutputStream("src/folder/file.txt")) {
//                    byte[] bytes = new byte[inputStream.available()];
//                    int length;
//
//                    while ((length = inputStream.read(bytes)) !=-1) {
//                        outputStream.write(bytes, 0, length);
//                    }
//            } catch (IOException exception) {
//                System.out.println("Output error");
//            }
//        } catch (IOException exception) {
//            System.out.println("Input error");
//        }
//    }
//
//        private static String downloadWebPage (String url) throws IOException {
//            StringBuilder result = new StringBuilder();
//            String line;
//            URLConnection urlConnection = new URL(url).openConnection();
//            try (InputStream is = urlConnection.getInputStream();
//                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//                while ((line = br.readLine()) != null) {
//                    result.append(line);
//                }
//            }
//            return result.toString();
//        }
//
//        // КУСОК ИЗ Whole_Video
//        //        Код 1
//        //        int x = 1;
//        //        while (x < 11) {  // видео мин 02.15
//        ////            File file = new File("C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\files\\" + "File" + x);
//        //            System.out.println("Loop can do a lot of things.");
//        //            File file = new File("files\\" + "File" + x);
//        //            file.createNewFile();
//        //            x = x + 1;
//        //        }
////        Конец Примера 3


////        Пример 2    Записывает с перезаписью
////    инфо здесь: https://www.techiedelight.com/ru/copy-file-in-java/
//
//    public static void main(String[] args) {
//        File from = new File("src.txt");
//        File to = new File("dest.txt");
//
//        try {
//            copyFile(from, to);
//            System.out.println("File copied successfully.");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//    }
//
//    private static void copyFile(File src, File dest) throws IOException {
//        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        InputStream in = new URL(urlPhoto).openStream();
//        Files.copy(in, Path.of("NASA_Photos\\Photo.jpg"));
//    }
//
//
//    private static String downloadWebPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
////        Конец Примера 2


////        Пример 1    Записывает с перезаписью
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n11.\tСохраните снимки NASA за январь 2022 года");
//        System.out.println("Решение: ");
//
////        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
////
////        System.out.println("Entering January 1, 2022, as the dates count start, in the format of 2023-01-01\": ");
////        String monthJan2003 = buffered.readLine();
//
//
//        LocalDate ld = LocalDate.of(2022, 1, 1);
//
//        // Создаем список дат января 2022
//        List<String> datesOfJan2022 = new ArrayList<>();
//        do {
//            System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            datesOfJan2022.add(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            ld = ld.plusDays(1);
//        } while (ld.getDayOfMonth() > 1);  // arrive at 1st of next month
//        System.out.println(); // Добавляем пустую строку, как разделитель
//        System.out.println(datesOfJan2022);
//
//
//        // Сохраняем фотографии в файлы
//        System.out.println(); // Добавляем пустую строку, как разделитель
//        System.out.println("Создаем директорию в корневом каталоге проекта, называем её: 'NASA_Photos'");
//        int x = 1;
//        do {
//                    String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//                    int urlBegin = pageNasa.lastIndexOf("url");
//                    int urlEnd = pageNasa.lastIndexOf("}");
//                    String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//                        try (InputStream in = new URL(urlPhoto).openStream()) {
//                        Files.copy(in, Paths.get("NASA_Photos\\Photo.jpg"));  // String.valueOf(StandardCopyOption.COPY_ATTRIBUTES)
//                    }
//            x = x + 1;
//        } while (ld.getDayOfMonth() > 1 && ld.getDayOfMonth() <= 5);  // arrive at 1st of next month
//
//        // КУСОК ИЗ Whole_Video
//        //        Код 1
//        //        int x = 1;
//        //        while (x < 11) {  // видео мин 02.15
//        ////            File file = new File("C:\\Users\\PC\\IdeaProjectsDrafts\\Draft230429_Module2_Urok2\\files\\" + "File" + x);
//        //            System.out.println("Loop can do a lot of things.");
//        //            File file = new File("files\\" + "File" + x);
//        //            file.createNewFile();
//        //            x = x + 1;
//        //        }
//
//        // КУСОК ИЗ Java Case_1_1_1
//        //        String pageNasa = downloadWebPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        //        int urlBegin = pageNasa.lastIndexOf("url");
//        //        int urlEnd = pageNasa.lastIndexOf("}");
//        //        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        //            try (InputStream in = new URL(urlPhoto).openStream()) {
//        //            Files.copy(in, Paths.get("new.jpg"));
//        //        }
//        //
//        //            System.out.println("\n" + "Картинка сохранена!");
//        //
//        //        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        //        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        //        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3);
//        //            System.out.println(explanation);
//
//    }
//
//        private static String downloadWebPage (String url) throws IOException {
//            StringBuilder result = new StringBuilder();
//            String line;
//            URLConnection urlConnection = new URL(url).openConnection();
//            try (InputStream is = urlConnection.getInputStream();
//                 BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
//                while ((line = br.readLine()) != null) {
//                    result.append(line);
//                }
//            }
//            return result.toString();
//        }
////        Конец Примера 1
}
