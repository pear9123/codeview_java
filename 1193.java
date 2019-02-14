import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cog = 0;
		int sum = 0;
		
		while (sum < n) {
			cog++;
//			System.out.println("cog : "+cog);
			sum += cog;
//			System.out.println("sum : "+sum);
		}
		int temp = cog; // group check
		int A = 1;
		for(int i=(sum-cog)+1; i < n; i++){
			cog--;
			A++;
		}
		System.out.println(temp%2 !=0 ? cog+"/"+A : A+"/"+cog);
	}
}