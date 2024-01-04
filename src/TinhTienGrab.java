import java.util.Scanner;

public class TinhTienGrab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner
		Scanner scanner = new Scanner(System.in);
		// Declaring
		int typeGrab;
		double distance, meantime,kq = 0;

		// User input
		do {
			System.out.println(" Vui lòng nhập vào loại xe : ");
			System.out.println(" Nếu là Grab Car : Nhập 1 ");
			System.out.println(" Nếu là Grab SUV : Nhập 2 ");
			System.out.println(" Nếu là Grab Black : Nhập 3 ");
			typeGrab = scanner.nextInt();
		} while (typeGrab > 3 || typeGrab < 1);

		do {
			System.out.println(" vui lòng nhập số km đã đi : ");
			distance = scanner.nextDouble();
		} while (distance <= 0);
		
		do {
			System.out.println(" vui lòng nhập thời gian chờ : ");
			meantime = scanner.nextDouble();
		} while (meantime <= 0);
		kq = total(typeGrab, distance, meantime);
		System.out.println(" Tổng số tiền phải trả là : " + kq);
	}

	public static double total(int typeGrab, double distance, double meantime) {
		double kq = 0;
		double a = distance;
		double b = meantime;
		switch (typeGrab) {
		case 1:
			kq = totalofgrabcar(a, b);
			break;
		case 2:
			kq = totalofgrabsuv(a, b);
			break;
		case 3:
			kq = totalofgrabblack(a, b);
			break;
		default:
			 System.out.println("Loại xe không hợp lệ");
			break;
		}
		return kq;

	}

	public static double totalofgrabcar(double distance, double meantime) {
		double a = distance;
		int b = (int) meantime/3;
		
		double kq = 0;
		if ( a<=1) {
			kq = 8000 + (b*2000);
		}else if (a>1 && a <19) {
			kq = 7500*a + (b* 2000);
		}else {
			kq = 7000*a + (b*2000);
		}
		return kq;
	}
	public static double totalofgrabsuv(double distance, double meantime) {
		double a = distance;
		int b = (int) meantime/3;
		
		double kq = 0;
		if ( a<=1) {
			kq = 9000 + (b*3000);
		}else if (a>1 && a <19) {
			kq = 8500*a + (b*3000);
		}else {
			kq = 8000*a + (b*3000);
		}
		return kq;
	}
	public static double totalofgrabblack(double distance, double meantime) {
		double a = distance;
		int b = (int) meantime/3;
		
		double kq = 0;
		if ( a<=1) {
			kq = 10000 + (b*3500);
		}else if (a>1 && a <19) {
			kq = 9500*a + (b*3500);
		}else {
			kq = 9000*a + (b*3500);
		}
		return kq;
	}

	

}
