
package benimalgoritmasorum;

public class Tekstil extends Urun{
    // Sadece tekstil urunune ozel ozellikler hazirlandi
    // renk,malzeme ve cinsiyete diger sınıflardan ulasilabilmesini istedigimizdenve sadece yilda islem yapacagimizdan yili private tanımladım.
    private int yil;
    String malzeme;
    String renk;
    String cinsiyet;

    
    // Tekstil isimli clası tanımlayacak olan kisilerin kalitilan sinif bilgi,lerini ve aynı zamanda tekstil sınıfının bilgilerini girmeli
    public Tekstil(String ad, String aciklama, int stok, int yil, String malzeme, String renk, String cinsiyet) {
        super(ad, aciklama, stok);
        this.yil = yil;
        this.malzeme = malzeme;
        this.renk = renk;
        this.cinsiyet = cinsiyet;
    }
    
    // Kapsullemeden sadece yil icin yararlanildi. Belli bir yilin altindaki urunler 2000 olarak gozukecek.
    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil <=2010){
            this.yil = 2000;
        }
        else{
            this.yil = yil;
        }
    }

}
