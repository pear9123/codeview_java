
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double M = 0; // 최고점수
		int N = sc.nextInt(); // 과목 수
		double[] score = new double[N]; // 이전 점수
		double[] val_score = new double[N]; // 이후 점수
		double aver = 0; // 평균값
		
		for(int a=0; a<N; a++){
			score[a] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<score.length; i++){
			if(M<score[i]){
				M = score[i];
			}
		}// 최고값구하기
		
		for(int x=0; x<score.length; x++){
			val_score[x] = score[x]/M*100;
		} // 바뀐값 구하기
		
		for(int y=0; y<val_score.length; y++){
			aver += val_score[y];
		}
		
		//System.out.println(String.format("%.6f", aver/N));
		System.out.println(aver/N);
		}
	}
