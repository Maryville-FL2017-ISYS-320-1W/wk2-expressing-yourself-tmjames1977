/*
  	ISYS 320
  	Name(s):Timothy James
  	Date: 11/4/2017
*/

public class CollegeStudent extends Student {
	private int yearInCollege;
	private String levelOfDistinction;
	private static int collegeStudentCount;
	
	public CollegeStudent(string anId, String aFirstName, String aMiddleName, String aLastName,
			ArrayList<Double> aListofGrade, int aYearInCollege)
		{
			super (anId, aFirstName, aMiddleName, aLastName, aListofGrades);
			yearInCollege = aYearInCollege;
			levelOfDistinction = "None";
			collegeStudentCount++;
			}
	
	public static void setYearInCollege(int aYearInCollege)
	{
		yearInCollege = aYearInCollege
	}
	
	public int getYearInCollege()
	{
		return yearInCollege;
	}
	public void setLevelOfDistinction(String alevelOfDistinction)
	{
		levelOfDistinction = aLevelOfDistinction;
	}
	public String getlevelOfDistinction()
	{
		return levelOfDistinction;
	}
	public static int getCollegeStudentCount()
	{
		return collegeStudentCount;
	}
	@Override
	public double calculatedGPA()
	{
		double totalGrades = 0;
		double avgGrades;
		ArrayList<Double> myGrades = getGrades();
	}
}
