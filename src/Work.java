
public class Work {
	
	protected WorkImportance importance=WorkImportance.Normal;
	protected String description;
	protected String date="";
	protected String name="";
	
	
	Work() {
	}
	
	Work(String date, String name) {
		this.date=date;
		this.name=name;
	}

	Work(String date, String name, String description) {
		this.date=date;
		this.name=name;
		this.description=description;
	}
	
}
