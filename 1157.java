import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int[] cnt = new int[26];
		int max = 0;
		char answer = '?';
		
		String word = sc.next().toUpperCase(); // 모든 문자열 대문자로 표시
		
		for(int i=0; i<word.length(); i++){
			cnt[word.charAt(i)-65]++;
			if(max < cnt[word.charAt(i)-65]){
				answer = word.charAt(i);
				max = cnt[word.charAt(i)-65];
			
			} else if(max == cnt[word.charAt(i)-65]){
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}