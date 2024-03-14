package pkg.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyData {
	
	public void CopyTheData() throws IOException {
		File f1 = new File("../JavaSelenium/file.txt");
		File f2 = new File("../JavaSelenium/file2.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		String s=null;
		
		while((s=br.readLine()) !=null) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		br.close();
		


	}

	public static void main(String[] args) throws IOException {
		CopyData cd = new CopyData();
		cd.CopyTheData();

	}

}
