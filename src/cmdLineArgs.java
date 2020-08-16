/*1. No. words in string
        2. No. of characters in each word
        3. No. of characters in string*/

import java.util.Scanner;

public class cmdLineArgs {

    public static void main(String[] args) {
        int ch = 0;
        System.out.println("Enter the sentence :");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        //no of words in a string
        System.out.println("words in a sentence " + args.length);
        for(int i=0;i<args.length;i++){
            String s = args[i];
            ch = s.length()+ch;
            System.out.println("No of charecters in " + s +s.length());
        }
    }
}
