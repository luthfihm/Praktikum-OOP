/* Nama File	: Soal4.java */
/* Nim - Nama	: 13512100 - Luthfi Hamid Masykuri */

import java.util.Scanner;
public class Soal4 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		int n,b,i,sum;

		n = in.nextInt();
		sum = 0;
		for (i=0;i<n;i++){
			b = in.nextInt();
			sum += b;
		}
		System.out.println(sum);
	}
}