public class PalindromeString {

    public void PalindromeDetector(String word) {
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revWord = "" + word.charAt(i);
        }
        if (word.equalsIgnoreCase(revWord)) {
            System.out.println("This is a palindrome!");
        } else
            System.out.println("This isn't a palindrome!");
    }

    public void IntegerPalindromeDetector(int number) {
        number = Math.abs(number);
        int myNum =number;
        int revNumber = 0;
        for (int i = 0; number > 0; i = i * 10) {
            revNumber = (revNumber * 10) + (number % 10);
            number = number / 10;

        }
        System.out.println(revNumber);
        if (myNum == revNumber) {
            System.out.println("this is a palindrome!");
        } else {
            System.out.println("This isn't a palindrome");
        }
    }
}
