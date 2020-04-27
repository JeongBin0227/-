public class NumberOfIsland {
	public static void main(String[] args) {
		char[][] grid= {
						{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'}
					   };
		
		NumberOfIsland a = new NumberOfIsland();
		System.out.println(a.numsIslands(grid));
	}
	int[][] dirs= {{0,1},{0,-1},{1,0},{-1,0}};
	int m, n;
	
	int numsIslands(char[][] grid) {
		
		System.out.println(grid[0][0]);
		merge(grid,0,0);
		System.out.println(grid[0][0]);
		return m;
		
	}
	void merge(char[][] grid, int i, int j) {
		grid[0][0] = '3';
		
	}
}