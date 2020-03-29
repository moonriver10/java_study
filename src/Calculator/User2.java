package 공유객체;

public class User2 extends Thread {

	Calculator calculator = new Calculator();
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator; //공유객체인 Calculator을 필드에 저장 
	}
	
	public void run() {
		calculator.setMemory(50); //공유객체인 Calculator의 메모리에 50 저장 
		
	}

}
