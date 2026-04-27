package A5_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodMain {

    // Not: Java dilinde methodlar bağımsız hareket edemezler.
    // Bir class içersinde tanımlı olmaları gerekir.


    // String[] args -> methods parameter listesi
    // public -> access modifier -> public her yerden çağırılabilir.
    // void -> return Type => bir sonuç dödnürmediği anlamına gelir.
    // static console terminal uygulamalarına özgü bir yapı.
    public static void main(String[] args) {

        // 1. örnek

        showMessage("Merhaba "); // method çağırma
        showMessage(" Nasılsınız ");
        showMessage(" Güzel BİR gün"); // güzel bir gün

        System.out.println("Merhaba ".trim().toLowerCase());
        System.out.println("Nasılsınız ".trim().toLowerCase());
        System.out.println(" Güzel Bir  gün".trim().toLowerCase());

        // ikinci örnek

        double[] averages = new double[3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < averages.length; i++) {

            showMessage("ilk sayıyı giriniz");
            double firstNumber = scanner.nextDouble();
            showMessage("İkinci sayıyı giriniz");
            double secondNumber = scanner.nextDouble();

            averages[i] =    average(firstNumber, secondNumber);
        }

        showMessage("Ortalama Sonuçları ->" + Arrays.toString(averages));

    }


    // reusable -> tekrar kullanılabilir olmasını sağlıyor.
    // tek bir yerden test edilebilir.
    // birim testleri için method kullanımı önemli
    public static  void  showMessage(String message) {
        System.out.println(message.trim().toLowerCase());
    }


    // methoıdlar aynı isimde olup farklı parametre sayılarına sahip olabilirler veya
    // aynı isimde olup  aynı sayıda farklı parametre tiplerine sahip olabilirler.
    // Biz bu olaya method overload ismini veriyoruz.

    // return varsa void olamaz
    // Methodları ayırırken dikkat etmemiz gereken konu
    // Her bir method kendisine ait işlemleri yapacak düzeyde tanımlanmalıdır. Atomic olmalıdır.
    public static  int  average(int a, int b){
        return (a + b) / 2;
    }

    public static  double average(double a, double b){
        return  (a + b) / 2;
    }

    // method overloading
    public static  int average(int a,int b,int c){
        return (a+b+c) / 3;
    }

    // String, Number Methods
    public  static void javaAPIMethods() {

        String name = "Ali Tandoğan";

        char c =  name.charAt(2); // i
        String s =  name.substring(3,5);
        String name2 =  name.replace('ğ','g');

        int a = Integer.getInteger("10");
        int b = Integer.compare(10,15);

        boolean b1 =  Boolean.parseBoolean("false");

    }

}
