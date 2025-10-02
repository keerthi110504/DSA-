/*Chef is in a shop with 
N
N distinct items. The 
i
i-th item is sold at a price of 
C
i
C 
i
​
 .

Chef only wants expensive items, and so he has decided that he will buy the 
K
K most expensive items. Find how much total cost Chef had to pay to buy the 
K
K most expensive items.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains 
2
2 integers - 
N
N and 
K
K.
The second line contains 
N
N integers - 
C
1
,
C
2
,
…
,
C
N
C 
1
​
 ,C 
2
​
 ,…,C 
N
​
 .
Output Format
For each test case, output on a new line the total cost to buy 
K
K most expensive items.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
K
≤
N
≤
100
1≤K≤N≤100
1
≤
C
i
≤
100
1≤C 
i
​
 ≤100
Sample 1:
Input
Output
3
3 3
1 100 5
3 1
1 100 5
4 2
9 2 5 8
106
100
17
Explanation:
Test Case 1 : Chef buys all items for 
1
+
100
+
5
=
106
1+100+5=106.

Test Case 2 : Chef buys only the most expensive item, which is 
100
100. */
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int T=1;T<=t;T++)
		{
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<arr.length;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int total = 0;
            for (int i = n- 1; i >= n- k; i--) {
                total += arr[i];
            }
            
            System.out.println(total);

		    
		}

	}
}
