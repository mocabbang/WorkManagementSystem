import java.util.ArrayList;
import java.util.Scanner;

import work.SpecialWork;
import work.Work;


public class WorkManager {
	
	ArrayList<Work> works=new ArrayList<Work>();
	Work work;
	Scanner input;
	
	WorkManager(Scanner input) {
		this.input=input;
	}
	
	
	public void addwork() {
		int kind=0;
		while(kind!=1 && kind!=2) {
			
			System.out.println("1 for typical, 2 for special");
			System.out.print("select the num : ");
			kind=input.nextInt();
			
			if(kind==1) {
				work=new Work();
				work.getWorkInput(input);
				works.add(work);
				break;
			}
			else if(kind==2) {
				work=new SpecialWork();
				work.getWorkInput(input);
				works.add(work);
				break;
			}
			else {
				System.out.println("wrong access");
			}
			
		}
		
		
		System.out.println(" Successfully done");
		
	}
	
	
	public void deletework() {
		
		System.out.println("state the name of job to do");
		String name=input.next();
		
		int i=0;
		int index=-1;
		
		while(i<works.size()) {
			
			if(works.get(i).getName()==name) {
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
		String Name=input.next();
		
		while(i<works.size()) {
			
			if(works.get(i).getName()==Name) {
				
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
						String name=input.next();
						works.get(i).setName(name);
					}
					else if(select==2) {
						System.out.print("date of work : ");
						String date=input.next();
						works.get(i).setDate(date);
					}
					else if(select==3) {
						System.out.println("Description");
						String description=input.next();
						works.get(i).setDescription(description);
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
			System.out.printf("name of work : %s\n", works.get(i).getName());
			System.out.printf("date of work : %s\n", works.get(i).getDate());
			System.out.printf("work description \n%s\n", works.get(i).getDescription());
			
			i++;
		}
		
	}
	
	
}
