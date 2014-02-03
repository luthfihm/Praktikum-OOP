/* Nama File	: Soal6.java */
/* Nim - Nama	: 13512100 - Luthfi Hamid Masykuri */

import java.util.Scanner;
public class Soal6 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		int n,i,sum;

		n = in.nextInt();

		int b[] = new int[n];

		sum = 0;
		for (i=0;i<n;i++){
			b[i] = in.nextInt();
			sum += b[i];
		}

		if (n > 1){
			for (i=(n-1);i>=0;i--){
				if (i > 0){
					System.out.print(b[i]+"+");
				}else{
					System.out.print(b[i]+"= ");
				}
			}
		}
		System.out.println(sum);
	}
}