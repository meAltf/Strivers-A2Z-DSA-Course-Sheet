/******************************************************************************************************************************************************

Geek is learning a new programming language. As data type forms the most fundamental part of a language, Geek is learning them with focus and
needs your help.
Given a data type, help Geek in finding the size of it in byte.

____________________________________________________________________________________________

Data Type - Character, Integer, Long, Float and Double

Example 1:

Input: Character
Output: 1
Example 2:

Input: Integer
Output: 4
____________________________________________________________________________________________

*******************************************************************************************************************************************************/


// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
        // code here
        if(str.equals("Character")) return 1;
            
        else if(str.equals("Integer") || str.equals("Float")) return 4;
      
        else if(str.equals("Long") || str.equals("Double")) return 8;
      
        return -1;  
    }
}
