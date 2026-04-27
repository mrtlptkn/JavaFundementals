package A3_Loops;

import java.util.Scanner;

public class WhileLoopMain {

    public static void main(String[] args) {

      // whileLoopSample01();
      // whileLoopSample2();
        doWhileSample();
    }

    public  static  void whileLoopSample01(){
        // while loop sample
        int sayac = 0;

        // koşul sağlkanana kadar döngü devam eder.
        while (sayac % 2 == 0 && sayac < 10){
            sayac+=2;
        }

        System.out.println("Sayac -> " + sayac);
    }

    // 5'in katı olan bir sayıyı bulana kadar devam eden bir program algoritması
    public  static void whileLoopSample2(){
        // 1 ile 100 arasında rastgele bir sayı üretelim ve bu sayı 5'e bölününce sıfır kalanı verene kadar yeni bir sayı üretmeye devam edelim.

        int rastgeleSayi = (int)(Math.random() * 101); // 0 ile 100 arasında rastgele bir değer seçer
        System.out.println("Yeni Sayı1 ->"   + rastgeleSayi);

        // üretilen sayı 5'in katları olmak zorunda
        // İlk 5'in katı olan sayıyı bulduğumuzda program sonları
        while (rastgeleSayi % 5 != 0){
            rastgeleSayi = (int)(Math.random() * 101);
            System.out.println("Yeni Sayı2 ->"   + rastgeleSayi);
        }

        System.out.println("Sonuc ->"  + rastgeleSayi);
    }

    // 0 ile kullanıcı programdan çıkana kadar döngü içerisinde
    // toplama, çıkarma, çarpma, bölme gibi işlemler yapılır
    // 0 bölünme kontrolü vardır
    // olmayan menü seçiminde bir kontrol yapısı var
    public  static  void doWhileSample(){
        // Do-While Örneği: Kullanıcıdan geçerli bir sayı alana kadar devam eden basit hesap makinesi
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            // Menü göster
            System.out.println("\n===== HESAP MAKİNESİ =====");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("0. Çıkış");
            System.out.println("==========================");
            System.out.print("Seçiminiz (0-4): ");

            // Kullanıcıdan geçerli input alana kadar devam et
            while (!scanner.hasNextInt()) {
                System.out.println("Hata! Lütfen sayı giriniz.");
                System.out.print("Seçiminiz (0-4): ");
                scanner.next(); // Geçersiz inputu temizle
            }
            secim = scanner.nextInt();

            // Seçim 0-4 arasında değilse uyarı ver
            if (secim < 0 || secim > 4) {
                System.out.println("Geçersiz seçim! Lütfen 0-4 arası bir sayı girin.");
                continue; // Döngünün başına dön
            }

            // Çıkış seçeneği değilse işlemi yap
            if (secim != 0) {
                System.out.print("Birinci sayıyı girin: ");
                double sayi1 = scanner.nextDouble();

                System.out.print("İkinci sayıyı girin: ");
                double sayi2 = scanner.nextDouble();

                double sonuc = 0;
                boolean gecerliIslem = true;

                switch (secim) {
                    case 1:
                        sonuc = sayi1 + sayi2;
                        System.out.printf("Sonuç: %.2f + %.2f = %.2f\n", sayi1, sayi2, sonuc);
                        break;
                    case 2:
                        sonuc = sayi1 - sayi2;
                        System.out.printf("Sonuç: %.2f - %.2f = %.2f\n", sayi1, sayi2, sonuc);
                        break;
                    case 3:
                        sonuc = sayi1 * sayi2;
                        System.out.printf("Sonuç: %.2f × %.2f = %.2f\n", sayi1, sayi2, sonuc);
                        break;
                    case 4:
                        if (sayi2 != 0) {
                            sonuc = sayi1 / sayi2;
                            System.out.printf("Sonuç: %.2f ÷ %.2f = %.2f\n", sayi1, sayi2, sonuc);
                        } else {
                            System.out.println("Hata! Sıfıra bölme yapılamaz.");
                            gecerliIslem = false;
                        }
                        break;
                }

                if (gecerliIslem) {
                    System.out.println("İşlem başarıyla tamamlandı!");
                }
            }

        } while (secim != 0); // Kullanıcı 0 girene kadar devam et,
        // çıkış yapmadığı sürece döngü devam etemli

        System.out.println("Hesap makinesi kapatılıyor. Hoşça kalın!");
        scanner.close();
    }
}
