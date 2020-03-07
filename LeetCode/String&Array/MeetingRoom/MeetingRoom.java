import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
	public static void main(String[] args) {
		MeetingRoom a = new MeetingRoom();

		Interval in1 = new Interval(15, 20);
		Interval in2 = new Interval(5, 10);
		Interval in3 = new Interval(0, 30);

		Interval[] intervals = { in1, in2, in3 };
		System.out.println(a.solve(intervals));
	}

	public boolean solve(Interval[] intervals) {

		boolean[] isPushRoom = new boolean[10000];

		for (int i = 0; i < intervals.length; i++) {
			int j = intervals[i].start;
			while (j < intervals[i].end) {
				if (isPushRoom[j] == false) {
					isPushRoom[j] = true;
					j++;
				} else {
					return false;
				}
			}
		}

		return true;

	}

	public void print(Interval[] intervals) {
		for (int i = 0; i < intervals.length; i++) {
			Interval in = intervals[i];
			System.out.println(in.start + " " + in.end);

		}
	}
}

class Interval {
	int start;
	int end;

	Interval() {
		this.start = 0;
		this.end = 0;
	}

	Interval(int s, int e) {
		this.start = s;
		this.end = e;
	}
}