import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger=new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		WorkManager workmanager=getObject("workmanager.ser");
		if(workmanager==null) {
			workmanager=new	WorkManager(input);
		}
		
	    selectMenu(input, workmanager);
	    putObject(workmanager, "workmanager.ser");
		System.out.print("\n close program \n");
	}
	
	
	
	public static void showMenu() {
		System.out.println("1. Add Work");
		System.out.println("2. Delete Work");
		System.out.println("3. Edit Work");
		System.out.println("4. View Work");
		System.out.println("5. Exit");
		
		System.out.print("input number between 1~5 : ");
	}
	
	public static void selectMenu(Scanner input, WorkManager workmanager) {
		int select=0;
		try {
			while(select!=5) {
				showMenu();
				select=input.nextInt();

				switch (select) {
				case 1:
					workmanager.addwork();
					logger.log("add a work");
					break;
				case 2:
					workmanager.deletework();
					logger.log("delete a work");
					break;
				case 3:
					workmanager.editwork();
					logger.log("edit a work");
					break;
				case 4:
					workmanager.viewworks();
					logger.log("view a work");
					break;
				default:
					continue;
				}
			}
		}
		catch(InputMismatchException e) {
			System.out.println("\n wrong access \n");
		}
		
		
	}
	
	
	public static WorkManager getObject(String filename) {
		WorkManager workmanager=null;
		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			
			workmanager=(WorkManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return workmanager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return workmanager;
	}
	
	public static void putObject(WorkManager workmanager, String filename) {
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			out.writeObject(workmanager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}