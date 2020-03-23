import java.util.HashMap;

public class FindAnagramMapping {

	public static void main(String[] args) {
		int[] A = { 12, 28, 46, 32, 50 };
		int[] B = { 50, 12, 32, 46, 28 };
		int[] result = anagramMappings(A, B);
		print(result);
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static int[] anagramMappings(int[] A, int[] B) {
		int length = A.length;
		int[] answer = new int[length];
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<length;i++) {
			map.put(B[i],i);
		}
		
		for(int i=0;i<length;i++) {
			answer[i]=map.get(A[i]);
		}
		
		return answer;

	}

}
