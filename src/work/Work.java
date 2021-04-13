package work;

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
	
	
	
	
	public WorkImportance getImportance() {
		return importance;
	}

	public void setImportance(WorkImportance importance) {
		this.importance = importance;
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
	
}
