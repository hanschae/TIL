package basic07_thread;

public class SynchronizerTest {

	public static void main(String[] args) {
		ATM atm = new ATM();
		
		Thread mother = new Thread(atm, "mother");
		Thread son = new Thread(atm, "son");
		
		mother.start();
		son.start();
	}

}

class ATM implements Runnable{
	private int money = 10000;
	// 스레드 메소드 동기화 : synchronized
	//public synchronized void run() { // 1번방법
	public void run() {
		synchronized (this) { // 2번방법
			for(int i=1; i<=7; i++) {
				try {Thread.sleep(100);}catch(Exception e) {}
					getCash(1000);
			}
		}
	}
	public void getCash(int howMuch) {
		if(money>0) {
			money -= howMuch;
			//										현재실행중인 스레드 객체의 스레드명
			System.out.printf("%s-> 잔액은%d원입니다.\n", Thread.currentThread().getName(), getMoney());
			
		}else {
			//스레드 중단
			try {
				this.wait(); // 현재 실행중인 스레드 중지
			}catch(Exception e) {}
			System.out.println("잔액이 부족합니다");
		}
	}
	
	
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}