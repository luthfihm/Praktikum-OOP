/* Nama File	: Soal5.java */
/* Nim - Nama	: 13512100 - Luthfi Hamid Masykuri */

import java.util.Scanner;
public class Soal5 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);

		int n,i,x,sumz;
		int b[] = new int[100];

		i = 0;
		sumz = 0;
		do {
			x = in.nextInt();
			if (x != -99){
				b[i] = x;
				if (x == 0){
					sumz++;
				}
				i++;
			}
		} while (x != -99);
		n = i;
		if (n > 0){
			for (i=0;i<n;i++){
				if (i < (n-1)){
					System.out.print(b[i]+" ");
				}else{
					System.out.println(b[i]);
				}
			}
			System.out.println(sumz);
		}else{
			System.out.println("tidak ada bilangan input");
		}
	}
}