package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n is : ");
		int n = in.nextInt();
		int array[] = new int [n+1];
        for (int a = 2; a < array.length; a++){
            array[a] = a;
            System.out.println(array[a]);
        }
        for (int b = 2; b < array.length; b++) {
        	for (int index = b+b; index < (array.length-1); index = index + b ) {
        		array[index] = 0;
        	}
        	for (int i = 0; i < array.length; i ++) {
        		System.out.print(array[i]+" ");
        	}
        	System.out.println();
        }


		

	}

}
