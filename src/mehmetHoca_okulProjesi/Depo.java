package mehmetHoca_okulProjesi;

import java.util.Scanner;

import static mehmetHoca_okulProjesi.Ogrenci.ogrenciMenu;

public class Depo {
    static Scanner scan=new Scanner(System.in);
    public static void anaMenü() throws InterruptedException {
        String tercih="";
        do {
            System.out.println("================HANİFİ KOLLEJİ=========\n" +
                    "======================================\n" +
                    "1- Okul Bilgileri Görüntüle===========\n" +
                    "2- Ogretmen Menü======================\n" +
                    "3- Oğrenci Menü=======================\n" +
                    "Q- Çıkış =============================\n");
            System.out.println("Lütfen menüden tercihinizi yapınız");
            tercih = scan.nextLine();
            switch (tercih){
                case "1":
                    Depo.okulBilgileriYazdır();
                    //okul bilgileri
                    break;
                case "2"://ogretmen menü
                    Ogretmen.ogretmenMenu();
                    break;
                case "3":
                    ogrenciMenu();//ogrenci
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("lütfen geçerli bir tecih giriniz");
            }
        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    private static void okulBilgileriYazdır() throws InterruptedException {
        System.out.println("================HANİFİ KOLLEJİ=========\n" +
                "\t Adres : "+Okul.adres+"\n"+
                "\t Telefon : "+Okul.telefon);
        Thread.sleep(5000);

    }

    public static void projeDurdur() {
        System.out.println("Menüden çıktınız");
        System.exit(0);
    }
}
