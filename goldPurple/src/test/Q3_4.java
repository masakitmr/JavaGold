package test;

public class Q3_4 {

	public static void main(String[] args) {
		try(Foo o1=new Foo();Bar o2=new Bar()){
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
	}
	static class Foo implements AutoCloseable{
		public void close() {
			System.out.println("D");
		}
	}
	static class Bar implements java.io.Closeable{
		public void close() {
			System.out.println("E");
			throw new RuntimeException();
		}
	}
}
