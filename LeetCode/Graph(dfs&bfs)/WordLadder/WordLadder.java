import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String[] words = {"hot","dot","dog","lot","log","cog"};
//		String[] words = {"hot","dot","dog","lot","log"};
        List<String> wordList = Arrays.asList(words);
//		Set<String> dict = new HashSet<>(wordList);
        WordLadder a = new WordLadder();
        System.out.println(a.ladderLength_neighbor("hit", "cog", wordList));
    }
    int answer = 1000000;
    public int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord) ) return 0;
        boolean[] wordListCheck = new boolean[wordList.size()];
        dfs(1,0,beginWord,endWord,wordListCheck,wordList);

        return answer;
    }
    void dfs(int count, int time, String word, String endWord, boolean[] wordListCheck, List<String> wordList){
        System.out.println("---------");
        System.out.print("count  "+count);
        System.out.print("word  "+word);
        System.out.print("endWord  "+endWord);

        if (word == endWord) {
            System.out.println("count"+count);
            if(answer>count)  answer = count;
        }
        for (int i = 0; i < wordList.size(); i++) {
            int tmp = 0;
            if(wordListCheck[i]==false) {
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(j) == wordList.get(i).charAt(j)) {
                        tmp++;
                    }
                }
                if (tmp == word.length() - 1) {
                    count++;
                    wordListCheck[i] = true;
                    System.out.println("");
                    System.out.println("xxxxxxxxxxxxxxxx");
                    System.out.print("count  "+count);
                    System.out.print("word  "+word);
                    System.out.print("endWord  "+endWord);
                    dfs(count, i, wordList.get(i),endWord, wordListCheck, wordList);
                }
            }
        }
    }
}
