package test_format;

public class Main {

	public static void main(String[] args) {
		/*
		 * long hardToRead = 1000000000L; long easierToRead = 1_000_000_000L; long
		 * legalButSilly = 10_0000_0000L;
		 */
		
		long myBillon = 1_000_000_000L;
		String s = String.format("%,d", myBillon);
		System.out.println(s);
		System.out.printf("%,d\n", 1_000_000_000L);
		s = String.format("I have %,.2f bugs to fix", 476578.09876);
		System.out.println(s);
		s = String.format("%,6.1f", 42.000f);
		System.out.println(s);
		s = String.format("%d", 42);
		System.out.println(s);
		s = String.format("%.3f", 42.000f);
		System.out.println(s);
		s = String.format("%X", 42);
		System.out.println(s);
		s = String.format("%c", 42);
		System.out.println(s);
		
		int one = 20456654;
		double two = 100567890.248907D;
		s = String.format("The rank is %,d out of %,2f", one, two);
		System.out.println(s);
	}
}
