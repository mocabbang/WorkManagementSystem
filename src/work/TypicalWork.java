package work;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.DateRangeException;

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
		
		try {
		System.out.println("date of work");
			int num;
			System.out.print("year : ");
			num=input.nextInt();
			date="year : "+Integer.toString(num);
			date=setmonth(input, num);
			date=setday(input, num);
			date=sethour(input, num);
			date=setminute(input, num);
			
			this.setDate(date);
		}
		catch(DateRangeException e) {
			System.out.println("DateRangeException");
		}
		
		System.out.println("Description");
		String description=input.next();
		this.setDescription(description);
		
	}
	
	public String setmonth(Scanner input, int num) throws DateRangeException{
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
	
	public String setday(Scanner input, int num) throws DateRangeException{
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
	
	public String sethour(Scanner input, int num) throws DateRangeException{
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
	
	public String setminute(Scanner input, int num) throws DateRangeException{
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
	
}
