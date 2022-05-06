package absrtactClasses;

public abstract class Personel {
    static final String sirketIsmi="Orhanlar";
    static final String sirketadresi="Malatya/ Turkiye";

    protected String isim="Değer Girlimemiş";
    protected String soyIsim="Değer Girlimemiş";
    protected String tcNo="Değer Girlimemiş";
    protected String telefon="Değer Girlimemiş";
    protected String isebaslamaTarihi="Değer Girlimemiş";
    protected String sigortaNo="Değer Girlimemiş";

    static int personelSayac=1000;

    protected String personelNo;
    protected String PersonelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }
}
