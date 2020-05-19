
package benimalgoritmasorum;

import java.util.Scanner;

public class BenimAlgoritmaSorum {

    /**
     * Algoritma ve programlama 2 Dersi için hazırladığım ve 
     * OOP kavramlarını tamamen kullandığım örnek bir proje.
     * 
     * Okul No : 190542011
     * Adı Soyadı : Bahadır SEVİM
     * Yazılım Muh. 1.sınıf MTOK Örgün
     * 
     * @param args
     */
    
    // Odev varligini internete ulasim sikintimdan oturu cok gec ogrenebildim.
    // Videonuzda belirttiğiniz butun kavramları yansittigimi dusunuyorum.
    // Abstract ve interface gibi kavramları ekstra kullanmak isterdim fakat gercekten surem yetismedi.
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in, "ISO-8859-9"); // Türkçe karakterleri de okuması için
        System.out.println("Merhaba! Alışveriş Sitesi Simülasyonuna hoşgeldiniz.");
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Yapmak istediğiniz işlemi seçiniz : \n"
                         + "1 - Ekle \n"
                         + "2 - Güncelle \n"
                         + "3 - Sil \n"
                         + "4 - Bilgileri Göster");
        int islem = s.nextInt();
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Hangi Kategorideki ürünlerle çalışacaksınız? \n"
                         + "1 - Bilgisayar \n"
                         + "2 - Tekstil");
        int kategori = s.nextInt();
        
        System.out.println("----------------------------------------------------");
        
        UrunYonetimi urunYonetimi = new UrunYonetimi();
        Bilgisayar bilgisayar;
        Tekstil tekstil;

        if(kategori ==1){
            System.out.println("Bilgisayar Adı : ");
            String ad = s.nextLine();
            System.out.println("Bilgisayar Açıklaması : ");
            String aciklama = s.nextLine();
            System.out.println("Bilgisayar Stoğu : ");
            int stok = s.nextInt();
            System.out.println("Bilgisayar Markası : ");
            String marka = s.nextLine();
            System.out.println("Bilgisayar garantisi (var/yok) : ");
            String garanti = s.next();
            
            bilgisayar = new Bilgisayar(ad, aciklama, stok, marka, garanti);
            // çok biçimlilikten bir örnek daha vermeye çalıştım.
            switch(islem){
                case 1 : 
                    urunYonetimi.ekle(bilgisayar);
                    break;
                case 2 :
                    urunYonetimi.guncelle(bilgisayar);
                    break;
                case 3 :
                    urunYonetimi.sil(bilgisayar);
                    break;
                case 4 :
                    urunYonetimi.bilgileriGoster(bilgisayar);
                    break;
                default :
                    System.err.println("Hatalı bir tuşa bastınız.");
                    break;
            }
        }
        
        else if(kategori == 2){
            System.out.println("Tekstil Ürününün Adı : ");
            String ad = s.nextLine();
            System.out.println("Tekstil Ürününün Açıklaması : ");
            String aciklama = s.nextLine();
            System.out.println("Tekstil Ürününün Stoğu : ");
            int stok = s.nextInt();
            System.out.println("Tekstil Ürününün Yılı : ");
            int yil = s.nextInt();
            System.out.println("Tekstil Ürününün Malzemesi : ");
            String malzeme = s.nextLine();
            System.out.println("Tekstil Ürününün Rengi : ");
            String renk = s.nextLine();
            System.out.println("Tekstil Ürününün Malzemesi : ");
            String cinsiyat = s.nextLine();
            
            tekstil = new Tekstil(ad, aciklama, stok, yil, malzeme, renk, cinsiyat);
            switch(islem){
                case 1 : 
                    urunYonetimi.ekle(tekstil);
                    break;
                case 2 :
                    urunYonetimi.guncelle(tekstil);
                    break;
                case 3 :
                    urunYonetimi.sil(tekstil);
                    break;
                case 4 :
                    urunYonetimi.bilgileriGoster(tekstil);
                    break;
                default :
                    System.err.println("Hatalı bir tuşa bastınız.");
                    break;
            }
        }
        
        
        
    }
    
}
