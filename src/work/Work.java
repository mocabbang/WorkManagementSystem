package work;

import java.util.Scanner;

public class Work {
	
	protected int importance;
	protected WorkKind kind=WorkKind.Typical;
	protected String description;
	protected String date="";
	protected String name="";
	

	public int getImportance() {
		return importance;
	}

	public void setImportance(int importance) {
		this.importance = importance;
	}
	
	public Work() {
	}
	
	public Work(String name, String date) {
		this.name=name;
		this.date=date;
	}

	public Work(String name, String date, String description) {
		this.name=name;
		this.date=date;
		this.description=description;
	}
	
	
	
	public WorkKind getKind() {
		return kind;
	}

	public void setKind(WorkKind kind) {
		this.kind = kind;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
