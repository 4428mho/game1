package hotel;

public class Musteri1 {
    private String isim1;
    private String soyisim1;
    private String telefon1;
    private String e_mail1;
    private String cinsiyet1;



    public Musteri1() {
    }

    public Musteri1(String isim1, String soyisim1, String telefon1, String e_mail1, String cinsiyet1) {
        this.isim1 = isim1;
        this.soyisim1 = soyisim1;
        this.telefon1 = telefon1;
        this.e_mail1 = e_mail1;
        this.cinsiyet1 = cinsiyet1;
    }

    public String getIsim1() {
        return isim1;
    }

    public void setIsim1(String isim1) {
        this.isim1 = isim1;
    }

    public String getSoyisim1() {
        return soyisim1;
    }

    public void setSoyisim1(String soyisim1) {
        this.soyisim1 = soyisim1;
    }

    public String getTelefon1() {
        return telefon1;
    }

    public void setTelefon1(String telefon1) {
        this.telefon1 = telefon1;
    }

    public String getE_mail1() {
        return e_mail1;
    }

    public void setE_mail1(String e_mail1) {
        this.e_mail1 = e_mail1;
    }

    public String getCinsiyet1() {
        return cinsiyet1;
    }

    public void setCinsiyet1(String cinsiyet1) {
        this.cinsiyet1 = cinsiyet1;
    }

    @Override
    public String toString() {
        return "Musteri1{" +
                "isim1='" + isim1 + '\'' +
                ", soyisim1='" + soyisim1 + '\'' +
                ", telefon1='" + telefon1 + '\'' +
                ", e_mail1='" + e_mail1 + '\'' +
                ", cinsiyet1='" + cinsiyet1 + '\'' +
                '}';
    }
}
