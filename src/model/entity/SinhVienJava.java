/**
 * 
 */
package model.entity;

/**
 * @description:thiet ke class SinhVienJava
 * @author: Admin
 * @time: 8:36:05 PM
 * @date: Mar 9, 2018
 */

public class SinhVienJava {
	private String hoTenSV;
	private boolean gioiTinh;

	public SinhVienJava() {
		System.out.println(" goi contructor khong tham so");
	}

	public SinhVienJava(String hoten) {
		System.out.println(" goi contructor khong tham so");
	}

	public SinhVienJava(String hoten, boolean gt) {
		System.out.println(" goi contructor co tham so");
		this.hoTenSV = hoten;
		this.gioiTinh = gt;
	}

	/**
	 * @return the hoTenSV
	 */
	public String getHoTenSV() {
		return hoTenSV;
	}

	/**
	 * @param hoTenSV
	 *            the hoTenSV to set
	 */
	public void setHoTenSV(String hoTenSV) {
		this.hoTenSV = hoTenSV;
	}

	/**
	 * @return the gioiTinh
	 */
	public boolean isGioiTinh() {
		return gioiTinh;
	}

	/**
	 * @param gioiTinh
	 *            the gioiTinh to set
	 */
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	/**
	 * @description: show thong tin cua obj sinhvienjava
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 9, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 9, 2018
	 * @exception:
	 */
	public void showThongTin() {
		// System.out.println("sinh vien thu);
		System.out.println(this.hoTenSV);
		System.out.println(this.gioiTinh);
		System.out.println("************");
	}

}
