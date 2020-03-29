package thread;

import java.awt.Toolkit;

//Thread의 하위클래스로 작업 스레드 정의 
public class BeepThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//스레드 실행 내용 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("작업 스레드 beep!");
			try {
				Thread.sleep(1000);
			}catch(Exception e){
				
			}
		}
	}
	
	
}
