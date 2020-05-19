
package benimalgoritmasorum;

// Diger urunlerin tureyecegi urun sinifi olusturuldu.
public class Urun {
    // en az 3 adet olmak uzere ozellikler verildi.
    // Kapsulleme imkanindan yararlanabilmek icin hepsi private olarak verildi.
    private String ad;
    private String aciklama;
    private int stok;
    
    // her tanimlandigindan belirli parametreleri alan yapici blok insa edildi.
    public Urun(String ad, String aciklama, int stok) {
        this.ad = ad;
        this.aciklama = aciklama;
        this.stok = stok;
    }
    
    // Kapsulleme olanaklarindan yararlanabilmek icin getter setter metodlari yazildi.
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    // Kapsullemenin sunmus oldugu guzellikler.
    // Gelen stok degeri 0 ise ya da altında bir degerse stokta olmadigini belirt.
    public int getStok() {
        if(this.stok <=0){
            System.out.println("Ürün stokta yok!");
        }
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    
    
}
