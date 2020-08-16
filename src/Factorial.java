//assumption: non-negative integer
//large integers :  use an array to store individual digits
// n=0 is 1
//n=1 is 1! is 1
// n=5 is 5x4x3x2x1

import java.util.Arrays;

public class Factorial {

    public static void main(String args[]) {
        int num = 5;
        int largeNum = 544;
        System.out.println("Factorial of " + num + ":"+ recursiveSmallFactorial(num));
        System.out.println("Factorial of " + num + ":"+ iterativeSmallFactorial(num));
        //large integers
        int[] result = longIntFactorial(largeNum);
        System.out.println("Factorial of " + Arrays.toString(result));
        for(int x=result.length-1;x>=0;x--){
            System.out.println(result[x]);
        }

    }

    static int recursiveSmallFactorial(int n){
        if(n==0)
            return 1;
        else
            return n * recursiveSmallFactorial(n-1);
    }

    static int iterativeSmallFactorial(int n){
        int result = 1;
        int i;
        for (i = 2; i<=n;i++) result *= i;
        return result;
    }

    static int[] longIntFactorial(int n){
        int[] result = new int[500];
        int resultSize = 1;
        for (int i =2;i<=n;i++){
            resultSize = multiply(i,result, resultSize);
        }

        return result;
    }

    static int multiply(int a, int[] result, int size){
        int carry=0;
        for(int i=0;i<result.length;i++){
            int product = result[i]*a + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        while(carry!=0){
            result[size] = carry % 10;
            carry = carry / 10;
            size++;
        }
            return size;
    }


}
