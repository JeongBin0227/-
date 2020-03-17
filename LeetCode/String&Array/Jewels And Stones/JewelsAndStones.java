
public class JewelsAndStones {

	public static void main(String[] args) {
		String J = "aA", S = "aAzAbbbb";
		System.out.println(solve(J, S));
	}

	public static int solve(String jew, String stone) {
		int[] numOfStone = new int[58];
		int answer = 0;
		for(int i =0;i<stone.length();i++) {
			numOfStone[(int)stone.charAt(i)-65]++;
		}
		
		for(int i =0;i<jew.length();i++) {
			answer+=numOfStone[(int)jew.charAt(i)-65];
		}
		
		return answer;
		
	}

}
