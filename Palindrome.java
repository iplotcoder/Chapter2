package Chapter2;


/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    // instance variables - replace the example below with your own
    public String word;
    private boolean isPalindrome;
    public int length;

    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome(String wd)
    {
        this.word = wd;
    }
    
    public boolean testWord()  {
        //Logic to test palindrome
        for(int i = 0; i< word.length(); i++) {
            System.out.println(word.substring(i, i+1));
        }
        //Set instance variable
        return isPalindrome;
    }
    }

