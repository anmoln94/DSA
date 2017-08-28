/* Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 * Use a hashset to store substrings, because the second time you enter a duplicate value it will return false,
 * which will indicate that it is a repeating substring, so add it the result arraylist.
 */
public List<String> findRepeatedDnaSequences(String s) {
    Set seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (!seen.add(ten))
            repeated.add(ten);
    }
    return new ArrayList(repeated);
}