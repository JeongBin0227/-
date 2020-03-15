
public class LicenseKeyFormatting {

	public static void main(String[] args) {

		String S = "5F3Z-2e-9-w-exsx-2xs";
//		String S = "2-5g-3-J";
		int k = 4;
		System.out.println(licenseKeyFormatting(S, k));
	}

	public static String licenseKeyFormatting(String S, int K) {
		S= S.replace("-", "").toUpperCase();
		
		
		StringBuffer sb = new StringBuffer(S);
		
		System.out.println(sb);
		if(K>S.length()) {
			return S;
		}
		else if(S.length()%K==0) {
			int multiply = 1;
			int time=0;
			while(S.length()>K*multiply) {
				sb.insert(K*multiply+time,'-');
				multiply++;
				time++;
			}
		}
		else {
			int multiply = 1;
			int remainder = S.length()%K;
			int time=1;
			sb.insert(remainder,'-');
			while(S.length()>K*multiply+remainder) {
				sb.insert(K*multiply+remainder+time,'-');
				multiply++;
				time++;
			}
		}
		String str = sb.toString();
		return str;

		
	}

 }
