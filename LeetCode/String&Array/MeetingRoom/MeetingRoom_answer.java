//import java.util.Arrays;
//import java.util.Comparator;
//
//public class MeetingRoom_answer {
//	public static void main(String[] args) {
//		MeetingRoom_answer a = new MeetingRoom_answer();
//		
//	
//		Interval in1 = new Interval(15,20);
//		Interval in2 = new Interval(5,10);
//		Interval in3 = new Interval(0,30);
//		
//		Interval[] intervals = {in1, in2,in3};
//		System.out.println(a.solve(intervals));
//	}
//	public boolean solve(Interval[] intervals) {
//
//		Arrays.sort(intervals,Comp);
//		
//		for(int i=0;i<intervals.length;i++) {
//			if(intervals[i-1].end>intervals[i].start)
//				return false;
//		}
//		return true;
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