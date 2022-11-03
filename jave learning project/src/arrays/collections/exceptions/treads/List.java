package arrays.collections.exceptions.treads;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList = getNEvenNums(10);
		print(arrayList);
	}

	private static void print(ArrayList arrayList) {
		System.out.println(arrayList);
	}

	private static ArrayList getNEvenNums(int n) {
		ArrayList result = new ArrayList();
		for (int count = 0, i = 0; count < n; i++) {
			if (isEven(i)) {
				result.add(i);
				count++;
			}

		}
		return result;
	}

	private static boolean isEven(int i) {
		return (i % 2 == 0);
	}
}
