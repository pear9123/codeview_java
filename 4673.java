
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 10000;
		int X = 0;
		int selfnum = 0;
		boolean chk = false;
		int[] val = new int[N];
		int[] num = new int[N];
		int[] result = new int[N];
		
		for(int y = 1; y <= N; y++){
			String T = String.valueOf(y);
			for(int x=0; x < T.length(); x++){
				int a = T.charAt(x) - '0';
				X += a;
			}
			val[y-1] = y + X;
			X = 0;
		}
		
		for(int a=0; a<num.length; a++){
			num[a] = a+1;
			for(int b=0; b<val.length; b++){
				if(num[a] == val[b]){
					chk = true;
					selfnum = val[b];
					result[a] = 0;
				}
			}
			if(!chk){
				result[a] = num[a];
			}
//			System.out.println(chk);
//			System.out.println(result[a]);
			chk = false;
		}
		
		for(int c=0; c<result.length; c++){
			if(result[c] != 0){
				System.out.println(result[c]);
			}
		}
		
	}		
}