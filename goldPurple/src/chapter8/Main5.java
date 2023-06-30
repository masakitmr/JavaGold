package chapter8;

public class Main5 {

	public static void main(String[] args) {
		Share share=new Share();
		ThreadA3 threadA=new ThreadA3(share);
		ThreadB3 threadB=new ThreadB3(share);
		threadA.start(); threadB.start();
	}
}
class Share{
	private int a=0;
	private String b;
	public synchronized void  set() {
		while(a!=0) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		notify();
		a++; b="data";
		System.out.println("set() a : "+a+" b : "+b);
	}
	public synchronized void print() {
		while(b==null) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		notify();
		a--; b=null;
		System.out.println("print() a : "+a+" b :"+b);
	}
}
class  ThreadA3 extends Thread{
	private Share share;
	public  ThreadA3(Share share) {
		this.share=share;
	}
	public  void run() {
		for(int i=0;i<5;i++) {
			share.set();
		}
	}
}
class ThreadB3 extends Thread{
	private Share share;
	public ThreadB3(Share share) {
		this.share=share;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			share.print();
		}
	}
}