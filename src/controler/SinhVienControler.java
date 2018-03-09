/**
 * 
 */
package controler;

import model.entity.SinhVienJava;

/**
 * @description:
 * @author: Admin
 * @time: 8:56:07 PM
 * @date: Mar 9, 2018
 */
public class SinhVienControler {

	/**
	 * @description: show title
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 9, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 9, 2018
	 * @exception:
	 */
	public void showTitle() {
		System.out.println(" Lop hoc java");
	}

	public static void showThongTinSinhVien(SinhVienJava[] arrSinhVienArgs) {
		for (int i = 0; i < arrSinhVienArgs.length; i++) {
			arrSinhVienArgs[i].showThongTin();
		}
	}

	public static SinhVienJava[] generateData() {
		SinhVienJava[] arrSinhVien;
		// khoi tao mang arrSinhVien size =3
		arrSinhVien = new SinhVienJava[3];
		// khai bao va khoi tao bien sinhVienJava1
		SinhVienJava sinhVienJava1 = new SinhVienJava("ha quang trung", true);
		arrSinhVien[0] = sinhVienJava1;

		SinhVienJava sinhVienJava2 = new SinhVienJava("a", true);
		arrSinhVien[1] = sinhVienJava2;

		SinhVienJava sinhVienJava3 = new SinhVienJava("b", true);
		arrSinhVien[2] = sinhVienJava3;

		return arrSinhVien;
	}

}
