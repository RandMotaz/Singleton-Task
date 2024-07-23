

public class Main {

	public static void main(String[] args) {
//		In this code i want to simplifies the design by avoiding multiple instances that might 
//		lead to conflicting or duplicated operations on the same file.
		FileSingleton instance1=FileSingleton.getInstance();
		instance1.createFile();
		instance1.readFromFile();
		instance1.appendDataToFile();
		instance1.readFromFile();
		//instance1.deleteFile();
		
		FileSingleton instance2=FileSingleton.getInstance();
//		instance2.createFile();
//		instance2.readFromFile();
		instance2.appendDataToFile();
		instance2.readFromFile();
//		instance2.deleteFile();
//	    To ensures that only one instance is created From class FileSingleton
//		i will print the address of instance1 and instance2.
		System.out.print("Instance1 Address= "+instance1+ " Instance2 Address= "+instance2);
		
		}

}
