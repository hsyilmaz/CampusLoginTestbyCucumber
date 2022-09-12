package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _07_Soru {
/*
      Bir önceki soruda kullanıcıdan bu sefer sütun numarası
      isteyiniz ve o sütundaki bütün bilgileri yazdırınız
*/
        public static void main(String[] args) {
            System.out.println("sutun no gir: ");
            Scanner scan = new Scanner(System.in);
            int colNum = scan.nextInt();
            System.out.println(find(colNum));
        }
        public static String find(int cNum){
            String column="";
            String path="src/test/java/ApachePOI/resource/LoginData.xlsx";

            Workbook workbook;
            try {
                FileInputStream inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = 0; i < sheet.getPhysicalNumberOfRows() ; i++) {
                if(sheet.getRow(i).getPhysicalNumberOfCells()>cNum)
                    column+=sheet.getRow(i).getCell(cNum)+"\n";
                    }
            return column;
            }

}

