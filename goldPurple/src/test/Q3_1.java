package test;

public class Q3_1 implements AutoCloseable{

	public static void main(String[] args){
		try(Q3_1 obj =new Q3_1()) {
			System.out.println("x");
		}catch(Exception e) {
			System.out.println("問題なし");
		}
	}
	public void close() throws Exception{
		throw new Exception("y");
	}
}
