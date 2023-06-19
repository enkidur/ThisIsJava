package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	//여기서 예외 발생시 insufficientEx로 보내진다.
	public void withdraw(int money) throws InsufficientEx{
		if(balance < money) {
			throw new InsufficientEx("잔고부족 : "+(money-balance)+"모자람");
		}
		balance-= money;
		
	}

}
