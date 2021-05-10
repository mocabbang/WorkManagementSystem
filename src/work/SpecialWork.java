package work;

import java.util.Scanner;

public class SpecialWork extends Work implements WorkInput {
	
	protected int importance;
	
	
	
	public SpecialWork() {
	}
	
	public SpecialWork(WorkKind kind, int importance, String name, String date, String description) {
		this.kind=kind;
		this.importance=importance;
		this.name=name;
		this.date=date;
		this.description=description;
	}
	
	
	
	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}
	
	
	
	public void getWorkInput(Scanner input) {
		
		this.kind=WorkKind.Special;
		
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
	
	public void printInfo() {
		
		System.out.println("workkind : "+kind);
		System.out.println("importance : "+importance);
		System.out.println("name : "+name);
		System.out.println("date : "+date);
		System.out.println("description : "+description);
		
	}
	
}
