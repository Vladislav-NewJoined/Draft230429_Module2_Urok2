import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/* 11.	Сохраните снимки NASA за январь 2022 года*/
// /Фото NASA здесь: https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY

// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// Видеоурок здесь: https://lms.synergy.ru/learning/view/68494

public class Draft11_Task2_2_11_NASA_Photos_Of_Month {

//    //        Пример 7 ППППППППППППППППППППППППППППППППППП
    public static void main(String[] args) throws IOException {
        // здесь фото за 2015/10/31:    https://epic.gsfc.nasa.gov/archive/natural/2015/10/31/png/epic_1b_20151031041238.png
        // здесь про то как получать фото.

    }
        private static String downloadWebPage (String url) throws IOException {
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
        }




//            synchronousRequest();
//            asynchronousRequest();
//        }
//
//        private static void asynchronousRequest() throws InterruptedException, ExecutionException {
//
//            // create a client
//            var client = HttpClient.newHttpClient();
//
//            // create a request
//            var request = HttpRequest.newBuilder(
//                            URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY"))
//                    .header("accept", "application/json")
//                    .build();
//
//            // use the client to send the request
//            var responseFuture = client.sendAsync(request, new JsonBodyHandler<>(APOD.class));
//
//            // We can do other things here while the request is in-flight
//
//            // This blocks until the request is complete
//            var response = responseFuture.get();
//
//            // the response:
//            System.out.println(response.body().get().title);
//        }
//
//        private static void synchronousRequest() throws IOException, InterruptedException {
//            // create a client
//            var client = HttpClient.newHttpClient();
//
//            // create a request
//            var request = HttpRequest.newBuilder(
//                    URI.create("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY")
//            ).build();
//
//            // use the client to send the request
//            HttpResponse<Supplier<APOD>> response = client.send(request, new JsonBodyHandler<>(APOD.class));
//
//            // the response:
//            System.out.println(response.body().get().title);
//    } //        Конец Примера 7 КККККККККККККККК




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
//        List<String> datesOfJanList = new ArrayList<>();
//        do {
//            System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            datesOfJanList.add(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//            ld = ld.plusDays(1);
//        } while (ld.getDayOfMonth() > 1);  // arrive at 1st of next month
//        System.out.println(); // Добавляем пустую строку, как разделитель
//        System.out.println(datesOfJanList);
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
