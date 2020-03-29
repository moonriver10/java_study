package Calculator;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator); //공유객체 설정 
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator); //공유객체 설정 
		user2.start();
		
		//user1이 2초간 정지할동안 user2가 memory 필드값 50으로 변경 
	}

}
