
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine().toUpperCase();
		String[] str = new String[dia.length()];
		int result = 0;
		// System.out.println("dia : "+dia);
		
		for(int a=0; a<str.length; a++){
			str[a] = dia.substring(a, a+1);
			if(str[a].equals("A") || str[a].equals("B") || str[a].equals("C")){
				result += 3;
			}if(str[a].equals("D") || str[a].equals("E") || str[a].equals("F")){
				result += 4;
			}if(str[a].equals("G") || str[a].equals("H") || str[a].equals("I")){
				result += 5;
			}if(str[a].equals("J") || str[a].equals("K") || str[a].equals("L")){
				result += 6;
			}if(str[a].equals("M") || str[a].equals("N") || str[a].equals("O")){
				result += 7;
			}if(str[a].equals("P") || str[a].equals("Q") || str[a].equals("R") || str[a].equals("S")){
				result += 8;
			}if(str[a].equals("T") || str[a].equals("U") || str[a].equals("V")){
				result += 9;
			}if(str[a].equals("W") || str[a].equals("X") || str[a].equals("Y") || str[a].equals("Z")){
				result += 10;
			}
			System.out.println("result : "+result);
		}
		System.out.println(result);
	}
}