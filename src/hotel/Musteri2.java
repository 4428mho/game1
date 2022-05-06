package hotel;

public class Musteri2 extends Musteri1{
    private String isim2;
    private String soyisim2;
    private String telefon2;
    private String e_mail2;
    private String cinsiyet2;

    public Musteri2() {
    }

    public Musteri2(String isim1, String soyisim1, String telefon1, String e_mail1, String cinsiyet1,
                    String isim2, String soyisim2, String telefon2, String e_mail2, String cinsiyet2) {
        super(isim1, soyisim1, telefon1, e_mail1, cinsiyet1);
        this.isim2 = isim2;
        this.soyisim2 = soyisim2;
        this.telefon2 = telefon2;
        this.e_mail2 = e_mail2;
        this.cinsiyet2 = cinsiyet2;
    }

    public String getIsim2() {
        return isim2;
    }

    public void setIsim2(String isim2) {
        this.isim2 = isim2;
    }

    public String getSoyisim2() {
        return soyisim2;
    }

    public void setSoyisim2(String soyisim2) {
        this.soyisim2 = soyisim2;
    }

    public String getTelefon2() {
        return telefon2;
    }

    public void setTelefon2(String telefon2) {
        this.telefon2 = telefon2;
    }

    public String getE_mail2() {
        return e_mail2;
    }

    public void setE_mail2(String e_mail2) {
        this.e_mail2 = e_mail2;
    }

    public String getCinsiyet2() {
        return cinsiyet2;
    }

    public void setCinsiyet2(String cinsiyet2) {
        this.cinsiyet2 = cinsiyet2;
    }

    @Override
    public String toString() {
        return "Musteri2{" +
                "isim2='" + isim2 + '\'' +
                ", soyisim2='" + soyisim2 + '\'' +
                ", telefon2='" + telefon2 + '\'' +
                ", e_mail2='" + e_mail2 + '\'' +
                ", cinsiyet2='" + cinsiyet2 + '\'' +
                "} " + super.toString();
    }
}
