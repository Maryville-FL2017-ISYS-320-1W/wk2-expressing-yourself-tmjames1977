/*
  	ISYS 320
  	Name(s):Timothy James
  	Date: 11/4/2017
*/

/*
 	Your predicted values for the expressions
	1. 8...yes
	2. 11...yes
	3. 12...yes
	4. 4...yes
	5. 2...yes
	6. 11...yes
	7. 11...way off, I was just ignoring the quotation marks and adding. I didn't even think of it from what would Java do with it.
	8. 11...way off, I was just ignoring the quotation marks and adding. I didn't even think of it from what would Java do with it.
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
 	
 	I chose to use "AddOp" so I refactored the file name to AddOp.java from TestEvaluations.java
*/

class AddOp 
{

	public static void main(String[] args) 
	{
		System.out.println(2 + 3 * 4 - 6);
		System.out.println(14 / 7 * 2 + 30 / 5 + 1);
		System.out.println(( 12 + 6 ) / 3 * 2);
		System.out.println((238 % 10 + 3 ) % 7);
		System.out.println(6 * 7 % 4);
		System.out.println(2 + 2 + 3 + 4);
		System.out.println("2 + 2" + 3 + 4);
		System.out.println(3 + 4 + " 2 + 2");
	}

}
