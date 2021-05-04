package work;

import java.util.Scanner;

public class SpecialWork extends Work {
	
	
	public void getWorkInput(Scanner input) {
		
		System.out.print("name of work : ");
		String name=input.next();
		this.setName(name);
		
		System.out.print("date of work : ");
		String date=input.next();
		this.setDate(date);
		
		System.out.println("Description");
		String description=input.next();
		this.setDescription(description);
		
		int importance=0;
		while(importance!=1 && importance!=2 && importance!=3) {

			System.out.println("set its importance between 1~3");
			importance=input.nextInt();
			if(importance==1) {
				this.setImportance(importance);
			}
			else if(importance==2) {
				this.setImportance(importance);
			}
			else if(importance==3) {
				this.setImportance(importance);
			}
			else {
				System.out.println("wrong access");
			}
			
		}
		
	}
	
	
}
