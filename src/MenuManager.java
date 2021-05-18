import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		WorkManager workmanager=new WorkManager(input);
		
	    selectMenu(input, workmanager);
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
					break;
				case 2:
					workmanager.deletework();
					break;
				case 3:
					workmanager.editwork();
					break;
				case 4:
					workmanager.viewworks();
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
	
}