import java.util.ArrayList;
import java.util.Scanner;

import work.SpecialWork;
import work.TypicalWork;
import work.WorkInput;
import work.WorkKind;


public class WorkManager {
	
	ArrayList<WorkInput> works=new ArrayList<WorkInput>();
	WorkInput workInput;
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
				workInput=new TypicalWork();
				workInput.getWorkInput(input);
				works.add(workInput);
				break;
			}
			else if(kind==2) {
				workInput=new SpecialWork();
				workInput.getWorkInput(input);
				works.add(workInput);
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
		int select=-1;
		
		System.out.println("state the name of job to do");
		String Name=input.next();
		
		while(i<works.size()) {
			
			if(works.get(i).getName().equals(Name)) {
				
				while(select!=5) {
					System.out.println("1. Edit name");
					System.out.println("2. Edit date");
					System.out.println("3. Edit description");
					System.out.println("4. Edit kind");
					System.out.println("5. Exit");

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
					else if(select==4) {

						System.out.println("Kind");
						
						int kind=0;
						
						while(kind!=1 && kind!=2) {
							
							System.out.println("1 for typical, 2 for special");
							System.out.print("select the num : ");
							kind=input.nextInt();
							
							if(kind==1) {
								works.get(i).setKind(WorkKind.Typical);
								break;
							}
							else if(kind==2) {
								works.get(i).setKind(WorkKind.Special);
								break;
							}
							else {
								System.out.println("wrong access");
							}
							
						}
						
					}
					else if(select==5) {
						break;
					}
					else {
						System.out.println("wrong access");
					}
					
				}
				
			}
			
			if(select==5) {
				break;
			}
			
		}
		
	}
	
	
	public void viewworks() {
		
		int i=0;
		
		// System.out.println("state the name of job to do");
		// String name=input.next();
		
		while(i<works.size()) {
			works.get(i).printInfo();
			
			i++;
		}
		
	}
	
}
