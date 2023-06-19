package ch11.sec06;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		
		try {
			//30000만 출금.
			account.withdraw(30000);
		}catch (InsufficientEx e) {
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
