package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;

public class ExcelFileReader {
	
	public static File file;
  	public static CSVReader csvReader;
  	
	public static Iterator<Object[]> readDataFromCsv(String filePath) throws IOException {
		  file = new File(filePath);	
		  csvReader = new CSVReader(new FileReader(file));
		  String[] nextRecord;
		  List<Object []> data = new ArrayList<>();
		  while ((nextRecord = csvReader.readNext()) != null) {
			  data.add(nextRecord);
		  }
	      return data.iterator();
		 
	  }
}


