/**
 * 
 */
package main.start;

/**
 * @description:
 * @author: Admin
 * @time: 9:16:27 PM
 * @date: Mar 7, 2018
 */
public class Mang2Chieu {
	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 7, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 7, 2018
	 * @exception:
	 */
	public static void main(String... a) {

		int[][] mang2ChieuInt;
		int mang2ChieuInt1[][];
		int[][] mang2ChieuInt2;
		int[] mang2Chieu3[];
		int[] mang2Chieu4[];

		mang2ChieuInt = new int[5][10];

		// mang co số dòng : 2

		mang2Chieu4 = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mang2Chieu4[i][j] + ", ");

			}
			System.out.println();
		}
		System.out.println("***************");

		// mang2Chieu4.length = số dòng của mảng 2 chiều
		// mang2Chieu4[i].length = số cột của mảng 3 chiều
		for (int i = 0; i < mang2Chieu4.length; i++) {
			for (int j = 0; j < mang2Chieu4[i].length; j++) {
				System.out.print(mang2Chieu4[i][j] + ", ");

			}
			System.out.println();
		}

		mang2ChieuInt1 = new int[2][5];

	}
}
