package work;

public abstract class Work {
	
	protected int importance;
	protected WorkKind kind=WorkKind.Typical;
	protected String description;
	protected String date="";
	protected String name="";
	
	
	
	public Work() {
	}
	
	public Work(String name, String date) {
		this.name=name;
		this.date=date;
	}

	public Work(WorkKind kind, String name, String date, String description) {
		this.kind=kind;
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
	
}
