/**
 * 
 */
package main.start;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Admin
 * @time: 7:48:07 PM
 * @date: Mar 7, 2018
 */
public class main {

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 7, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 7, 2018
	 * @exception:
	 * @param args
	 */
	public static void main1(String[] args) {
		//
		int number;
		// cách khai báo mảng 1
		int arrayInt[];
		// khởi tạo mảng
		arrayInt = new int[10];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = i + 10;
		}
		System.out.println(Arrays.toString(arrayInt));
		for (int i = 0; i < arrayInt.length; i++) {
			// System.out.println(String.valueOf(arrayInt[i]));
			// arrayObjectAndInit[i]

		}

		for (int i : arrayInt) {
			// System.out.println(String.valueOf(i));
			// System.out.println(i + "");
		}

		// cách khai báo mảng 2
		int[] arrayInt1;
		// cách khai báo mảng 3;
		int[] arrayInt2;
		Object[] arrayObject;
		arrayObject = new Object[10];

		// khai báo kèm khởi tạo
		int arrIntAndInit[] = { 1, 2, 4 };
		int arrIntAndInit2[] = new int[100];
		// truy xuất mảng
		for (int i = 0; i < arrIntAndInit.length; i++) {
			// System.out.println(String.valueOf(arrIntAndInit[i]));
		}
		//
		Object[] arrayObjectAndInit = { "abc", "xyz" };
		for (int i = 0; i < arrayObjectAndInit.length; i++) {
			// System.out.println(String.valueOf(arrayObjectAndInit[i]));

			// System.out.println(arrayObjectAndInit[i].toString());
			// System.out.println(caculate("xin chao", " lop java"));
		}
		// cách khai báo kèm khởi tạo mảng
		int[] years = new int[] { 2001, 1994, 1995, 2000, 2017 };
		int[] years1 = new int[] { 2001, 1994, 1995, 2000, 2017 };
		for (int i : years) {
			// System.out.println(String.valueOf(i));
			// System.out.println(i + "");
		}
		System.out.println("**************");

		Arrays.sort(years);
		for (int i : years) {

			// System.out.println(String.valueOf(i));
			// System.out.println(i + "");
		}
		// boolean tự ép kiểu về string
		// System.out.println("ket qua so sanh year va years1: "+ Arrays.equals(years,
		// years1));
		// System.out.println("ket qua so sanh year va years: "+ Arrays.equals(years,
		// years));
	}

	/**
	 * @description: caculate , concat two args.
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 7, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 7, 2018
	 * @exception:
	 * @param x
	 * @param y
	 * @return String
	 */
	public static String caculate(String x, String y) {
		return x + y;
	}

}
