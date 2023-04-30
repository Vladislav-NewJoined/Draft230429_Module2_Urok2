// Задание здесь: https://lms.synergy.ru/learning/view/68552/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
// 3.	Выведите латинский алфавит от a до z
public class Draft2_Task2_2_3_Letters_of_Alphabet {
    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tВыведите латинский алфавит от a до z\n");
        System.out.println("Решение: ");

//        for (char i = '\u0430'; i <= '\u044f'; i++) {
//            System.out.print(i + " ");
//        }

//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i + " ");
//        }

        char i = 'a';
        while (i <= 'z') {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        char i2 = 'а';
        while (i2 <= 'я') {
            System.out.print(i2 + " ");
            i2++;
        }

    }
}
