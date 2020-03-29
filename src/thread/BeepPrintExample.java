package thread;

public class BeepPrintExample {
	
	public static void main(String[] args) {
		Thread beepThread = new BeepThread(); //작업 스레드 생성 
		beepThread.start(); //BeepThread의 run 메소드 실행 
		
		for(int i=0;i<5;i++) {
			Thread mainThreadName= Thread.currentThread();
			System.out.println(mainThreadName+"beep!");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
		
	}

}
