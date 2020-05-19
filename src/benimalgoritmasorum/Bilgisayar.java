
package benimalgoritmasorum;

public class Bilgisayar extends Urun {
    // sadece bilgisayara ozel iki ozellik tanimladim
    private String marka;
    private String garanti;

    // Yapıcı blok olusturulurken super metodunun gorevi kalitilan sınıfın ozelliklerini de bos bırakmamaktir.
    public Bilgisayar(String ad, String aciklama, int stok, String marka, String garanti) {
        super(ad, aciklama, stok);
        this.marka = marka;
        this.garanti = garanti;
    }

    //Kapsulleme avantajlarindan yararlanmak
    public String getMarka() {
        return marka.toUpperCase();
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getGaranti() {
        return garanti;
    }

    public void setGaranti(String garanti) {
        this.garanti = garanti;
    }

    // Cok bicimlilikten bir ornek olusturmaya calistim :)
    @Override
    public void setStok(int stok) {
        if(super.getStok() <=0){
            System.out.println("Ürün ön siparişe açıktır.");
        }
        else{
            System.out.println(super.getStok());
        }
    }
    

}
