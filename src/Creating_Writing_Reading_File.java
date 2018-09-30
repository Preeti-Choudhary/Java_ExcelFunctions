import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Creating_Writing_Reading_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Creating new file
		File F = new File("C:\\Workspace\\Module7\\sample.txt");
		F.createNewFile();

		//writing into file
		FileWriter fw = new FileWriter("C:\\Workspace\\Module7\\sample.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("I am Learning java");
		bw.newLine();
		bw.write("I am on Line2");
		bw.newLine();
		bw.write("I am on Line3");
		bw.newLine();
		bw.write("I am on Line4");
		bw.newLine();
		bw.write("I am on Line5");
		bw.flush();
		
		//reading from file
		//String str[]=new String[10];
		//Object obj[]=new Object[10];
		ArrayList<String> AL=new ArrayList();
		FileReader FR = new FileReader("C:\\Workspace\\Module7\\sample.txt");
		
		BufferedReader BR = new BufferedReader(FR);
	
		String x="";
		while((x= BR.readLine())!= null)
		{
		AL.add(x);
		}
		for(int i=0; i<AL.size(); i++)
			
		System.out.println(AL.get(i));
		
		
		
		
	}

}
