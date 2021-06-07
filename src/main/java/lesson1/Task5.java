package lesson1;

public class Task5 {
    public String reverse(String input) {

        char[] reversedCharSequence = new char[input.length()];
        int index = input.length() - 1;

        for(char letter : input.toCharArray()) {
            reversedCharSequence[index] = letter;
        }
        return String.valueOf(reversedCharSequence);
    }

    public boolean isPalindrome(String racecar) {
        return false;
    }
}

