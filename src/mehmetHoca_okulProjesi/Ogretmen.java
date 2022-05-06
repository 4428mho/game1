package mehmetHoca_okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan=new Scanner(System.in);
    static Map<String, String>ogretmenlerMap=new HashMap<>();
    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("12345678911","Ahmet, Memiş, 1998, Fizik");
        ogretmenlerMap.put("12345678912","Mehmet, Memiş, 1980, Kimya");
        ogretmenlerMap.put("12345678913","Ali, Veli, 1984, Matemetik");
        ogretmenlerMap.put("12345678914","Hasan, Can, 1998, Biyoloji");
    }
    public static void ogretmenMenu() throws InterruptedException {
        String tercih="";
        do { System.out.println("================HANİFİ KOLLEJİ=========\n" +
                "======================================\n" +
                "1- Ogretmen Listesini Yazdir==========\n" +
                "2- Soyİsimden Ogretmen Bul============\n" +
                "3- Branştan Ogretmen Bul==============\n" +
                "4- Bilgilerini Girerek Ogretmen Ekle==\n" +
                "5- Ogretmen Kayıt Sime================\n" +
                "A- Ana Menü===========================\n" +
                "Q- Çıkış =============================\n");
            System.out.println("Lütfen menüden tercihinizi yapınız");
            tercih = scan.nextLine();
            switch(tercih){
                case "1":
                    ogretmenListesiYazdir();
                    break;
                case "2"://Soyİsimden Ogretmen Bul
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branştanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                    ogretmensil();
                    break;
                case "A":
                    Depo.anaMenü();
                case "a":
                    Depo.anaMenü();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lütfen geçerli bir tercih giriniz");

            }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void ogretmensil() {
        System.out.println("Kayıt silmek içn Lütfen ilgili personelin Tc No'sunu giriniz");
        String sil=scan.nextLine();
        String silValue=ogretmenlerMap.get(sil);
        String sonucValue=ogretmenlerMap.remove(sil);
        try {
            boolean  sonuc=sonucValue.equals(silValue);
            System.out.println("Personel Kaydı Silindi");
        } catch (Exception e) {
            System.out.println("kayıt bulunamadı");
        }
    }

    public static void ogretmenEkleme() {
        System.out.println("TcNo");
        String TcNo=scan.nextLine();
        System.out.println("İsim");
        String isim=scan.nextLine();
        System.out.println("Soyisim");
        String soyisim=scan.nextLine();
        System.out.println("D.Yılı");
        String dogumYılı=scan.nextLine();
        System.out.println("Branş");
        String brans=scan.nextLine();
        String eklenecekValue=isim+", "+soyisim+", "+dogumYılı+", "+brans;
        ogretmenlerMap.put(TcNo,eklenecekValue);

    }

    public static void branştanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradığınız Öğretmenin Branşını Giriniz");
        String istenenSoyisim=scan.nextLine();
        Set<Map.Entry<String,String>>ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("=========Branş ile Öğretmen Arama=============\n" +
                "==============================================\n" +
                "TcNo         Isim    Soyisim   D.Yılı   Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[3])) {
                System.out.printf("%11s  %-6s  %-8s  %-7s  %-6s\n", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3]);
            }
        }
        Thread.sleep(5000);
    }



    public static void soyisimdenOgretmenBulma() {
        System.out.println("Aradığınız Öğretmenin Soyismini Giriniz");
        String istenenSoyisim=scan.nextLine();
        Set<Map.Entry<String,String>>ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("=========Soyisimle Öğretmen Arama=============\n" +
                           "==============================================\n" +
                           "TcNo         Isim    Soyisim   D.Yılı   Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[]=eachValue.split(", ");
            if(istenenSoyisim.equalsIgnoreCase(eachValuearr[1]))
            System.out.printf("%11s  %-6s  %-8s  %-7s  %-6s\n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3]);
        }
    }

    public static void ogretmenListesiYazdir(){
        Set<Map.Entry<String,String>>ogretmenEntrySet=ogretmenlerMap.entrySet();
        System.out.println("================Öğretmen Listesi =============\n" +
                           "==============================================\n" +
                           "TcNo         Isim    Soyisim   D.Yılı   Branş");

        for (Map.Entry<String,String> each:ogretmenEntrySet
             ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[]=eachValue.split(", ");
            System.out.printf("%11s  %-6s  %-8s  %-7s  %-6s\n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3]);
        }
    }
}
