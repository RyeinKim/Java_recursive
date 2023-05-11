package java_recursive;

public class Main {
	/*		ÆÑÅä¸®¾ó Àç±ÍÇÔ¼ö
	static int f(int num) {
		if (num == 1)
			return 1;
		return num*f(num-1);
	}
	*/
	
	static int f(int num) {
		// f(0) = 0, f(1) = 1
		// f(n) = f(n-1) + f(n-2)
		if (num == 0) return 0;
		else if (num == 1) return 1;
		return f(num-1) + f(num-2);
	}
	
	public static void main(String[] args) {
		System.out.print(f(10));
	}
}


