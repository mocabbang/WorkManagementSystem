package work;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DateRangeException;

public class SpecialWork extends Work implements WorkInput {
	
	public SpecialWork() {
	}
	
	public SpecialWork(WorkKind kind, int importance, String name, String date, String description) {
		this.kind=kind;
		this.importance=importance;
		this.name=name;
		this.date=date;
		this.description=description;
	}
	
	
	public void getWorkInput(Scanner input) {
		
		this.kind=WorkKind.Special;
		
		System.out.print("name of work : ");
		String name=input.next();
		this.setName(name);
		
		try {
		System.out.println("date of work");
			int num;
			System.out.print("year : ");
			num=input.nextInt();
			date="year : "+Integer.toString(num);
			date=getmonth(input, num);
			date=getday(input, num);
			date=gethour(input, num);
			date=getminute(input, num);
			
			this.setDate(date);
		}
		catch(DateRangeException e) {
			System.out.println("DateRangeException");
		}
		
		
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
	
	public String getmonth(Scanner input, int num) throws DateRangeException{
		try {
			System.out.print("month : ");
			num=input.nextInt();
			if(12<num||num<1) {
				throw new DateRangeException();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		return date=date+"month : "+Integer.toString(num);
	}
	
	public String getday(Scanner input, int num) throws DateRangeException{
		try {
			System.out.print("day : ");
			num=input.nextInt();
			if(31<num||num<1) {
				throw new DateRangeException();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		return date=date+"day : "+Integer.toString(num);
	}
	
	public String gethour(Scanner input, int num) throws DateRangeException{
		try {
			System.out.print("hour : ");
			num=input.nextInt();
			if(23<num||num<0) {
				throw new DateRangeException();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		return date=date+"hour : "+Integer.toString(num);
	}
	
	public String getminute(Scanner input, int num) throws DateRangeException{
		try {
			System.out.print("minute : ");
			num=input.nextInt();
			if(60<num||num<0) {
				throw new DateRangeException();
			}
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		return date=date+"minute : "+Integer.toString(num);
	}
	
	public void printInfo() {
		
		System.out.println("workkind : "+kind);
		System.out.println("importance : "+importance);
		System.out.println("name : "+name);
		System.out.println("date : "+date);
		System.out.println("description : "+description);
		
	}
	
}
