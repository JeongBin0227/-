
public class TwoSum {
	public static void main(String args[]) {
		int[] nums = {2,8,11,21};
        int target =10;
        TwoSum a = new TwoSum();
        int[]  result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
	}
	
	//
	public int[] solve(int[] nums, int target) {
		int[] answerArr = new int[2];
		
		for(int i=0;i<nums.length;i++) {
			int copytarget = target;
			copytarget = copytarget- nums[i];
			for(int j=i;j<nums.length;j++) {
				if(j!=i&&copytarget==nums[j]) {
					answerArr[0]=i;
					answerArr[1]=j;
					break;
				}
			}
		}
		return answerArr;
	
	}
}

