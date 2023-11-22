package 배열메서드입출력;

import java.util.ArrayList;
import java.util.Arrays;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int[] result = s.solution(0);
		System.out.println(Arrays.toString(result));
	}
}

class Solution7 {
	public int[] solution(int money) {
		int[] answer = {0, 0};
		int count = money/5500; //살 수 있는 커피
		int change = money % 5500; //잔돈
		
		System.out.println(count + " " + change);
		answer[0] = count;
		answer[1] = change;
		return answer;
	}
}