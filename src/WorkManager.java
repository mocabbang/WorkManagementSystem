import java.util.ArrayList;
import java.util.Scanner;


public class WorkManager {
	
	ArrayList<Work> works=new ArrayList<Work>();
	Work work;
	Scanner input;
	
	WorkManager(Scanner input) {
		this.input=input;
	}
	
	
	public void addwork() {
		work=new Work();
		System.out.print("name of work : ");
		work.name=input.next();
		System.out.print("date of work : ");
		work.date=input.next();
		System.out.println("Description");
		work.description=input.next();
		works.add(work);
		
		System.out.println(" Successfully done");
		
	}
	
	
	public void deletework() {
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
		int i=0;
		int index=-1;
		
		while(i<works.size()) {
			
			if(works.get(i).name==name) {
				index=i;
				break;
			}
			
			if(index>=0) {
				works.remove(index);
				System.out.printf("%s is deleted", works.get(index));
			}
			else {
				System.out.println("the work has not been entered");
				return ;
			}
			
		}
		
	}
	
	
	public void editwork() {
		
		int i=0;
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
		while(i<works.size()) {
			
			if(works.get(i).name==name) {
				
				int select=-1;
				while(select!=4) {
					System.out.println("1. Edit name");
					System.out.println("2. Edit date");
					System.out.println("3. Edit description");
					System.out.println("4. Exit");

					System.out.print("input number between 1~5 : ");
					select=input.nextInt();
					
					if(select==1) {
						System.out.print("new name : ");
						works.get(i).name=input.next();
					}
					else if(select==2) {
						System.out.print("date of work : ");
						works.get(i).date=input.next();
					}
					else if(select==3) {
						System.out.println("Description");
						works.get(i).description=input.next();
					}
					else {
						continue;
					}
					
				}
				
				System.out.println(" Successfully done");
			}
			
		}
		
	}
	
	
	public void viewworks() {
		
		int i=0;
		
		// System.out.println("state the name of job to do");
		// String name=input.next();
		
		while(i<works.size()) {
			System.out.printf("name of work : %s\n", works.get(i).name);
			System.out.printf("date of work : %s\n", works.get(i).date);
			System.out.printf("work description \n%s\n", works.get(i).description);
			
			i++;
		}
		
	}
	
	
}
