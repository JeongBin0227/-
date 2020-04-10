import java.util.*;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int x) {
		this.val = x;
	}
}

public class BinaryTreeLevelOrder {
	public static void main(String[] args) {
		TreeNode root = null;
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.right = new TreeNode(5);
		System.out.println(solve(root));
	}

	public static List<List<Integer>> solve(TreeNode root) {
		System.out.println(root);
		if (root == null)
			return null;
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> tmpList = new ArrayList<>();

		queue.offer(root);

		while (queue.size() != 0) {
			List<Integer> pushList = new ArrayList<>();
			int time = queue.size();
			for (int i = 0; i < time; i++) {

				TreeNode tmp = queue.poll();
				pushList.add(tmp.val);
				if (tmp.left != null)
					queue.offer(tmp.left);
				if (tmp.right != null)
					queue.offer(tmp.right);
			}
			result.add(pushList);
		}

		return result;
	}
}