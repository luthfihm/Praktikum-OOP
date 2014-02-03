/* Nama File	: Soal3.java */
/* Nim - Nama	: 13512100 - Luthfi Hamid Masykuri */

import java.util.Scanner;
public class Soal3 {
	public static void main (String[] args){
		int a,b;
		Scanner in = new Scanner(System.in);

		a = in.nextInt();
		b = in.nextInt();

		System.out.print(a*b+" ");
		System.out.print(a/b+" ");
		System.out.print(a%b+" ");
		System.out.print((a+b)+" ");
		System.out.println((a-b));
	}
}