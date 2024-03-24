package testPackage;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelUtility {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:/Users/Khaled Zaman/OneDrive/Desktop/pc_backup/NK TECH Solutions/Automation/pdf/testing.xlsx");

            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Sheet1");

            Row row = sheet.getRow(3);
            Cell cell = row.getCell(1);

            System.out.println(cell);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
