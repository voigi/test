/**
 * 
 */
package Clavier;

import java.util.Scanner;

/**
 * @author voigi
 *
 */
public class Clavier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner mot = new Scanner(System.in);
		System.out.println("Veuillez tapez un mot: ");
		String str = mot.nextLine();
		System.out.println("Veuillez avez saisi " + str);
	}

}
