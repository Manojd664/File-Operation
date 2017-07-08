import java.io.*;
import java.util.*;
public class Solution {
	public void operations() throws IOException
	{
		BufferedReader bufferedReader=null;
		BufferedWriter bufferedWriter=null;
		String line="";
		try {
			bufferedReader=new BufferedReader(new FileReader("Input.csv")); //Modify input file path
			bufferedWriter=new BufferedWriter(new FileWriter("Output.csv")); //Modify output file path
			while((line=bufferedReader.readLine())!=null)
			{
				bufferedWriter.append(line);
				bufferedWriter.newLine();
			}
		} catch (IOException e) {
			File file=new File("Input.csv");
			file.createNewFile();
			System.out.println("Your file was not present at specified locatin so new file with name Input.csv is created. please write something to file");
		}
		finally{
			if(bufferedWriter==null)
				System.out.println("Please write something to input file");
			else
			{
			bufferedReader.close();
			bufferedWriter.close();
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Solution sol=new Solution();
		sol.operations();
	}

}
