import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		for(int i=0; i<total; i++){
			int H = sc.nextInt();
			int W = sc.nextInt();
			int num = sc.nextInt();
			int[] temp = new int[H];
			int start_num = 101;
			int person_chk = 1;
			
			for(int a=0; a<W; a++){
				for(int b=0; b<H; b++){
					if(person_chk == num){
						System.out.println(start_num);
					}
					temp[b] = start_num;
					start_num += 100;
					person_chk++;
				}
				start_num = 101;
				start_num = 101+a+1;
			}
		}
	}
}