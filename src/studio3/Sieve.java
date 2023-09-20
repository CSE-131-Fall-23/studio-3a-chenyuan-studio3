package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("n is : ");
		int n = in.nextInt();
		int array[] = new int [n];
        for (int a = 2; a < array.length; a++){
            array[a] = a;
            System.out.println(array[a]);
        }
        for (int b = 2; b < array.length; b++) {
        	for (int index = b; index < (array.length-2); index = index + b ) {
        		array[index] = 0;

        	}
        }


		

	}

}
