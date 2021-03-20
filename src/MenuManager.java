
import java.util.Scanner;

public class MenuManager 
{
	
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		int select=0;
		int i=0,j=0,k=0;
		
		int year=0,month=0,date=0;
		String name="", namesearcher="";
		
		while(select!=6)
		{

			System.out.println("1. Add Work");
			System.out.println("2. Delete Work");
			System.out.println("3. Edit Work");
			System.out.println("4. View Work");
			System.out.println("5. Show Menu again");
			System.out.println("6. Exit");
			
			
			System.out.print("input number between 1~6 : ");
			select=input.nextInt();
			

			switch (select)
			{
			case 1:
				System.out.println("state the name of job to do");
				name=input.next();
				System.out.println("state the year of work");
				year=input.nextInt();
				System.out.println("state the month of work");
				month=input.nextInt();
				System.out.println("state the date of work");
				date=input.nextInt();
				break;
				
			case 2:
				name="";
				year=0;
				month=0;
				date=0;
				System.out.println("clear");
				break;
				
			case 3:
				//array
				break;
				
			case 4:
				System.out.printf("name of work : %s", name);
				System.out.printf("year : %d   month : %d   date : %d", year, month, date);
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
	
}