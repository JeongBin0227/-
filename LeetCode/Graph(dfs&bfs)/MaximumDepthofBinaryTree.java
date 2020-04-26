import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x){
        this.val = x;
    }
}

public class MaximumDepthofBinaryTree {
//    int answer = 0;
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
//        tree.left.left = new TreeNode(5);
//        tree.left.right = new TreeNode(8);
//        tree.left.left.left = new TreeNode(7);
        MaximumDepthofBinaryTree a = new MaximumDepthofBinaryTree();
        System.out.println(a.maxDepth(tree));
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int count = 1;
        root.val = -1;
        int answer= 0;
        answer = bfs(root);

        return answer;
    }
    int dfs(TreeNode root){
        int answer =0;
        Stack<TreeNode> stTree = new Stack<>();
        Stack<Integer> stInt = new Stack<>();
        stTree.push(root);
        stInt.push(1);

        while (stTree.size()!=0){
            TreeNode tempTree = stTree.pop();
            int tempInt = stInt.pop();
            if(tempInt > answer) answer = tempInt;
            if(tempTree.left!=null){
                int pushtempInt = tempInt+1;
                stInt.push(pushtempInt);
                stTree.push(tempTree.left);
            }
            if(tempTree.right!=null){
                int pushtempInt = tempInt+1;
                stInt.push(pushtempInt);
                stTree.push(tempTree.right);
            }
        }

        return answer;
    }
    int bfs(TreeNode root){
        int answer =0;
        Queue<TreeNode> qTree = new LinkedList<>();
        qTree.offer(root);

        while (qTree.size()!=0){
            int size = qTree.size();
            answer++;
            for (int i = 0; i < size; i++) {
                TreeNode tmp = qTree.poll();
                if(tmp.left!=null) {
                    qTree.offer(tmp.left);
                }
                if(tmp.right!=null) {
                    qTree.offer(tmp.right);
                }
            }
        }
        return answer;
    }
//    int dfs(TreeNode root, int depth){
//        System.out.println("test"+depth);
//        if(root.left!=null && root.left.val != -1){
//            int copy = depth+1;
//            dfs(root.left,copy);
//        }
//        if(root.right!=null && root.right.val != -1){
//            int copy = depth+1;
//            dfs(root.right,copy);
//        }
//        if( depth>answer) {
//            answer = depth;
//        }
//        return depth;
//    }
}
