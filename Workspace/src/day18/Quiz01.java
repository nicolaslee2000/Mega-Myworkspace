package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;


class CreateFile{
	String str;
	String fileName;
	CreateFile(){
		SetTxt();
		String fileName = new SimpleDateFormat("YYYY_MM_dd_HH_mm").format(System.currentTimeMillis())+".txt";
		//try(resource)
		try (FileWriter fw = new FileWriter(fileName)){
			fw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	void SetTxt(){
		while(true) {
			String msg = JOptionPane.showInputDialog("type your text. Type \"Exit\" to exit");
			if(msg.equalsIgnoreCase("exit")) {
				break;
			}
			str += msg + "\n";
		}
		
		
	}
	
}

class OpenFile{
	String FileName;
	OpenFile() throws Exception{
		setDate();
		FileReader file = new FileReader(FileName);
		BufferedReader reader = new BufferedReader(file);
		
		String s;
		
		while(reader.ready()) {
			s = reader.readLine();
			System.out.println(s);
		}
		
		reader.close();
		file.close();
	}
	void setDate() {
		FileName = JOptionPane.showInputDialog("year") + "_" +
				JOptionPane.showInputDialog("month(00)") +"_" +
				JOptionPane.showInputDialog("day") +"_" +
				JOptionPane.showInputDialog("hour") +"_" +
				JOptionPane.showInputDialog("minute")+".txt";
	}
	void getWordCnt() throws Exception {
		FileReader file = new FileReader(FileName);
		BufferedReader reader = new BufferedReader(file);
		String[] words = null;
		String line= "";
		while(reader.ready()) {
			line += reader.readLine()+" ";
		}
		words = line.split("\\s+");
		System.out.println(words.length);
		reader.close();
		file.close();
	}
	
}

public class Quiz01 {
	public static void main(String[] args) {
		//new CreateFile();
		try {
			new OpenFile().getWordCnt();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
