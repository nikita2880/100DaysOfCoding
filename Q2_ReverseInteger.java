public class Q2_ReverseInteger {
    public static void main(String[] args) {
        Q2_ReverseInteger mainObj = new Q2_ReverseInteger(); // Creating an instance of the class
        int number = 12345;
        int reversedNumber = mainObj.reverse(number); // Calling the reverse method
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public int reverse(int x) {
        int ans = 0, last;
        while (x != 0) {
            last = x % 10;
            ans = (ans * 10) + last;
            x = x / 10;
        }
        return ans;
    }
}
