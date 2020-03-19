//import java.util.Arrays;
//import java.util.Comparator;
//
//public class MeetingRoom2 {
//	public static void main(String[] args) {
//		
//		MeetingRoom2 a = new MeetingRoom2();
//		Interval in1 = new Interval(5,10);
//		Interval in2 = new Interval(15,20);
//		Interval in3 = new Interval(0,30);
//		Interval[] intervals = {in1,in2,in3};
//		System.out.println(a.solve(intervals));
//		
//	}
//	public int solve(Interval[] intervals) {
//
//		Arrays.sort(intervals,Comp);
//
//		int start = intervals[0].start;
//		int end = intervals[0].end;
//		int answer = 1;
//		for (int i = 1; i < intervals.length; i++) {
//			if(end>intervals[i].start) {
//				 start = intervals[i].start;
//				 end = intervals[i].end;
//				 answer++;
//			}
//			else {
//				end = intervals[i].end;
//			}
//		}
//		
//		return answer;
//		
//		
//	}
//	Comparator<Interval> Comp = new Comparator<Interval>() {
//
//		@Override
//		public int compare(Interval o1, Interval o2) {
//			// TODO Auto-generated method stub
//			return o1.start-o2.start;
//		}
//		
//		
//	};
//	public void print(Interval[] intervals) {
//		for(int i=0; i<intervals.length; i++) {
//			Interval in = intervals[i];
//			System.out.println(in.start+" "+in.end);
//			
//		}
//	}
//}
//
//class Interval{
//	int start;
//	int end;
//	Interval(){
//		this.start=0;
//		this.end=0;
//	}
//	Interval(int s,int e){
//		this.start=s;
//		this.end=e;
//	}
//}
//
//
