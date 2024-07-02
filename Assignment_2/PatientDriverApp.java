package patientInfo;

public class PatientDriverApp {

	public static void main(String[] args) {
		Patient patient = new Patient();
		Procedure p1 = new Procedure();
		Procedure p2 = new Procedure("Physical Examination", "04/04/2012");
		Procedure p3 = new Procedure("Endocrine surgery", "06/23/2022", "Connor Bradley", 203.32);
		
		displayPatient(patient);
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
		
		double totalCharges = calculateTotalCharges(p1, p2, p3);
		System.out.println("\nTotal Charges: " + totalCharges);
		System.out.println("\r\n");
		System.out.println("Student name: Alexander Nguyen");
		System.out.println("MC#: 21171610");
		System.out.println("Due Date: 07/01/2024");
	}
	
	//methods used to display
	public static void displayPatient(Patient patient)
	{
		System.out.println(patient.toString());
		
	}
	
	public static void displayProcedure(Procedure procedure)
	{
		
		System.out.println(procedure.toString());

	}
	
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		
		return p1.getCharges(0) + p2.getCharges(0) + p3.getCharges(0);
	}
}
