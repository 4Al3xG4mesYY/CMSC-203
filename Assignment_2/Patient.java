package patientInfo;

/*
 * Class: CMSC203 
 * Instructor: Farnaz Eivazi
 * Description: (Setting up info for the patient)
 * Due: 07/01/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Alexander Nguyen
*/

public class Patient 
{
	private String firstName;
	private String middleName;
	private String lastName;
	private String city;
	private String state;
	private String zipCode;
	private String streetAddress;
	private String patientNumber;
	private String emergencyContactFirstName;
	private String emergencyContactLastName;
	private String emergencyContactNumber;
	
	//no-par constructor
	public Patient() 
	{
		this.firstName = "James";
		this.middleName = "Landon";
		this.lastName = "Lancaster";
		this.city = "Springville";
		this.state = "Ohio";
		this.zipCode = "45321";
		this.streetAddress = "742 Maple Grove Lane";
		this.patientNumber = "240-784-132";
		this.emergencyContactFirstName = "Jenny";
		this.emergencyContactLastName = "Springs";
		this.emergencyContactNumber = "283-432-9485";
	}
	
	//par constructor
	public Patient(String firstName, String middleName, String lastName) 
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = "Oakland";
		this.state = "California";
		this.zipCode = "95361";
		this.streetAddress = "1587 Sunflower Way";
		this.patientNumber = "323-453-3242";
		this.emergencyContactFirstName = "Ajax";
		this.emergencyContactLastName = "Wilson";
		this.emergencyContactNumber = "301-234-982";
	}
	
	//par constructor
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String patientNumber, 
			String emergencyContactFirstName, String emergencyContactLastName, String emergencyContactNumber) 
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.streetAddress = streetAddress;
		this.emergencyContactFirstName = emergencyContactFirstName;
		this.emergencyContactLastName = emergencyContactLastName;
		this.emergencyContactNumber = emergencyContactNumber;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}
	
	//Emergency Setters
	public void setEmergencyContactFirstName(String emergencyContactFirstName) {
		this.emergencyContactFirstName = emergencyContactFirstName;
	}
	
	public void setEmergencyContactLastName(String emergencyContactLastName) {
		this.emergencyContactLastName = emergencyContactLastName;
	}
	
	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	//Getters
	public String getFirstName(String firstName) {
		return this.firstName;
	}
	
	public String getMiddleName(String middleName) {
		return this.middleName;
	}
	
	public String getLastName(String lastName) {
		return this.lastName;
	}
	
	public String getCity(String city) {
		return this.city;
	}
	
	public String getState(String state) {
		return this.state;
	}
	
	public String getZipCode(String zipCode) {
		return this.zipCode;
	}
	
	public String getStreetAddress(String streetAddress) {
		return this.streetAddress;
	}
	
	public String getPatientNumber(String patientNumber) {
		return this.patientNumber;
	}
	
	//Emergency Getters
	public String getEmergencyContactFirstName(String emergencyContactFirstName) {
		return this.emergencyContactFirstName;
	}
	
	public String getEmergencyContactLastName(String emergencyContactLastName) {
		return this.emergencyContactLastName;
	}
	
	public String getEmergencyContactNumber(String emergencyContactNumber) {
		return this.emergencyContactNumber;
	}
	
	//methods to display the strings
	public String buildFullName() {
		return this.firstName + " " + this.middleName + " " + this.lastName;
	}
	
	public String buildAddress() {
		return this.streetAddress + " " + this.city + " " + this.state + " " + this.zipCode;
	}
	
	public String buildEmergencyContact() {
		return this.emergencyContactFirstName + " " + this.emergencyContactLastName + " " + this.emergencyContactNumber;
	}
	
	public String toString() {
		return "Patient info:\n" + "\r\n\tName: " + buildFullName() + "\r\n\tAddress: " + buildAddress() + "\r\n\tEmergency Contact: "  + buildEmergencyContact();
	}
}
