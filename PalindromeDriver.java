package Chapter2;


/**
 * Write a description of class PalindromeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PalindromeDriver
{
    public static void main(String args[]) {
        Palindrome p = new Palindrome("mom");
        boolean correct = p.testWord();
        System.out.println("The word: " + p.word + " is a palindrome: " + correct);
    }
}
