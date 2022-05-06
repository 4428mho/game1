package JavaLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LambdaC02 {
    public static void main(String[] args) {
        //map()--> Stream içerisindeki elemanları başka tiplere
        // dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, -35, 20, 63, 21, -8, 38, 15));
        CiftKareYazdır(sayi);//1156 484 256 400 64 1444
        System.out.println("\n *****  ");
        TekKupler(sayi);
        System.out.println("\n ************");
        Çiftkare(sayi);
        System.out.println("\n ************");
        Max(sayi);
        System.out.println("\n ************");
        rd(sayi);
        tp(sayi);

    }

    public static void CiftKareYazdır(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lamda01::ciftBul).
                map(t -> t * t).
                forEach(Lamda01::yazdir);

    }

    public static void TekKupler(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lamda01::teksayıbul).
                map(t -> t * t * t + 1).
                forEach(Lamda01::yazdir);

    }

    public static void Çiftkare(List<Integer> sayi) {
        sayi.
                stream().
                filter(Lamda01::ciftBul).
                map(Math::sqrt).
                forEach(Lamda01::yazdirr);

    }

    // Task : list'in en buyuk elemanini yazdiriniz
    public static void Max(List<Integer> sayi) {
        Optional<Integer> maxSayi = sayi.stream().reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi);
    }

    public static void rd(List<Integer> sayi) {
        Optional<Integer> maxSayi2 = sayi.stream().filter(Lamda01::ciftBul).map(t -> t * t).reduce(Math::max);
        System.out.println("maxSayi = " + maxSayi2);
    }

    public static void tp(List<Integer> sayi) {


        System.out.println();
        int sayi3=sayi.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sayi.stream().reduce(0, (a, b) -> a + b));
        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);
    }

    public static void tpp(List<Integer> sayi) {
          Optional<Integer> toplam1= sayi.stream().reduce(Integer::sum);
    }
}