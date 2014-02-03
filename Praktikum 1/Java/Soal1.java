/* Nama File	: Soal1.java */
/* Nim - Nama	: 13512100 - Luthfi Hamid Masykuri */

import java.util.Scanner;
public class Soal1 {
	public static void main (String[] args){
		int a,b;
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		System.out.println(a+" x "+b+" = "+a*b);
		System.out.println(a+" div "+b+" = "+a/b);
		System.out.println(a+" mod "+b+" = "+a%b);
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
	}
}