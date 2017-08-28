/*	beginWord = "hit"
	endWord = "cog"
	wordList = ["hot","dot","dog","lot","log","cog"]
	As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
	return its length 5.
	
	Logic is keep two sets. "reached" set contains all the words that have been formed by permutation (and are part of the dictionary)
	"toAdd" set contains all words reached at the most recent permutations.
	Each time we form all possible new words by changing letters at all index,
	and if a word exists in the dictionary we remove it from the dictionary.
	
	Note: We only add words to the reached set that are part of the dictionary.
	Keeping hashset ensure we dont add redundant entries.
	
	Distace: How many letters we have changed till now since the beginning word. 
	Eg: First all words by changing only 1 letter. Later changing that will mean 2 letters changed and so on.
	
 * 
 * 
 * 
 */
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        wordList.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<String>();
            for (String each : reached) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordList.contains(word)) {
                            toAdd.add(word);
                            wordList.remove(word);
                        }
                    }
                }
            }
            distance++;		
            if (toAdd.size() == 0) return 0;
            reached = toAdd;	//Only most recently formed words at the latest distance
        }
        return distance;
    }
}