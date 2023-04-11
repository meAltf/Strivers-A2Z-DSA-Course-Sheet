/******************************************************************************************************************************************************
-------------------
Level- Easy
-------------------
What do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very powerful. 
Majority of coding questions need loops to work. You can't even input testcases without loops!

Here, we will use for loop and check if the given number n is prime or not.

Note:  A number is prime if it's divisible by itself and 1. Also, 1 is not prime.
___________________________________________________________________________________________________

Example 1:

Input:
1

Output:
No
Example 2:

Input:
2

Output:
Yes

___________________________________________________________________________________________________

*******************************************************************************************************************************************************/

// User function Template for Java

class Geeks {
    static void isPrime(int n) {
        
        if (n<2){
            System.out.println("No");
            return;
        } 
        for (int i = 2; i * i <= n; i ++){
            if(n%i == 0){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
