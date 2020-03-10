
//public class MoveZeros {
//	public static void main(String args[]) {
//
//		int[] nums = { 0, 3, 2, 0, 8, 5 };
//		int numsLength = nums.length;
//		int[] answerNums = new int[numsLength];
//		int answerNumsIndex = 0;
//
//		for (int i = 0; i < numsLength; i++) {
//			if (nums[i] != 0) {
//				answerNums[answerNumsIndex] = nums[i];
//				answerNumsIndex++;
//			}
//		}
//		for (int i = answerNumsIndex; i < numsLength; i++) {
//			answerNums[answerNumsIndex] = 0;
//		}
//		
//		for (int i = 0; i < numsLength; i++) {
//			System.out.print(answerNums[i]+ "  ");
//		}
//	}
//}
public class MoveZeros {
	public static void main(String args[]) {
		int[] nums = { 0, 3, 2, 0, 8, 5 };
        int numsLength = nums.length;
		int[] answerNums = new int[numsLength];
		int answerNumsIndex = 0;

		for (int i = 0; i < numsLength; i++) {
			if (nums[i] != 0) {
				nums[answerNumsIndex] = nums[i];
				answerNumsIndex++;
			}
		}
		
		for (int i = answerNumsIndex; i < numsLength; i++) {
			nums[i] = 0;
			
		}
		
		for (int i = 0; i < numsLength; i++) {
			System.out.print(nums[i]+"    ");
		}
	    
    }
}


