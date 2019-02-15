import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int day = sc.nextInt();
		int chk = 0;
		int chk2 = 0;
		
		for(int a=1; a<=mon; a++){
			if(a == 2){
				for(int b=1; b<=28; b++){
					if(mon == a){
						if(b <= day){
							chk2++;
						}
					} else {
						chk++;
					}
				}
			} else if(a == 4 || a == 6 || a == 9 || a == 11){
				for(int b=1; b<=30; b++){
					if(mon == a){
						if(b <= day){
							chk2++;
						}
					} else {
						chk++;
					}
				}
			} else {
				for(int b=1; b<=31; b++){
					if(mon == a){
						if(b <= day){
							chk2++;
						}
					} else {
						chk++;
					}
				}
			}
		}
		switch ((chk+chk2)%7) {
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;	
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 0:
			System.out.println("SUN");
			break;
		default:
			break;
		}
	}
}