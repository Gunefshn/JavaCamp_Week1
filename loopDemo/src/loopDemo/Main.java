package loopDemo;

public class Main {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println(" For Döngüsü bitti");
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti");
		
		int j=1;
		do {
			System.out.println(j);
			j+=3;
		}while(j<10);
		System.out.println("Do While Döngüsü bitti");
	}

}
