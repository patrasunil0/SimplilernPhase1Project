package lockedMe.com;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class LockedMe {
	
	static final String projectFilesPath = "D:\\JAVA\\SimpliLearn\\Project\\Submission\\LockedMeFile";
	public static void displayMenu()
	{
		System.out.println("*********************************************");
		System.out.println("\tWelcome to LockedMe.com Secure App");
		System.out.println("\tDeveloped by Sunil Kumar Patra");
		System.out.println("*********************************************");
		System.out.println("\t\t1. Display all Files");
		System.out.println("\t\t2. Add files to the existing directory list");	
		System.out.println("\t\t3. Delete a File");
		System.out.println("\t\t4. Searche a File");
		System.out.println("\t\t5. Exit");
	}
	public static void getAllFiles()
	{
		File folder = new File(projectFilesPath);
		File [] listOfFile = folder.listFiles();
		
		if (listOfFile.length>0)
		{
			System.out.println("File lists are displayed below");
			for(var l:listOfFile)
			{
				System.out.println(l.getName());
			}	
		}
		else
		{
			System.out.println("The Folder is Empty");
		}
	}
	public static void creatFiles()
	{
		try 
		{
			Scanner obj = new Scanner(System.in);
			String fileName;
			System.out.println("Enter the File Name: ");
			fileName = obj.nextLine();
			
			int linesCount;
			System.out.println("Enter How many Lines you want to Enter : ");
			linesCount = Integer.parseInt(obj.nextLine());
			
			FileWriter fw = new FileWriter (projectFilesPath+ "\\"+fileName);
			for(int i=1;i<=linesCount;i++)
			{
				System.out.println("Enter the File Line: ");
				fw.write(obj.nextLine()+"\n");
			}
			System.out.println("File Create Successfully");
			fw.close();
			
		}
		catch (Exception e)
		{
			
		}
		
	}
	public static void deleteFiles()
	{
		
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the File Name: ");
		fileName = obj.nextLine();
		File f = new File(projectFilesPath+"\\"+fileName);
		if(f.exists())
		{
			f.delete();
			System.out.println("File successfully deleted");
		}
		else
		{
			System.out.println("File not found");
		}
			
	}
	public static void searchFiles()
	{
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the File Name: ");
		fileName = obj.nextLine();
		File f = new File (projectFilesPath+"\\"+fileName);
		if (f.exists())
		{
			System.out.println("The File is available");
		}
		else
		{
			System.out.println("File not found");
		}
	}
	
}
