package chapter8;

public class Main1 {

	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		a.start();
		b.start();
	}
}
class ThreadA extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print("A:"+i+" ");
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.print("B:"+i+" ");
		}
	}
}