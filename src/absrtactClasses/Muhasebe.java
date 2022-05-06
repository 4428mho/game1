package absrtactClasses;

public abstract class Muhasebe extends Personel {

    protected int saatUcreti;
    protected int a;
    protected int maas;

    protected abstract  int saatUcreti();
    protected abstract int a();

    protected int maas(int saatUcreti,int a){
        int maas=saatUcreti*a;
        return maas;
    }

}
