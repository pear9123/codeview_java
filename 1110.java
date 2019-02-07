
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 주어진 수
		int temp_N = 0;
		if(N < 10){
			String tn = "0"+String.valueOf(N);
			temp_N = Integer.parseInt(tn);
		} else {
			temp_N = N;
		}
		int val = 0; // 앞자리 
		int row = 0; // 뒷자리
		int result = 0; // val+row 의 결과값
		int front_val = 0;
		String temp_cycle_val = ""; // result의 뒷값과 row의 값을 붙혀 사용할수있는 문자열
		String temp_zero_down = "";
		int cycle_val = 0;
		int number = 0;
		int check = 0;
		number = temp_N;
		boolean chk = false; // 조건 chk
		
		while(!chk){
			val = number/10;
			row = number%10;
			result = val+row;
			if(result >= 10){
				front_val = result%10;
			} else {
				front_val = result;
			}
			temp_cycle_val = String.valueOf(row)+String.valueOf(front_val);
			cycle_val = Integer.parseInt(temp_cycle_val);
			number = cycle_val;
			check++;
			if(number == N){
				chk = true;
			}
			//System.out.println("N : "+N);
			//System.out.println("number : "+number);
			}
		System.out.println(check);
	}		
}