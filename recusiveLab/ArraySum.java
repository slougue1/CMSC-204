/**
 * This is a recursive method to sum the values in an array of integers. 
 * @author Sakina Logue
 */

public class ArraySum
{
	//private final static int ARRAYSIZE = 6;

	int sumOfArray(Integer a[], int index)
	{
		int total=0;                             //set the accumulateur to 0 first to have the real sum at the end 
		for (int index1=0;index1<=index;index1++)//the loop header that check the for the truthfulness of the expression
		{
			total += a[index1];                 //each the expression is true, this statement will be executed, 
			                                    //the second element be added to the first, the third to second ... so forth and all the elements are saved in total
		}

		return total;                           //whenever this method is called, total will be returned in the calling statement.
	}

}