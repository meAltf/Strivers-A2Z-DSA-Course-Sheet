/******************************************************************************************************************************************************

Given two integers, n and m. The task is to check the relation between n and m.

___________________________________________________________________________________________________

Example 1:

Input:
n = 4
m = 8

Output:
lesser

Explanation:
4 < 8 so print 'lesser'.
Example 2:

Input:
n = 8
m = 8

Output:
equal

Explanation:
8 = 8 so print 'equal'.

___________________________________________________________________________________________________

*******************************************************************************************************************************************************/

//User function Template for Java
class Solution{
    static String compareNM(int n,int m){
        // code here
        
        if( m > n) return "lesser";
        
        else if(m < n) return "greater";
        
        else return "equal";
    }
}
