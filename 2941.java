import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String[] nanum = new String[str.length()]; // nanum 의 배열로 쪼개기
		int chk = 0;
		
		for(int a=0; a<nanum.length; a++){ // nanum 배열에 순서대로 입력
			nanum[a] = str.substring(a, a+1);
			switch (nanum[a]) {
			case "=":
				if(nanum[a-1].equals("c") || nanum[a-1].equals("s") || nanum[a-1].equals("z")){ // 이전 z,=,d 면 z=,X,d
					if(nanum[a-1].equals("z")){
						if(nanum[a-2].equals("d")){
							nanum[a-2] = nanum[a-2]+nanum[a-1]+nanum[a];
							nanum[a-1] = "X";
							nanum[a] = "X";
						} else {
							nanum[a-1] = nanum[a-1]+nanum[a];
							nanum[a] = "X";
						}
					} else {
						nanum[a-1] = nanum[a-1]+nanum[a];
						nanum[a] = "X";
					}
				}
				break;
			case "-":
				if(nanum[a-1].equals("c") || nanum[a-1].equals("d")){ // 이전 z,=,d 면 z=,X,d
					nanum[a-1] = nanum[a-1]+nanum[a];
					nanum[a] = "X";
				}
				break;
			case "j":
				if(nanum[a-1].equals("l") || nanum[a-1].equals("n")){ // 이전 z,=,d 면 z=,X,d
					nanum[a-1] = nanum[a-1]+nanum[a];
					nanum[a] = "X";
				}
				break;
			default:
				break;
			}
		}
		for(int b=0; b<nanum.length; b++){
			System.out.println(nanum[b]);
			if(nanum[b] != "X"){
				chk ++;
			}
		}
		System.out.println(chk);
	}
}