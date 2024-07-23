import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSingleton {
    
	private static FileSingleton instance;
	
	private FileSingleton() {
		
	}
	
	public static FileSingleton getInstance() {
		
		if (instance==null)instance=new FileSingleton();
		return instance;
	}
	
	
	public void createFile() {
		  try {
	            File file = new File("fileSingleton.txt");
	            if (file.createNewFile()) {
	                System.out.println("File created: "+ file.getName());
	            }
	            
	            else {
	                System.out.println("File already exists.");
	            }
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	public String readFromFile() {
		 String readDataFromFile ="";
		 try {
	            File file = new File("fileSingleton.txt");
	            Scanner readFromFile = new Scanner(file);
	            while (readFromFile.hasNextLine()) {
	                readDataFromFile = readFromFile.nextLine();
	                System.out.println(readDataFromFile);
	            }
	            readFromFile.close();
	        }
	        catch (FileNotFoundException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }
		 
		 return readDataFromFile ;
		 
	}
	
	
	
	public void appendDataToFile() {
		try {
            FileWriter Writer = new FileWriter("fileSingleton.txt",true);
            Writer.write("I will Try Singleton in this example!!\n");
            Writer.close();      
        }
        catch (IOException e) {   
            e.printStackTrace();
        }
	}
	
	
 	public void deleteFile() {
		File file = new File("fileSingleton.txt");
        if (file.delete()) {
            System.out.println("The deleted file is : " + file.getName());
        }
        else {
            System.out.println("Sorry!! Failed in deleting the file.");
        }
	}
}
