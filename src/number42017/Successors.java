package number42017;

public class Successors {
	
	public static Position findPosition(int num, int[][] intArr) {
		
		// WRITE YOUR CODE HERE (PART A)
		return null;
	}
	
	public static Position[][] getSuccessorArray(int[][] intArr) {
		
		// WRITE YOUR CODE HERE (PART B)
		return null;
	}
	
	public static void main(String[] args) {
		// Part A
		int[][] problemArr = 
			{ { 15, 5,  9,  10 },
			  { 12, 16, 11, 6  },
			  { 14, 8,  13, 7  } };
		Position result = findPosition(8, problemArr);
		if (result != null) {
			System.out.print("Part A Answer: ");
			result.printPosition();
		}
		
		printSuccessorArray(getSuccessorArray(problemArr));
	}

	public static void printSuccessorArray(Position[][] inputArr) {
		if(inputArr == null) {
			return;
		}
		System.out.println("\nPart B Asnwer: ");
		for (int row=0; row < inputArr.length; row++)
		  {
			System.out.print("[ ");
		    for (int col=0; col < inputArr[0].length; col++)
		    {
		      if (inputArr[row][col] == null) {
		    	  System.out.print("null  ");
		      } else {
		        inputArr[row][col].printPosition();
		        System.out.print(" ");
		      }
		    }
		    System.out.print("] \n");
		  }
	}

}
