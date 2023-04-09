/******************************************************************************************************************************************************

Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
If the user's choice is 1, calculate the area of the circle having the given radius(R).  
Else if choice is 2, calculate the area of the rectangle with given length(L) and breadth(B).

___________________________________________________________________________________________________ 

Example 1:

Input: 
choice = 1, 
R = 5
Output: 78.53981633974483
Explaination: The choice is 1. 
So we have to calculate the area of the circle.
 

Example 2:

Input: 
choice = 2, 
L = 5, B = 10
Output: 50
Explaination: Here we have to calculate the 
area of the rectangle.

___________________________________________________________________________________________________

*******************************************************************************************************************************************************/

// User function Template for Java

class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            
            case 1:
                return Math.PI*arr.get(0)*arr.get(0);
                
            case 2:
                return arr.get(0)*arr.get(1);
               
        }
        return 0;
    }
}
