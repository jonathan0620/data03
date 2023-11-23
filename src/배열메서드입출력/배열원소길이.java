package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열원소길이 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		String[] n = { "I", "am", "a", "java Programmer"};
		int[] result = s.solution(n);
		System.out.println(Arrays.toString(result));
	}
}

class Solution10 {
	public int[] solution(String[] n) {
		int[] answer = new int[n.length]; //답안작성, 글자수카운트
		
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = n[i].length();
		}
		return answer;
	}
}