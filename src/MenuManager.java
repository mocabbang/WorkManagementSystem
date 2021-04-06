import java.util.Scanner;

public class MenuManager {
	
	
	public static void main(String[] args) {
		
		WorkManager workmanager=new WorkManager();
		Scanner input=new Scanner(System.in);
		
		int select=0;
		
		
		while(select!=6) {
			
			System.out.println("1. Add Work");
			System.out.println("2. Delete Work");
			System.out.println("3. Edit Work");
			System.out.println("4. View Work");
			System.out.println("5. Exit");
			
			
			System.out.print("input number between 1~5 : ");
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
				workmanager.viewwork();
				break;
				
			case 5:
				select=5;
				break;
				
			default:
				System.out.println("\n wrong access \n");
			}
			
		}
		
		System.out.print("\n close program \n");
	}
	
	
	
}