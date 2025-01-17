import java.util.Scanner;
class PalindromeChecker {
    //creating variable to store text
    private String text;

    //constructor of class to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if a string is palindrome by comparing start and end characters
    public void isPalindrome() {
        //creating variables start and end to indicate starting and ending index of text
        int start = 0;
        int end = this.text.length() - 1;
        //creating variable flag
        boolean flag = true;

        while (start < end) {
            if (this.text.charAt(start) != this.text.charAt(end)) {
                System.out.println("text " + this.text + " is not palindrome");

                //initializing flag to false because text is not palindrome
                flag = false;

                break;
            }
            start++;
            end--;
        }
        //if flag == true then text is palindrome
        if(flag) {
            System.out.println("text " + this.text + " is palindrome");
        }
    }

    public static void main(String[] args) {

        //creating scanner object
        Scanner input = new Scanner(System.in);

        //creating variable text to indicate text and taking user input for text
        System.out.print("Enter text : ");
        String text = input.nextLine();

        //creating object
        PalindromeChecker object = new PalindromeChecker(text);

        //calling the method isPalindrome to check whether the text is palindrome or not
        object.isPalindrome();

        //closing the input
        input.close();
    }
}