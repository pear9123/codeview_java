import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int t_case = sc.nextInt();
		for(int i=0; i<t_case; i++){
			int K = sc.nextInt();
			int N = sc.nextInt();
			int result = 0;
			int[] chk = new int[15];
			for(int a=0; a<K; a++){
				for(int b=0; b<N; b++){
					if(a == 0){
						chk[b] = b+1; // 1, chk[1] = 2, chk[2] = 3, chk[3]=4,chk[4]=5,chk[5]=6 // chk[0]=1, chk[1]=2
					} else {
						if(b == 0){
							chk[b] = 1; // 1
						} else {
							chk[b] += chk[b-1]; // chk[1] += chk[0] => 3, chk[2]+=chk[1]=>6,chk[3]+=chk[2]=>10,chk[4]+=chk[3]=>15,chk[5]+=chk[4]=>21 //
						}
					}
//					System.out.print(chk[b]+" "); // chk[0] = 1, chk[1] = 2 , chk[2]=3,chk[3]=4,chk[4]=5,chk[5]=6 // chk[0]=1
					if((a+1) == K){
						result += chk[b];
					}
				}
//				System.out.println();
			}
			System.out.println(result);
		}
	}
}