
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		int cnt = 0;
		
		for(int a=0; a<num.length; a++){
			num[a] = sc.nextInt();
			cnt = num[a];
			int result = 0;
			while (cnt != 0) {
				result = result * 10 + cnt % 10; // 거꾸로 (1*1000)+(2*100)+(3*10)+(4*1)
				cnt /= 10;
		//		System.out.println("result : "+result);
			}
			num[a] = result;
		}
	
		if(num[0] > num[1]){
			System.out.println(num[0]);
		} else if(num[0] < num[1]) {
			System.out.println(num[1]);
		}
	}
}