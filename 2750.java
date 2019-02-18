import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();
		int[] num = new int[t_case];
		
		for(int a=0; a<t_case; a++){
			num[a] = sc.nextInt();
		}
		Arrays.sort(num);
		for(int b=0; b<t_case; b++){
			System.out.println(num[b]);
		}
	}
}