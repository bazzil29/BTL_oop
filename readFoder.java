import java.io.*;
import java.util.*;

public class readFoder{
	readFoder(String foderPath){
		dataClass testDataClass = new dataClass();
		readOneFile testReadOneFile = new readOneFile();
		try{
			File project = new File(foderPath);
			File[] listFile = project.listFiles();
			ArrayList<String> listFilesLocation = new ArrayList<String>();
			if(listFile!=null)
				for(File tmp:listFile){
					listFilesLocation.add(tmp.toString());
				}

			for(String tmp:listFilesLocation){
				testDataClass.addClass(testReadOneFile.analyzeOneFile(tmp));
			}
			testDataClass.printAllClass();

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}