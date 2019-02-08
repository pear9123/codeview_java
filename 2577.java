import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int val = A*B*C;
		String result = String.valueOf(val);
		String[] row = new String[result.length()];
		
		for(int i=0; i<result.length(); i++){
			row[i] = result.substring(i,i+1);
		}
		for(int a=0; a<row.length; a++){
			switch (row[a]) {
			case "0":
				zero++;
				break;
			case "1":
				one++;
				break;
			case "2":
				two++;
				break;
			case "3":
				three++;
				break;
			case "4":
				four++;
				break;
			case "5":
				five++;
				break;
			case "6":
				six++;
				break;
			case "7":
				seven++;
				break;
			case "8":
				eight++;
				break;
			case "9":
				nine++;
				break;
			default:
				break;
			}
		}
		System.out.println(zero+"\n"+one+"\n"+two+"\n"+three+"\n"+four+"\n"+five+"\n"+six+"\n"+seven+"\n"+eight+"\n"+nine);
	}
}