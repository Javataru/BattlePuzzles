class StaticSuper {
	static {
		System.out.println("Super Static Block Bros");
	}
	StaticSuper() {
		System.out.println("Super Constructor Clint");
	}
}

public class StaticTests extends StaticSuper {
	static int rand;
	static {
		rand = (int) (Math.random() * 6);
		System.out.println("Static Block Statistics " + rand);
	}
StaticTests() {
	System.out.println("Constructor Jones");
}
	public static void main(String[] args) {
		System.out.println("In Main Bros");
		StaticTests st = new StaticTests ();

	}

}
