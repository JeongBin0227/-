import java.util.Stack;

public class PickDoll {

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println( solution(board,moves));

    }
    static int answer = 0;
    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> sta = new Stack<Integer>();
        for(int i=0;i<moves.length;i++) {
            for(int j=0;j<board.length;j++) {
                if(board[j][moves[i]-1]!=0) {
                    sta.push(board[j][moves[i]-1]);
                    checkStack(sta);
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }
        return answer;
    }
    public static void checkStack(Stack st){
        while(st.size()>=2){
            int tmp = (int) st.pop();
            if((int) st.peek()==tmp){
                st.pop();
                answer+=2;
            }
            else{
                st.push(tmp);
                break;
            }
        }
    }


}