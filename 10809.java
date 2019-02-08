import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		String temp = sc.nextLine();
//		String temp = "baekjoon";
		int alpa_num = alpa.length();
		int temp_num = temp.length();
		String[] ap = new String[alpa_num];
		String[] tp = new String[temp_num];
		boolean chk = false;
		int tttt = -1;
		int tttt_chk = 0;
		
		for(int a=0; a<alpa_num; a++){
			ap[a] = alpa.substring(a, a+1);
		}
		
		for(int b=0; b<temp_num; b++){
			tp[b] = temp.substring(b, b+1);
		}
		
		for(int i=0; i<ap.length; i++){
//			System.out.println(ap[i]); // a,b,c,d,e,f...z
			for(int x=0; x<tp.length; x++){ // b,a,e,k,j,o,o,n
//				System.out.println("tp[x] : "+tp[x]);
				if(ap[i].equals(tp[x])){
//					System.out.println(ap[i]+ " // "+tp[x]);
					if(tttt_chk == 0){
						tttt = x;
						tttt_chk += 1;
					} else {
						tttt = tttt;
					}
					chk = true;
				}
			}
//			System.out.println(chk);
			if(tttt != -1){
				System.out.println(tttt);
			} else {
				System.out.println(tttt);
			}
			tttt_chk = 0;
			tttt = -1;
			chk = false;
		}
	}
}