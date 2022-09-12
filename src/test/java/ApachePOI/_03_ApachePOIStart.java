package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {

        // Dosyanın yolu alındı
        String path="src/test/java/ApachePOI/resource/ApacheExcel2.xlsx";
        //String path="src\\test\\java\\ApachePOI\\resource\\ApacheExcel2.xlsx";

        // JavaDosya okuma işlemcisine dosyanın yolunu veriyoruz:
        // böylece program ile dosya arasında bağlantı oluştu
        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);

        //Dosya okuma işlemcisi üzerinden Çalışma Kitabını alıyorum
        // hafızada workbook u alıp oluşturdu
        Workbook calismaKitabi= WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istediğim isimdeki çalışma sayfasını alıyorum
        Sheet calismaSayfasi = calismaKitabi .getSheet("Sheet1");
        //Sheet calismaSayfasi=calismaKitabi.getSheetAt(0);

        //istenen Satırı alıyorum
        Row satir= calismaSayfasi.getRow(0);

        //istenen satırdaki istenen hücre aliniyor.
        Cell hucre= satir.getCell(0);

        System.out.println("hucre = " + hucre);
    }
    /**
     *  Interview SORUSU
     * 1- Excelden veri okumasını nasıl yaparsınız ?
     *    Apache.POI ile yapıyorum.
     *
     * 2- ApachePOI nedir ?
     *    Excelden veri okuma aracı, kütüphanesi
     *
     * 3- ApachePOI yi nasıl kullanıyorsun ?
     *    FileInputStream oluşturuyorum. (Dosyayı yani Exceli okuma için açma)
     *    FileInputStream -> Workbook -> Sheet -> row -> cell ilşki sırasına göre okuyorum.
     */
}
