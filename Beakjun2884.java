import java.util.Scanner;

public class Beakjun2884 {

	public static void main(String[] args) {
		
		Scanner time = new Scanner(System.in);
		int H = time.nextInt();
		int M = time.nextInt();
		// 60을 곱해버리면?
		// H가 0이면 문제 생겼다 - 음수가 나온다 24로 바꿔주자
		// H가 0일 때, M 이 45 보다 크면 24시 M-45분 형식으로 표기됨
		// H가 0이고, M 이 45 미만일 때만 H에 24를 대입하자 M이 45이상이면 H는 0
		if(H == 0 && M < 45) {
			H =24;
		}
		
		int HM = H * 60 + M;// 일어나야 되는 시각을 분으로 나타내면
		
		int result = HM - 45; // 알람 설정 시각을 분으로 나타내면
		
		// 위의 결과를 60으로 나누면 시간 나오고 나머지가 분
		System.out.print((result / 60) + " " + result % 60);
		time.close();
	}

}
