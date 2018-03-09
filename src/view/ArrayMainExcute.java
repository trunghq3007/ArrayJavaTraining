/**
 * 
 */

package view;

import controler.SinhVienControler;
import model.entity.*;

/**
 * @description:
 * @author: Admin
 * @time: 7:48:48 PM
 * @date: Mar 9, 2018
 */
public class ArrayMainExcute {
	// khai bao bien sinhVienControler
	static SinhVienControler sinhVienControler;
	// khai bao bien mang arrSinhVien;
	static SinhVienJava[] arrSinhVien;

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 9, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 9, 2018
	 * @exception:
	 * @param args
	 */
	public static void main(String[] args) {
		sinhVienControler = new SinhVienControler();
		sinhVienControler.showTitle();
		// generate data cho mang
		arrSinhVien = sinhVienControler.generateData();
		// hin thi thong tin sinh vien
		sinhVienControler.showThongTinSinhVien(arrSinhVien);
	}

}
