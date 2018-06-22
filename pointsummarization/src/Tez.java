/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knowx
 */
public class Tez {

	public static void main(String[] args) {

		String str = "Iterate over the output list to know which were the "
				+ "original found words for each stem "
				+ "by getting the  terms sets (displayed between brackets [...] in the above example)";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i]);
			int a = arr[i].length();
			if (a >= 6) {
				System.out.println(arr[i] + " " + a);

				// input.append(arr[i].trim()+" ");
			}

		}

	}

}
