package work;

import java.util.Scanner;

public interface WorkInput {
	
	public void setKind(WorkKind kind);
	
	public void setDescription(String description);
	
	public void setDate(String date);
	
	public String getName();
	
	public void setName(String name);
	
	public void printInfo();
	
	public void getWorkInput(Scanner input);
	
}
