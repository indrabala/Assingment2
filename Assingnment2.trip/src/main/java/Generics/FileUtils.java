package Generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtils {
	/**
	 * @author indrabala
	 *
		public String filepath = "./Properties/SSG1.PROPERTIES.txt";
		public String filepath2 = "./Properties/tripa.xlsx";
	/**
	 * method to read from propertyfile
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String filepath = "./RESOURCEs/SSG1.PROPERTIES.txt";
	public String filepath2 = "./ExcelData/tripa.xlsx";

		public String readDataFromPropertiesFile(String Key) throws IOException {
			FileInputStream Fobj = new FileInputStream(filepath);
			Properties pObj = new Properties();
			pObj.load(Fobj);
			String value = pObj.getProperty(Key);
			return value;
		}

		// read from excel
		public String read_XL_data(String sheet, int rc, int cn) throws Throwable {
		
			String data =" ";
			Workbook wb = WorkbookFactory.create(new FileInputStream(filepath2));
			data = wb.getSheet(sheet).getRow(rc).getCell(cn).toString();
			return data;
			


			
		}

		/**
		 * method to write in excel
		 * @param sheet
		 * @param row
		 * @param cell
		 * @param value
		 * @return
		 */

		public String write_xl_data(String sheet, int row, int cell, String value)

		{
			int v = 0;
			String data1 = "";
			try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(filepath2));
				// data =
				// wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(v);
				wb.getSheet(sheet).createRow(row).createCell(cell).setCellValue(value);// createRow(row).createCell(cell).setCellValue(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return data1;
		}

		public int xl_row_Count(String sheet) {
			int rowCount = 0;
			try {
				Workbook wb = WorkbookFactory.create(new FileInputStream(filepath2));
				rowCount = wb.getSheet(sheet).getLastRowNum();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return rowCount;
		}




		
		
		
		
		
	}





	
