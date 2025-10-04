class Solution {
    public static char extraChar(String s1, String s2) {
        int xor = 0;

        // XOR all characters of s1
        for (int i = 0; i < s1.length(); i++) {
            xor ^= s1.charAt(i);
        }

        // XOR all characters of s2
        for (int i = 0; i < s2.length(); i++) {
            xor ^= s2.charAt(i);
        }

        // Remaining XOR is the extra character
        return (char) xor;
    }

    public static void main(String[] args) {
        System.out.println(extraChar("abcd", "badce")); // e
        System.out.println(extraChar("efg", "gtfe"));   // t
    }
}
