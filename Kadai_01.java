// �ǂݍ��񂾐����l�͕��̒l��?
import java.util.Scanner;

public class Kadai_01 {
	public static void main(String[] args)  {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("�����l:");
		int n = stdIn.nextInt();
		if (n < 0) {
			System.out.println("���̒l�͕��ł��B");
		}else{
			System.out.println("���̒l�͐��ł��B");
		}
	}
}
