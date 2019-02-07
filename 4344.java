
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 케이스 돌릴수
		int student = 0; // 학생 수
		int val_score = 0; // 전체 점수

		for(int a=0; a<N; a++){ // a=0 a<3; a++
			double xxx = 0; // 비교 대상
			int aver = 0; // 평균
			student = sc.nextInt(); // student = 2;
			int[] score = new int[student];
			for(int b=0; b<student; b++){ // b=0 b<2 b++
				score[b] = sc.nextInt();
				val_score += score[b]; // 전체 스코어
			}
			aver = val_score/student;
			//System.out.println("val_score : "+val_score);
			//System.out.println("student : "+student);
			//System.out.println("aver : "+aver);
			for(int c=0; c<student; c++){
				//System.out.println("score값 : "+score[c]);
				if(score[c]>aver){
					xxx++;
				}
			}
			//System.out.println("xxx : "+xxx);
			//System.out.println("student : "+student);
			System.out.println(String.format("%.3f", xxx*100 / student)+"%" );
			val_score = 0; // 전체 점수
			xxx = 0; // 비교 대상
			aver = 0; // 평균
		}
	}		
}