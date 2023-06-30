package chapter8;

public class Main4 {

	public static void main(String[] args) {
		Thread threadA=new Thread(() ->{
			System.out.println("threadA : sleep開始");
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("threadA : 割り込みをキャッチしました");
			}
			System.out.println("threadA : 処理再開");
		});
		threadA.start();

		try {
			System.out.println("main : sleep 開始");
			Thread.sleep(2000);
			System.out.println("main : sleep 終了");
			threadA.interrupt();
		}catch(InterruptedException e) {
			System.out.println("main : 割り込みをキャッチしました");
		}
	}

}
