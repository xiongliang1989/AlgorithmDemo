public class Demo {

	public static void main(String[] args) {
		System.out.println("hello");
		recurse();
	}
	
	public static void recurse() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}

}
