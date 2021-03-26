
import java.util.Scanner;

public class MenuManager {
	
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int select=0;
		
		int year=0,month=0,date=0;
		String name="";
		
		while(select!=6) {
			
			System.out.println("1. Add Work");
			System.out.println("2. Delete Work");
			System.out.println("3. Edit Work");
			System.out.println("4. View Work");
			System.out.println("5. Show Menu again");
			System.out.println("6. Exit");
			
			
			System.out.print("input number between 1~6 : ");
			select=input.nextInt();
			

			switch (select) {
			
			case 1:
				addwork();
				break;
				
			case 2:
				deletework();
				break;
				
			case 3:
				editwork();
				break;
				
			case 4:
				viewwork();
				break;
				
			case 5:
				break;
				
			case 6:
				select=6;
				break;
				
			default:
				System.out.println("\n wrong access \n");
			}
			
			
		}
		
		
		
		

		System.out.print("\n close program \n");
	}
	
	
	
	
	
	
	
	public static void addwork() {
		
		Scanner input=new Scanner(System.in);
		
		int year=0;
		int month=0;
		int date=0;
		int hour=0;
		int minute=0;
		String name="";
		
		
		System.out.println("state the name of job to do");
		name=input.next();
		System.out.print("year : ");
		year=input.nextInt();
		System.out.print("month : ");
		month=input.nextInt();
		System.out.print("date : ");
		date=input.nextInt();
		System.out.print("hour : ");
		hour=input.nextInt();
		System.out.print("minute : ");
		minute=input.nextInt();
		
		System.out.println(" Successfully done");
		
	}
	
	
	
	
	public static void deletework() {
		
		Scanner input=new Scanner(System.in);
		
		int year=0;
		int month=0;
		int date=0;
		int hour=0;
		int minute=0;
		String name="";
		
		
		System.out.println("state the name of job to do");
		name=input.next();
		
	}
	
	
	
	public static void editwork() {
		
		Scanner input=new Scanner(System.in);
		
		int year=0;
		int month=0;
		int date=0;
		int hour=0;
		int minute=0;
		String name="";
		
		
		System.out.println("state the name of job to do");
		name=input.next();
		
	}
	
	
	
	public static void viewwork() {
		
		Scanner input=new Scanner(System.in);
		
		int year=0;
		int month=0;
		int date=0;
		int hour=0;
		int minute=0;
		String name="";
		
		
		System.out.println("state the name of job to do");
		name=input.next();
		
	}
	
}