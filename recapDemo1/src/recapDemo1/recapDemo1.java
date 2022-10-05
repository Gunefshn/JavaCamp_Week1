package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		int sayi1=54;
		int sayi2=28;
		int sayi3=13;
		int enBuyuk=sayi1;
		
		if(sayi2>enBuyuk) {
			enBuyuk=sayi2;
			System.out.println("En büyük sayi:"+enBuyuk);
		}
		else if(sayi3>enBuyuk) {
			enBuyuk=sayi3;
			System.out.println("En büyük sayi:"+enBuyuk);
		}
		else {
			//En büyük sayinin sayi1 olması durumu
			System.out.println("En büyük sayi:"+enBuyuk);
		}
	}

}
