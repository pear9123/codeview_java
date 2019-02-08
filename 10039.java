import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int sum = 0;
        for(int a=0; a<num.length; a++){
        	num[a] = sc.nextInt();
        	while (num[a]%5 != 0) {
				num[a] = sc.nextInt();
			}
        	if(num[a] < 40){
        		num[a] = 40;
        	}
//        	System.out.println(num[a]);
        	sum += num[a];
        }
        System.out.println(sum/num.length);
	}
}