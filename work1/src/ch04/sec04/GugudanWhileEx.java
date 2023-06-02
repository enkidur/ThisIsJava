package ch04.sec04;

public class GugudanWhileEx {
	public static void main(String[] args) {
		int i =1, j=1;
		while(i<=9){
			j=1;
			while(j<=9){		
				System.out.println(i+"*"+j+"="+i*j);
				j++;
				}
			System.out.println("----------------");
			i++;
			}
		}
	}
