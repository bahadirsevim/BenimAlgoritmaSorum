
package benimalgoritmasorum;

// SOLID Prensibine göre her class, metod tek bir isi yapmaktadir.
// Bu sebepten dolayi ürün yonetiminin icerisinde yonetime dair operasyonları tutmak istedim.
public class UrunYonetimi {
    // Bir urun sınıfı ya da ondan kalitilmis bir nesne ihtiyacı olan metodlar
    public void ekle(Urun urun){
        System.out.println("Ürün Eklendi"+urun.getAd());
    }
    public void guncelle(Urun urun){
        System.out.println("Ürün Güncellendi"+urun.getAd());
    }
    public void sil(Urun urun){
        System.out.println("Ürün Silindi"+urun.getAd());
    }
    public void bilgileriGoster(Urun urun){
        System.out.println("Ad : "+urun.getAd());
        System.out.println("Açıklama : "+urun.getAciklama());
    }
}
