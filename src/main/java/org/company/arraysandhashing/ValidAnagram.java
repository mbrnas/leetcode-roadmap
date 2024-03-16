package org.company.arraysandhashing;

/*
 * This method's job is to determine if two strings are anagrams of each other.
 * For example, the words earth and heart are anagrams, as they can be reshuffled to create the other.
 * The method returns a boolean value. It first verifies that both strings are of equal length.
 * We create an array named total_chars of size 26 (representing all alphabet letters) to keep track.
 * We then iterate through String s, and for each letter we encounter, we increase the corresponding count in total_chars.
 * For each letter in String s that also appears in String t, we decrease the corresponding count in total_chars.
 * If the strings are anagrams, all counts will be 0. If not, the strings are not anagrams.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] total_chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            total_chars[s.charAt(i) - 'a']++;
            total_chars[t.charAt(i) - 'a']--;
        }

        for (int count : total_chars) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
