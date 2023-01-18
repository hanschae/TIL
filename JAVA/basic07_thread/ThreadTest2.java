package basic07_thread;
// Runnable 클래스를 이용한 스레드 구현
// Runnable 인터페이스를 상속받고 스레드 처리가 필요한 run()에 오버라이딩하면
// 자바가상머신의 스레드스케쥴러가 실행을 관리한다
public class ThreadTest2 extends Thread{
	String threadName;
	public ThreadTest2() {
		
	}
	public ThreadTest2(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i=1; ;i++) {
			System.out.println(threadName+"->"+i);
			try {
			Thread.sleep(1000); // 지정한 밀리초만큼
			}catch(InterruptedException ie) {}
			
		}
	}
	public static void main(String[] args) {
		ThreadTest2 t1 = new ThreadTest2("first번째 스레드");
		ThreadTest2 t2 = new ThreadTest2("second번째 스레드");
		
		// 인터페이스를 상속받으면 추상메소드이기 때문에 Thread객체로 만든다
		Thread obj1 = new Thread(t1);
		Thread obj2 = new Thread(t2);
		
		obj1.start();
		obj2.start();
		
	}

}
