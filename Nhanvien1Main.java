import java.util.Scanner;

public class Nhanvien1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhanvien1[] emp = new Nhanvien1[100];
		int i = 0;
		Scanner key=new Scanner(System.in);
		System.out.println("Nhập số lượng nhân viên =");
		int n = key.nextInt();
		while(i < n) {
			emp[i]=new Nhanvien1();
		    emp[i].nhap();
		    emp[i].in();
		    emp[i].luong();
		    emp[i].searchTen("Phạm Văn");
		    i++;
		}
	}
}