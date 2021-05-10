package work;

import java.util.Scanner;

public class TypicalWork extends Work implements WorkInput {
	
	public void printInfo() {
		
		System.out.println("workkind : "+kind);
		System.out.println("name : "+name);
		System.out.println("date : "+date);
		System.out.println("description : "+description);
		
	}
	
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
		
	}
	
}
