package A4_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMain {

    public static void main(String[] args) {

        stringArrays();
        // calAvgWithArrays();
        // multiDimensionalArrays();
    }

    public static void stringArrays() {

        // initialize sırasında dizeye değer ataması yapar.
        // ayrılan sandalyaler isme göre ayrılmış hepsi otur.
        String[]  friends = {"Ali","Ahmet","Can","Cansu","Tan"};
        friends[0] = "Hakan"; // oturanı değiştirdim

         // çok boyutlu dizilerde sort kullanımı tek boyutlu dizilerdeki gibi çalışmaz, satırları sıralar ama sütunları sıralamaz.

        // şuan ise sandalyeler rezerve edildi ama kimin oturacağına karar verilmedi
        String[] names = new String[5]; // 5 kişilik bir dizi oluşturduk

        // dizilerde assignment süreci
        names[0] = "Cankurt";
        names[1]= "Ayşegül";
        names[2]="Fuat";
        names[3] = "Can";
        names[4] = "Kürşad";

        Arrays.sort(names); // A-Z sıralama yapar, 0-9 A-Z

        String firstValue = names[0];
        String lastValue =  names[names.length -1];



        // Dizi kullanırken 500 masalık bir yerim var. 501 masa yapamıyorum.
        // collectionda ise genel olarak 500 masam var ama ihtiyaç olur 600 masa sığdırırım buraya.
        // collcetion da masa sandalye herhangi bir şey atılabilir. bir çok farklı tip olabilir.
        // Array ise sadece masa veya sandalye dizisi olabilir.
        // diziye eleman indeksinden girilir.
        // Koleksiyona ise methodlar ile giriş yapıalbilir insert(3,5) -> araya ekleme
        // removeAt(5) -> 5. indeksteki kaydı sil gibi kolleksiyonlarda daha fazla method vardır.
        // Kısacası kolleksiyonlar özelleştirilmiş dizilerdir.


    }

    // Kullanıcıdan istenen 5 adet sayıyının ortalamasını dizi kullnarak bulan programın algoritması
    public static void calAvgWithoutArrays() {

        double ort = 0;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Sıradaki sayıyı giriniz");
            int currentValue = scanner.nextInt();
            total+=currentValue;
        }

        ort = total / 5;
        System.out.println("Ortalama ->" + ort);

    }

    public static void calAvgWithArrays() {

        double ort = 0;
        double total = 0;
        int[] numbers = new int[5];
        int[] odds = new int[5];

        Scanner scanner = new Scanner(System.in);

        // diziye atama
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Sıradaki sayıyı giriniz");
            numbers[i] = scanner.nextInt();
        }

        // diziden okuyup total değişkenine alma
        for (int i = 0; i < numbers.length; i++) {
            total+=numbers[i];

            if(numbers[i] % 2 == 1){
                odds[i] = numbers[i];
            }
        }


        ort = total / numbers.length;
        System.out.println("Dizi ->" + Arrays.toString(numbers));
        System.out.println("Odds Dizi ->" + Arrays.toString(odds));
        System.out.println("Ortalama ->" + ort);

    }

    public static void multiDimensionalArrays() {

        int[][] matrix = new int[2][2]; // 2 satır 2 sütunluk bir matris oluşturduk
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        // Not: Multi dimension içiçe for kullanarak yapılabilir.

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Satır ->" + i + " Sütun ->" + j + " Değer ->" + matrix[i][j]);
            }
        }



    }


}
