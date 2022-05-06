package JavaLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lamda01 {
    public static void main(String[] args) {
        /*
   1) Lambda "Functional Programming"-->mathod(action) kullanma pr dili.
      Lambda --> mathod create  etme değil mevcut method'ları(library)secip kullanmaktır...
      Lambda  kendi başına tanımlanabilen parametre alıp gönderebilen fonksiyonlardır.
      Lambda'lar sayesinde daha az kod ve hızlı geliştirme sağlanabilmektedir.
      Java 8 ile gelen bu özellik, Java 8’in en önemli özelliğidir.

      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
       ve hatasiz code yazma acilarindan cok faydalidir.
   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
      Lambda kullanmak hatasız code kullanmaktır.

          Collections Nedir?
          Çoğu yazılım tek tek öğeler yerine öğelerden oluşan toplulukları depolar ve onlar üzerinde işlem
          yapar. Array'ler onlardan birisidir. Java Collections Framework, arraylerle yapılan işleri daha kolay
          yaptığı gibi, daha fazlasını da yapar.
          Java'da bir koleksiyon (collection - bazen container, ambar diye adlandırılır) nesnelerden oluşan bir
          topluluğu bir arada tutan bir yapıdır. 'Collections Framework' ise arayüzler ve onların kurgularından
          (implementations) oluşur.
*/
        List<Integer> sayı = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        for (Integer k : sayı) {
            System.out.print(k + " ");
        }
        System.out.println();
        sayı.stream().forEach(t -> System.out.print(t + " "));
        System.out.println();
        sayı.stream().forEach(System.out::print);//method referance boşlıklu yazdırmadı
        System.out.println();
        sayı.stream().forEach(Lamda01::yazdir); //clastan method çağırıp yazdırıdık seed(tohum);
        System.out.println("\n*****");
        sayı.stream().filter(t -> t % 2 == 0).forEach(Lamda01::yazdir);
        System.out.println("\n*****");
        for (Integer k : sayı
        ) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
        }
        System.out.println("\n*****");
        sayı.
                stream().
                filter(Lamda01::çiftsayıbul).
                forEach(Lamda01::yazdir);

        System.out.println("\n*****");
        sayı.stream().filter(Lamda01::amethod).forEach(Lamda01::yazdir);
        System.out.println("\n*****");
        sayı.stream().filter(Lamda01::bmethod).forEach(Lamda01::yazdir);
        System.out.println("\n*****");
        sayı.stream().filter(t -> t > 34 || t % 2 == 0).forEach(Lamda01::yazdir);
        System.out.println("\n*****");
        /*
 stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
 forEach() :datanin parametresine gore her bir elemanı isler
 t-> : Lambda operatoru
  Lambda Expression-->(parameter list) -> {action body}
      Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
      -> Arrow-token: Argüman listesi ile expression gövdesini birbirine bağlamak için kullanılır.
      Body: Expressionları ve statementları içerir.

     Bir kod bloğundan oluşan bir body...
     Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
     Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.

         () -> {
          double pi = 3.1415;
             return pi;
         };
  Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir
  kullanıcıdan sayı alacaksınız dur diyene kadar. rondom dan silinecek sayı adedi al 1 sayı kalana kadar devam et

 */
        printElStuructured(sayı);
        System.out.println("\n   ***   ");
        printElFunctional(sayı);
        System.out.println("\n   ***   ");
        printElFunctional1(sayı);
        System.out.println("\n   ***   ");
        printElFunctional2(sayı);
        System.out.println("\n   ***   ");
        printCiftElSturctured(sayı);
        System.out.println("\n   ***   ");
        printCiftElFunctional(sayı);
        System.out.println("\n   ***   ");
        printCiftElFunctional1(sayı);
        System.out.println("\n   ***   ");
        printCiftOtzKckFunctional(sayı);
        System.out.println("\n   ***   ");
        printCiftOtzBykFunctional(sayı);
        System.out.println("\n   ***   ");
    }

    //Task : "Structured Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printElStuructured(List<Integer> sayi) {
        for (Integer w : sayi) {
            System.out.print(w + " ");
        }
    }
    //Task : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printElFunctional(List<Integer> sayi) {
        sayi.stream().forEach((t) -> System.out.print(t + " "));
    }

    /*
        stream() : datalari yukaridan asagiya akis sekline getirir. Stream bir interface olduğundan dolayı doğrudan nesne almaz.
        forEach() :datanin parametresine gore her bir elemanı isler
        t-> : Lambda operatoru
         Lambda Expression-->(parameter list) -> {action body}
             Parameter list: Fonksiyonun parametreleri tanımlanır. Hiç parametre geçirmeden boşta olabilir.
             -> Arrow-token: Argüman listesi ile expression gövdesini birbirine bağlamak için kullanılır.
             Body: Expressionları ve statementları içerir.
​
            Bir kod bloğundan oluşan bir body...
            Bu tip lambda body, block body olarak bilinir. Blok gövdesi, lambda gövdesinin birden çok ifade içermesine izin verir.
            Bu ifadeler parantez içine alınır ve parantezlerden sonra noktalı virgül eklemeniz gerekir.
​
                () -> {
                 double pi = 3.1415;
                    return pi;
                };
       ahanda trick köşeşinde bugun :   Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir
​
        */
    public static void printElFunctional1(List<Integer> sayi) {
        sayi.stream().forEach(System.out::print);//method reference--> System.out yapısında prin methodu refere et
        // bu action task'deki aynı satıra  ve bosluk ile yazmayı karşılmaz bubun için
        // seed(tohum) method create edilip refere edilmeli
    }

    public static void yazdiir(int a) {// verilen int degeri aynı satırda bosluk bırakarak yazdırma action yapan seed(tohum) method create edildi
        System.out.print(a + " ");
    }

    public static void printElFunctional2(List<Integer> sayi) {
        sayi.stream().forEach(Lamda01::yazdiir);//method reference--> System.out yapısında prin methodu refere et
    }

    // Task : structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElSturctured(List<Integer> sayi) {
        for (Integer w : sayi) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //Task : functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftElFunctional(List<Integer> sayi) {

        sayi.
                stream().
                filter(t -> t % 2 == 0).
                forEach(Lamda01::yazdiir);

    }

    public static boolean ciftBul(int a) {//seed(tohum) method kendisine verile int degerin cift olmasını kontrol eder

        return a % 2 == 0;
    }

    public static void printCiftElFunctional1(List<Integer> sayi) {

        sayi.
                stream().//list elemanlrı akısa alındı
                filter(Lamda01::ciftBul).//cift bul method refere edilerek akısdaki elemalar filtrelendi(cift sayı)
                forEach(Lamda01::yazdiir);//fitre den gelen elemanlar yazdır() method refer edilerek print edildi

    }

    //Task : functional Programming ile list elemanlarinin 34 den kucuk cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftOtzKckFunctional(List<Integer> sayi) {
        sayi.
                stream().
                // filter(t -> t % 2 == 0 && t < 34).
                        filter(Lamda01::ciftBul).//method ref.
                filter(t -> t < 34).//lambda exp.
                forEach(Lamda01::yazdir);
    }

    //Task : functional Programming ile list elemanlarinin 34 den buyk veya cift olanalrini ayni satirda aralarina bosluk birakarak print ediniz.


    public static void printCiftOtzBykFunctional(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 || t > 34).//çift veya 34'den buyuk elelmaları filtreler 44 63 65 38
                // filter(Lambda01::ciftBul).//method ref.
                // filter(t -> t >34).//lambda exp.
                        forEach(Lamda01::yazdir);
    }

    public static void yazdir(int a) {
        System.out.print(a + " ");
    }
    public static void yazdirr(double a) {
        System.out.print(a + " ");
    }

    public static boolean çiftsayıbul(int a) {
        return a % 2 == 0;

    }

    public static boolean teksayıbul(int a) {
        return a % 2 != 0;
    }
        public static boolean amethod ( int a){
            return a < 66 && a % 2 != 0;
        }

        public static boolean bmethod ( int a){
            return a > 34 || a % 2 == 0;
        }

    public static void yazdir(Double aDouble) {
    }
}
