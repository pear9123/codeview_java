import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().trim();
		sc.close();
		
		if(str.isEmpty()){
			System.out.print(0);
		} else {
			System.out.print(str.split(" ").length);
		}
	}
}