// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"

class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " "); // reduce multiple spaces to single

        // Step 2: Reverse the whole string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reversed = sb.toString();

        // Step 3: Reverse each individual word again
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (c == ' ') {
                ans.append(word.reverse());
                ans.append(' ');
                word.setLength(0);
            } else {
                word.append(c);
            }
        }

        // Append the last word
        ans.append(word.reverse());

        // Step 4: Return the final cleaned result
        return ans.toString().trim();

    }
}