package pkg.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataTxtFile {
	public void readData() throws IOException {
		
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
		FileReader fr = new FileReader(f);  //Read File
		
		int a;
		while((a=fr.read())!=-1) {
			System.out.println((char)a);
			
		}
	}
	
	public void readDataLineByLine() throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
		FileReader fr = new FileReader(f);  //Read File
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		while((s=br.readLine())!=null) {
			System.out.println(s);
			
		}
		
	}
  
	public static void main(String[] args) throws IOException {
		ReadDataTxtFile d = new ReadDataTxtFile();
		d.readDataLineByLine();

	}

}
//C:\ProgramData\Lenovo\USBRecoveryCreator\Downloads