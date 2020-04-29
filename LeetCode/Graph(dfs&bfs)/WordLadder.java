import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String[] words = {"hot", "dot", "dog",  "cog","log"};
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
        dfs(0,0,beginWord,endWord,wordListCheck,wordList);

        return answer;
    }
    void dfs(int count, int time, String word, String endWord, boolean[] wordListCheck, List<String> wordList){
        System.out.println("word"+word);
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
                    System.out.println("word"+word);
                    System.out.println("word"+endWord);
                    if (word == endWord) {
                        if(answer>count)  answer = count;
                    }
                    wordListCheck[i] = true;
                    dfs(count, i, wordList.get(i),endWord, wordListCheck, wordList);
                }
            }
        }
    }
}
