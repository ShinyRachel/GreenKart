package examp1;

import java.io.FileInputStream;
import java.io.IOException;
//import java.util.List;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class examp2 {

	public static void main(String[] args) throws IOException {
			
			FileInputStream file=new FileInputStream("C:\\Users\\rajuj\\eclipse-workspace\\Examp\\TestData\\shiny.xlsx");
			
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			
			XSSFSheet sheet=workbook.getSheet("Sheet1");  //	XSSFSheet  sheet=workbook.getSheetAt(0);
			
			int totalRows=sheet.getLastRowNum();
			
			int totalCells=sheet.getRow(0).getLastCellNum(); //5
			
			System.out.println("number of rows:"+ totalRows); //5
			System.out.println("number of cells:"+ totalCells);  //4
			
			for(int r=0;r<=totalRows;r++) //0
			{
				XSSFRow currentRow=sheet.getRow(r); //0 
							
				for(int c=0;c<3;c++) //1,2,3,4
				{
					XSSFCell cell=currentRow.getCell(c);
					System.out.print(cell.toString()+"\t");
					
				}
				System.out.println();
			}
			
			workbook.close();
			file.close();	
		}
}

	
