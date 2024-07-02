package patientInfo;

public class Procedure 
{
	private String procedure;
	private String date;
	private String practitioner;
	private double charges;
	
	//Constructors
	public Procedure() 
	{
		this.procedure = "Colonscopy";
		this.date = "03/23/2022";
		this.practitioner = "Dr. Ivy";
		this.charges = 203.0;
	}
	
	public Procedure(String practitioner, String date) 
	{
		this.procedure = "X-ray";
		this.practitioner = practitioner;
		this.date = date;
		this.charges = 350.67;
	}
	
	public Procedure(String procedure, String date, String practitioner, double charges) 
	{
		this.procedure = procedure;
		this.date = date;
		this.practitioner = practitioner;
		this.charges = charges;
	}
	
	//setters
	public void setProcedure(String procedure)
	{
		this.procedure = procedure;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public void setPractitioner(String practitioner) {
		this.practitioner = practitioner;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	
	//getters
	public String getProcedure(String procedure) {
		return this.procedure;
	}
	
	public String getDate(String date) {
		return this.date;
	}
	
	public String getPractitioner(String practitioner) {
		return this.practitioner;
	}
	
	public double getCharges(double charges) {
		return this.charges;
	}
	
	//toString
	public String toString() {
		return "\r\n\tProdecure: " + this.procedure + "\r\n\tProcedureDate=" + this.date + "\r\n\tPracitioner=" + this.practitioner + "\r\n\tcharges=" + this.charges;
	}
}
