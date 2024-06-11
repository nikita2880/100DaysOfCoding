public class Q3_LongestCommonPrefix {
    
    public static void main(String[] args) {
        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "interval", "internal"};
        String[] strs4 = {"prefix", "prefixes", "pre"};

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test the longestCommonPrefix method and print the results
        System.out.println("Test case 1: " + solution.longestCommonPrefix(strs1)); // Output: "fl"
        System.out.println("Test case 2: " + solution.longestCommonPrefix(strs2)); // Output: ""
        System.out.println("Test case 3: " + solution.longestCommonPrefix(strs3)); // Output: "inte"
        System.out.println("Test case 4: " + solution.longestCommonPrefix(strs4)); // Output: "pre"
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string in the array as the initial prefix
        String prefix = strs[0];

        // Iterate over the array starting from the second string
        for (int i = 1; i < strs.length; i++) {
            // Update the prefix by comparing it with the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix is empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the longest common prefix found
        return prefix;
    }
}
