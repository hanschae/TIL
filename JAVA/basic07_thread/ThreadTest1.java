package basic07_thread;
// Thread 클래스를 이용한 스레드 구현
// Thread 클래스를 상속받고 스레드 처리가 필요한 run()에 오버라이딩하면
// 자바가상머신의 스레드스케쥴러가 실행을 관리한다
public class ThreadTest1 extends Thread{
	String threadName;
	public ThreadTest1() {
		
	}
	public ThreadTest1(String threadName) {
		this.threadName = threadName;
	}

	public void run() {
		for(int i=1; ;i++) {
			System.out.println(threadName+"->"+i);
		}
	}
	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1("첫번째 스레드");
		ThreadTest1 t2 = new ThreadTest1("두번째 스레드");
		
		//t1.thread_method();
		//t2.thread_method();
		
		//run()메소드는 start()메소드를 이용하여 호출가능하다
		t1.start();
		t2.start();
		
	}

}
