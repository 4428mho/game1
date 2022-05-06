package mehmetHoca_okulProjesi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {
    static Scanner scan=new Scanner(System.in);
    static Map<String,String> ogrenciMap=new HashMap<>();
    public static void feykOgrnciEkle(){
        ogrenciMap.put("12345678911","Ali, Memiş, 2008, 3569, 12, A");
        ogrenciMap.put("12345678912","Veli, Memiş, 2008, 3559, 12, B");
        ogrenciMap.put("12345678913","Ayşe, Veli, 2007, 4569, 12, A");
        ogrenciMap.put("12345678914","Ali, Can, 2009, 1569, 12, A");
        ogrenciMap.put("12345678915","Alp, Yan, 2009, 3769, 12, A");
        ogrenciMap.put("12345678916","Sülo, Yan, 2008, 3869, 12, B");
    }

    public static void ogrenciMenu() throws InterruptedException {
        String tercih="";
        do { System.out.println("================HANİFİ KOLLEJİ=========\n" +
                "======================================\n" +
                "1- Ogrenci Listesini Yazdir==========\n" +
                "2- Soyİsimden Ogrenci Bul============\n" +
                "3- Sınıf ve ŞUbe ile Bul==============\n" +
                "4- Bilgilerini Girerek Ogreenci Ekle==\n" +
                "5- Ogrenci Kayıt Sime================\n" +
                "A- Ana Menü===========================\n" +
                "Q- Çıkış =============================\n");
            System.out.println("Lütfen menüden tercihinizi yapınız");
            tercih = scan.nextLine();
            switch(tercih){
                case "1":
                    ogrenciListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgrenciBulma();
                    break;
                case "3":
                    sinifveSubeİleOgrenciBulma();
                    break;
                case "4":
                    ogrenciEkleme();
                    break;
                case "5":
                    ogrencisil();
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
    public static void ogrenciListesiYazdir(){
        Set<Map.Entry<String,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("======================Öğrenci  Listesi ===========================\n" +
                           "==================================================================\n" +
                            "TcNo         Isim    Soyisim   D.Yılı   Okul No   Sınıf  Şube ");

        for (Map.Entry<String,String> each:ogrenciEntrySet
        ) {
            String eachKey=each.getKey();
            String eachValue=each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[]=eachValue.split(", ");
            System.out.printf("%11s  %-6s  %-8s  %-7s  %-8s  %-6s  %-6s\n", eachKey,eachValuearr[0],eachValuearr[1],eachValuearr[2],eachValuearr[3],eachValuearr[4],eachValuearr[5]);
        }
    }
    public static void soyisimdenOgrenciBulma() {
        System.out.println("Aradığınız Öğrencinin Soyismini Giriniz");
        String istenenSoyisim=scan.nextLine();
        Set<Map.Entry<String,String>>ogrnciEntrySet=ogrenciMap.entrySet();
        System.out.println("==================Soyisimden Öğrenci Bulma =======================\n" +
                           "==================================================================\n" +
                           "TcNo         Isim    Soyisim   D.Yılı   Okul No   Sınıf  Şube ");

        for (Map.Entry<String,String> each:ogrnciEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuearr[1]))
                System.out.printf("%11s  %-6s  %-8s  %-7s  %-9s  %-5s  %-6s\n", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3], eachValuearr[4], eachValuearr[5]);
        }
    }
    public static void ogrencisil() {
        System.out.println("Kayıt silmek içn Lütfen ilgili Öğrencinin Tc No'sunu giriniz");
        String sil=scan.nextLine();
        String silValue=ogrenciMap.get(sil);
        String sonucValue=ogrenciMap.remove(sil);
        try {
            boolean  sonuc=sonucValue.equals(silValue);
            System.out.println("Öğrenci Kaydı Silindi");
        } catch (Exception e) {
            System.out.println("kayıt bulunamadı");
        }
    }
    public static void ogrenciEkleme() {
        System.out.println("TcNo");
        String TcNo = scan.nextLine();

        System.out.println("İsim");
        String isim = scan.nextLine();

        System.out.println("Soyisim");
        String soyisim = scan.nextLine();

        System.out.println("D.Yılı");
        String dogumYılı = scan.nextLine();

        System.out.println("Okul No");
        String okulNo = scan.nextLine();

        System.out.println("Sınıf");
        String sinif = scan.nextLine();

        System.out.println("Şube");
        String sube = scan.nextLine();
        String eklenecekValue = isim + ", " + soyisim + ", " + dogumYılı + ", " + okulNo + ", " + sinif + ", " + sube;
        ogrenciMap.put(TcNo, eklenecekValue);
    }
    public static void sinifveSubeİleOgrenciBulma() throws InterruptedException {
        System.out.println("Aradığınız Öğrencinin Sınıfını Giriniz");
        String istenenSinif=scan.nextLine();

        System.out.println("Aradığınız Öğrencinin Şubesini Giriniz");
        String istenenSube=scan.nextLine();

        Set<Map.Entry<String,String>>ogrenciEntrySet=ogrenciMap.entrySet();
        System.out.println("==================Soyisimden Öğrenci Bulma =======================\n" +
                           "==================================================================\n" +
                           "TcNo         Isim    Soyisim   D.Yılı   Okul No   Sınıf  Şube ");

        for (Map.Entry<String,String> each:ogrenciEntrySet
        ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+" "+eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (istenenSinif.equalsIgnoreCase(eachValuearr[4])&&istenenSube.equalsIgnoreCase(eachValuearr[5])) {
                System.out.printf("%11s  %-6s  %-8s  %-7s  %-8s  %-6s  %-6s\n", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2], eachValuearr[3], eachValuearr[4], eachValuearr[5]);
            }
        }
        Thread.sleep(5000);
    }
}
