public class Person {
	private String fName="";
	private String lName="";
	
	
	public String getName() {
		return fName;
	}
	public String getLastName() {
		return lName;
	}		
    public void setName(String firstName){
		this.fName=firstName;
	}
    public void setLastName(String lastName){
		this.fName=lastName;
	}
    Person(String firstName){
    	 this.fName=firstName ;
    }
    Person(String firstName, String lastName){
    	this.fName=firstName;
		this.lName=lastName;
	}
}

