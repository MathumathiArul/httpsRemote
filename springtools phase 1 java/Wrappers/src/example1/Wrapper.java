package example1;

public class Wrapper {

	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = new Integer(10);
		System.out.println("i1" + i1 + " hashcode" + i1.hashCode() + "memory " + System.identityHashCode(i1));
		System.out.println("i1" + i2 + " hashcode" + i2.hashCode() + "memory " + System.identityHashCode(i2));
		System.out.println("i1" + i3 + " hashcode" + i3.hashCode() + "memory " + System.identityHashCode(i3));
		System.out.println();
		Integer i5=1000;
		System.out.println("compare to 100 = "+i5.compareTo(1));
		
		
		Integer i4=7;
		int x=i4;
		System.out.println(" x value is " + x);
		Float f=26f;
		float ff=f;
		System.out.println("the f is " + f);
	}

}
