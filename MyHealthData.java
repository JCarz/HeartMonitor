
//Assignment 3: MyHealthData.java
public class MyHealthData{
	String firstName;
	String lastName;
	String gender;
	int birthYear;
	int currentYear;
	double height;
	double weight;
//END CODE


// INCLUDE YOUR CONSTRUCTOR HERE 

	public MyHealthData(String firstName,String lastName,String gender,int birthYear,int currentYear,double height,double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
		this.height = height;
		this.weight = weight;
	}

//YOUR SET AND GET METHODS HERE. 
private String getFirstName() {
	return firstName;
}
private void setFirstName(String firstName) {
	this.firstName = firstName;
}

private String getLastName() {
	return lastName;
}
private void setLastName(String lastName) {
	this.lastName = lastName; 
}

private String getGender() {
	return gender;
}
private void setGender(String gender) {
	this.gender = gender;
}

private int getBirthYear() {
	return birthYear;
}
private void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}

private int getCurrentYear() {
	return currentYear;
}
private void setCurrentYear(int currentYear) {
	this.currentYear = currentYear;
}

private double getHeight() {
	return height;
}
private void setHeight(double height) {
	this.height = height;
}

private double getWeight() {
	return weight;
}
private void setWeight(double weight) {
	this.weight= weight;
}
/*The Methods above are setters and getters for all of the clients personal information  
 */



private int getAge() {
	int age;
	age = currentYear - birthYear;
	return age;
}
/*This is a getAge method that has a non-initialized variable age that will subtract the current year
 * by the persons birth year this will return the age of the person in years 
 */
private int getMaximumHeartRate() {
	int maxHeartRate;
	maxHeartRate = 220 - getAge();
	return maxHeartRate;
}
/*This method will get the maximum heart rate of the person by creating a non-initialized variable with the given formula
 * 220 subtract the age from the get age method and will return the method 
 */

private double getMinimumTargetHeartRate() {
	return 5 * getMaximumHeartRate() /10;
}
/*This method will get the minimum target heart rate this will return 5 multiplied by the returned maxHeartRate divided by 10
 
 */
private double getMaximumTargetHeartRate() {
	return 85 * getMaximumHeartRate() /100;
}
/*This method will get the maximum target heart rate this will return 5 multiplied by the returned maxHeartRate divided by 100 
 */

// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) 
public double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight());
} 
//THIS PORTION SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. 
public void displayMyHealthData() 
{ 

   
// START CODE
System.out.printf(
"First Name: "+getFirstName()+"\n"+
"Last Name: "+getLastName()+"\n"+
"Gender: "+getGender()+"\n"+
"Date of Birth: "+getBirthYear()+"\n"+
"Height: "+getHeight()+" ft\n"+
"Age: "+getAge()+"\n"+
"Body mass index(BMI): "+getBMI()+"\n"+
"Max Heart Rate: "+getMaximumHeartRate()+"\n"+
"Target Minimum Heart Rate: "+getMinimumTargetHeartRate()+"\n"+
"Target Maximim Heart Rate: "+getMaximumTargetHeartRate()+"\n");
/*This will return all of the clients records in order 
 */

//END CODE

	System.out.println("-------------------------");
   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");   
} 

} // end class MyHealthData

