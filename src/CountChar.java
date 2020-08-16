
public class CountChar {

    public static void main(String[] args) {
        String input = "Today is a good day";
        String input1 = "qweqewqeqeqwwqe";
        formalLoopWithSingleChar(input);
        aschiiIntArray(input1);
    }

    public static void formalLoopWithSingleChar(String input){
        int count =0;
        for(int i=0; i<input.length();i++){
            if(input.charAt(i) == 'a'){
                    count++;
            }
        }

        System.out.println("no of occurances of a is : " + count);
    }

    public static void aschiiIntArray(String input){
        //initialize a int array
        final int MAX_CHAR = 256;
        int asciiCounter[] = new int[MAX_CHAR];
        int len = input.length();
        /* This array holds the occurrence of each char, For example
	 * ASCII value of A is 65 so if A is found twice then
	 * counter[65] would have the value 2, here 65 is the ASCII value
	 * of A*/
        for(int i=0; i<len;i++){
            asciiCounter[input.charAt(i)]++;
        }

        //initialize a char array
        char ch[] = new char[input.length()];
        for(int i=0;i<input.length();i++){
            ch[i] = input.charAt(i);
            int count = 0;
            for (int j=0;j<=i;j++){
                if(input.charAt(i)==ch[j]){
                    count++;
                }
                if (count == 1)
                    System.out.println("occurance of char:" +input.charAt(i) +count);
            }
        }

    }





}
