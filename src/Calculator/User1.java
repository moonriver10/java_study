package Calculator;

public class User1 extends Thread {

	Calculator calculator = new Calculator();
	
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator; //공유객체인 Calculator을 필드에 저장 
	}
	
	public void run() {
		calculator.setMemory(100);//공유객체인 Calculator의 메모리에 100 저장 
		
		
	}

}
