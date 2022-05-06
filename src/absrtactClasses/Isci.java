package absrtactClasses;

public class Isci extends Muhasebe{

    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int a() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "saatUcreti=" + saatUcreti +
                "\n a=" + a +
                "\n maas=" + maas +
                "\n isim='" + isim + '\'' +
                "\n soyIsim='" + soyIsim + '\'' +
                "\n tcNo='" + tcNo + '\'' +
                "\n telefon='" + telefon + '\'' +
                "\n isebaslamaTarihi='" + isebaslamaTarihi + '\'' +
                "\n sigortaNo='" + sigortaNo + '\'' +
                "\n personelNo='" + personelNo + '\'' +
                "} ";
    }

    public static void main(String[] args) {
        Isci isci1=new Isci();
        isci1.saatUcreti= isci1.saatUcreti();
        isci1.a= isci1.a();
        isci1.maas=isci1.maas(isci1.saatUcreti, isci1.a);
        isci1.isim="Hasan";
        isci1.soyIsim="Veli";
        System.out.println(isci1);

    }

}
