import java.util.*;
public class twosAndZeros_ {
    public static void main(String[] args)throws java.lang.Exception{
        Scanner scn=new Scanner(System.in);
    /* 
     * Kulyash has given you a bag with (N + M)(N+M) balls having distinct colours. Among these, NN balls have the number 22 printed on them and MM balls have the number 00 printed on them.

He defines the score of a non-empty subset SS of these (N + M)(N+M) balls as:
((sum of the balls in S)S) -− ((size of S)S).

Find the count of non-empty subsets of these (N + M)(N+M) balls having their scores divisible by 33. Since the answer can be huge, output it modulo 10^9 + 710 
9
 +7.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains two space-separated integers NN and MM — the number balls having 22 and the number of balls having 00 respectively.
Output Format
For each test case, output on a new line, the number of non-empty subsets having scores divisible by 33, modulo 10^9 + 710 
9
 +7.

Constraints
1 \leq T \leq 10^31≤T≤10 
3
 
1 \leq N, M \leq 10^91≤N,M≤10 
9
 
Sample 1:
Input
Output
2
1 1
2 2
1
5
Explanation:
Test case 11: The only non-empty subset having score divisible by 33 is [2, 0][2,0]. The score of this subset is (2 + 0) - (2) = 0(2+0)−(2)=0, which is divisible by 33. So, the answer is 11.

Test case 22: There are 22 types of subsets having scores divisible by 33: [2,0][2,0] and [2,2,0,0][2,2,0,0]. The first type of subset can for formed in 44 ways (there are two 22s and two 00s) and the second type can be formed in only 11 way. So, the answer is 55.
     */
        // int t=scn.nextInt();
       
     //   while(t!=0){
       
        int n=scn.nextInt();
        int m=scn.nextInt();
    //    t--;
       int count=solution(n,m);
       System.out.println(count);
       // } 
       scn.close();
    }
    public static int solution(int n,int m){
        //int[] set=new int[n+m];
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(2);
        }
        for(int j=0;j<m;j++){
            list.add(0);
        } 
		int counter=0;
        int len=list.size();
        int temp=len;
        System.out.println(list);
        for(int i=0;i<len;i++){
            int score=0;
            ArrayList<Integer> subs= (ArrayList<Integer>)list.subList(i,temp);
			for(int j=0;j<list.size();j++){
                
               score=score+subs.get(j);
         //      System.out.println(score);
            }
            score=score-list.size();
          //  list.remove(i);
       
            if(score%3==0){
                counter++;
           //     System.out.println(counter);
           
               }
            temp--;
        }
        return counter;
    }
    
    // attempt again after studying ArrayList and List
}
