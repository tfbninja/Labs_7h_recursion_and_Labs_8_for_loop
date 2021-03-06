/*
 * The goal of this lab is to print the words in a sentence backwards and vertically
 * It would be helpful if you remember your String methods
 * Example:
 *   Input:  This is a sentence
 *   Output: sentence
 *			 a
 *			 is
 *			 This
 */
package lab07h_recursion;

/**
 *
 * @author wkranz
 */
public class StringWord {

    public static void main(String[] args) {
        //Instantiate your object
        //Call the recursive method printStringWords to print the words
        StringWord obj = new StringWord();
        System.out.println(obj.printStringWords("This is a sentence."));
    }

    public String printStringWords(String word) {
        if (!word.contains(' ')) {
            return word;
        }
        return word.substring(word.lastIndexOf(" ")) + printStringWords(word.substring(0, word.lastIndexOf(" ")));
    }
}
