package A3_Loops;

import java.util.Scanner;

public class ForLoopMain {

    public static void main(String[] args) {

        // for loop sample
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        sample01();

    }



    // kullanıcıdan istenilen sayıda değer alıp bu değerleri topladan programın algoritmasını yazalım
    public  static  void  sample01(){

        // Input (System.in) -> count + Process: (if else + loops) + OUTPUT (total ekrana yazdır).
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int count = scanner.nextInt();

        int total = 0; // global variable, bu değer doğru hesaplama yapabilmek için döngü dışında olmalıdır.


        for (int i = 1; i <= count; i++) {
            System.out.print(i + ".Sayı giriniz");
            int number = scanner.nextInt(); // şuan girilen sayı
            total+=number;
            // total = total + number;
            //TODO bu sayıların toplamını hesaplayarak ekrana yazdırın
            // System.out.println("Sayıların toplamı " + total); her adımda toplam yapmak yerine uygulama
            // sonlanmadan önce genel toplam yeterlidir. Bu satırı for dışına alalım.
        }

        System.out.println("Sayıların toplamı " + total);



    }



}
