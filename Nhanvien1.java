import java.util.Scanner;

/**
 * @author ADMIN
 *
 */
public class Nhanvien1 {
	String MNV;
	float hsl;
	float cong;
	/**
	 * @return the mNV
	 */
	public String getMNV() {
		return MNV;
	}
	/**
	 * @param mNV the mNV to set
	 */
	public void setMNV(String mNV) {
		MNV = mNV;
	}
	/**
	 * @return the hsl
	 */
	public float getHsl() {
		return hsl;
	}
	/**
	 * @param hsl the hsl to set
	 */
	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	/**
	 * @return the cong
	 */
	public float getCong() {
		return cong;
	}
	/**
	 * @param cong the cong to set
	 */
	public void setCong(float cong) {
		this.cong = cong;
	}
	public void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập Mã NV =");
	this.MNV=sc.nextLine();
	System.out.println("Nhập hệ số lương =");
	this.hsl=Float.parseFloat(sc.nextLine());
	System.out.println("Nhập Ngày công =");
	this.cong=Float.parseFloat(sc.nextLine());
	}
	public float luong() {
		float luong;
		if(this.cong>26)
			luong = this.hsl*1500000;
		else luong=this.hsl*1400000;
		return luong;
	}
	public void in() {
		System.out.println(this.getMNV() + " Có Lương Là "+this.luong());
	}
	public void searchTen(String ten) {
		if(this.MNV.contains(ten))
			System.out.println("MaNV" + this.getMNV());
	}
}