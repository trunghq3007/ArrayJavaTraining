/**
 * 
 */
package main.start;

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
	public static void main(String[] args) {
		//
		int number;
		// cách khai báo mảng 1
		int arrayInt[];
		// khởi tạo mảng
		arrayInt = new int[10];
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = i + 10;
		}

		/*
		 * for (int i = 0; i < arrayInt.length; i++) {
		 * System.out.println(String.valueOf(arrayInt[i])); // arrayObjectAndInit[i] }
		 */

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

			//System.out.println(arrayObjectAndInit[i].toString());
			//System.out.println(caculate("xin chao", " lop java"));
		}

	}

	 /**
	 * @description: hahajdkjnjdnsdnmdmk 
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 7, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 7, 2018
	 * @exception: 
	 * @param x
	 * @param y
	 * @return String , concat two args
	 */
	public static String caculate(String x, String y) {
		return x + y;
	}

}
