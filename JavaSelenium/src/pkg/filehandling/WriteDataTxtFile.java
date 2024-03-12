package pkg.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTxtFile {
	
	private void writeData() throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
		FileWriter fw = new FileWriter(f); //Write file object
		fw.write("This RK Ranan");
		fw.write("I am from Bihar");
		fw.close();

	}
	
	private void writeDataNewLine() throws IOException {
		File f=new File("../JavaSelenium/file.txt"); // connectiom with file
//		FileWriter fw = new FileWriter(f);  // write file object
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw); //buffere write object
		bw.newLine();//move cursor new file
		bw.write("This is third line");// write data
		bw.newLine();//move cursor in new line
		bw.write("Fourth line");
		bw.close();

	}

	public static void main(String[] args) throws IOException {
		WriteDataTxtFile w = new WriteDataTxtFile();
		w.writeDataNewLine();
	}

}
