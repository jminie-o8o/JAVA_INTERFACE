
public class Solution {
	
	  public int solution(int n) {
	      int answer = 0;
	      for(int i=1; i <= n; i++){
	          if(n%i == 0){
	              answer += i;
	          }else{
	              continue;
	          }
	      }
	      return answer;
	  }

	public static void main(String[] args) {
		Solution s1 = new Solution();
		System.out.println(s1.solution(5));
		

	}

}
