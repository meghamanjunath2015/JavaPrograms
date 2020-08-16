//madam, 121, 12321,1001
// Case-sensitive

//assumption - non=negative integer
public class Palindrome {
    public static void main(String[] args) {
        String paliString1 = "12321";
        String paliString2 = "AbbA";
        int num = 12321;
        if(twoPointersPalindrome(paliString1))
            System.out.println("Yes");
        else
            System.out.println("No");
        if(twoPointersPalindrome(paliString2))
            System.out.println("Yes");
        else
            System.out.println("No");
        if(libPalindrome(paliString2))
            System.out.println("Yes");
        else
            System.out.println("No");
        if(moduloPalindrome(num))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean twoPointersPalindrome(String paliString){
        int length = paliString.length();
        int i=0;
        int j = length - 1;
        while(i<j){
            if(paliString.charAt(i)!= paliString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean libPalindrome(String paliString){
        String x = new StringBuffer(paliString).reverse().toString();
        return (new StringBuffer(paliString).reverse().toString().equals(paliString))? true: false;
    }

    //
    static boolean moduloPalindrome(int num){
        int number = num;
        int reverseNum = 0;
        int reminder;
        while(number!=0){
            reminder = number % 10;
            reverseNum = reverseNum * 10 + reminder;
            number = number/10;
        }
        return (num ==reverseNum)? true: false;
    }
}
