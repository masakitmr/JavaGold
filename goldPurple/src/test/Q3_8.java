package test;

public class Q3_8 {

	public static void main(String[] args) throws Foo{
		try {
			throw new Foo();
		}catch(Foo  | RuntimeException e) {
//			e=new Ecxeption();
//			e=new RuntimeExeption();
//			e=new Foo();
//			e=new Bar();
			throw e;
		}
	}
	static class Foo extends Exception{}
	static class Bar extends Foo{}
}
