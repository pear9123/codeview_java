import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt(); // 시작 갯수
		int clr = 0;
		int result = 0;
		sc.nextLine();
		
		for(int x=0; x<start; x++){ // x=0; x<3; x++  => x = 0,1,2
			
			String str = sc.nextLine();
			
			int str_num = str.length();
			String[] str_temp = new String[str_num];
			
			for(int a=0; a<str_num; a++){
				str_temp[a] = str.substring(a, a+1);
			}
			for(int b=0; b<str_temp.length; b++){
				if(str_temp[b].equals("O")){
					clr += 1;
				} else if(str_temp[b].equals("X")) {
					clr = 0;
				}
//			System.out.println("O의 값 : "+clr);
			result += clr;
			}
//			System.out.println("결과 값 : "+result);
			System.out.println(result);
			clr = 0;
			result = 0;
		}
	}
}