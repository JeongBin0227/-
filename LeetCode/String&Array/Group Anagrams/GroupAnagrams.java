import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {

		String[] list = { "eat", "tea", "tan", "ate", "nat", "bat" };

		System.out.println(groupAnagrams(list));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(int i=0;i<strs.length;i++) {
			char[] charArray = strs[i].toCharArray();
			Arrays.sort(charArray);
			String value = String.valueOf(charArray);
			System.out.println(value);
			if(map.get(value) != null) {
				map.get(value).add(strs[i]);
				System.out.println(charArray);
			} 
			else {
				List<String> push = new ArrayList<>();
				push.add(strs[i]);
				map.put(value,push);
			}
			
		}
		System.out.println(map.size());
		System.out.println(map.values());
		result.addAll(map.values());
		return result;
	}
	
}
