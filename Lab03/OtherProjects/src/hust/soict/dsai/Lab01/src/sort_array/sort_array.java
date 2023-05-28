package sort_array;
import java.util.Scanner;
import java.util.Arrays;
public class sort_array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length of array:");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element " + (i+1) + ": ");	
			array[i] = input.nextInt();		
		}
		Arrays.sort(array);
		System.out.print(Arrays.toString(array));
	}
}