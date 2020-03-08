import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {

	public static void main(String[] args) {

		int[][] nums = {{1,3},{2,6},{8,10},{15,18}};
		
		MergeInterval a = new MergeInterval();
		int[][] list = a.merge(nums);

	}

	public int[][] merge(int[][] intervals) {
		if (intervals.length == 0) {
			int[][] answerCopy = new int[0][0];
			return answerCopy;
		}

		List<Interval> answer = new ArrayList<>();

		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		int start = intervals[0][0];
		int end = intervals[0][1];
		for (int i = 1; i < intervals.length; i++) {
			if (end >= intervals[i][0]) {
				if (intervals[i][1] > end)
					end = intervals[i][1];
			} else {
				Interval newInterval = new Interval(start, end);
				answer.add(newInterval);
				start = intervals[i][0];
				end = intervals[i][1];
			}
		}
		Interval newInterval = new Interval(start, end);
		answer.add(newInterval);

		int[][] answerCopy = new int[answer.size()][2];
		for (int i = 0; i < answer.size(); i++) {
			answerCopy[i][0] = answer.get(i).start;
			answerCopy[i][1] = answer.get(i).end;

		}

		return answerCopy;
	}

	class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}
}
