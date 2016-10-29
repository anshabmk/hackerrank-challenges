import java.io.*;
import java.util.*;

public class bitwiseAND {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t;
		do {

			t = scan.nextInt();

		} while(t<1 && t>1000);

		int[] arrayN = new int[t];
		int[] arrayK = new int[t];

		for (int i=0;i<t;i++) {
			
			do {

			arrayN[i] = scan.nextInt();

			} while(arrayN[i]<2 && arrayN[i]>1000);

			do {

			arrayK[i] = scan.nextInt();

			} while(arrayK[i]<2 && arrayK[i]>arrayN[i]);	
			
		}

		int maxOfN = 2;
		for (int i=0;i<arrayN.length;i++) {
			
			if(arrayN[i]>maxOfN)
				maxOfN = arrayN[i];
		}
		
		int[] S = new int[maxOfN];
		String binaryString;
		for (int i=0;i<S.length;i++) {
			
			S[i] = i+1;
			System.out.println("S["+i+"]="+S[i]);
		}

		//Output portion
		int max,andOp=0;
		for (int i=0;i<t;i++) {
			
			max = 0;
			for (int j=0;j<arrayN[i];j++) {
				
				for (int k=1;k<arrayN[i];k++) {
					
					if (S[j]<S[k])
						andOp = S[j] & S[k];
						if ( andOp>max && andOp<arrayK[i])
							max = andOp;

				}
			}
			
			System.out.println(max);
		}
	}
}
