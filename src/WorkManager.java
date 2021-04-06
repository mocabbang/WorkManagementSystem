import java.util.Scanner;

public class WorkManager {
	
	Work work;
	Scanner input;
	
	public void addwork() {
		
		System.out.print("name of work : \n");
		work.name=input.next();
		System.out.print("date of work : \n");
		work.date=input.next();
		System.out.println("Description");
		work.description=input.next();
		
		System.out.println(" Successfully done");
		
	}
	
	
	
	
	public void deletework() {
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
		if(work==null) {
			
		}
	}
	
	
	
	public void editwork() {
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
	}
	
	
	
	public void viewwork() {
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
	}
	
	
}
