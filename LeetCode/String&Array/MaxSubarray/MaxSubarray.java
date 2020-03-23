public class MaxSubarray {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int newSum = nums[0];
		int answer = nums[0];

		for(int i=1;i<nums.length;i++) {
			int tmp= newSum+nums[i];
			if(tmp>nums[i]) {
				newSum=tmp;
			}
			else {
				newSum = nums[i];
			}
			if(newSum>answer) {
				answer = newSum;
			}
		}

		return answer;
	}

}
