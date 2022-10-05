package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar= new int[] {1,2,3,5,6,8,9,4};
		int aranacakSayi=13;
		boolean varMı=false;
		
		for(int i=0;i<sayilar.length;i++) {
			if(aranacakSayi==sayilar[i]) {
				varMı=true;
			}
		
		}
		if(varMı==true) {
			System.out.println("Aranan sayı vardır.");
		}
		else {
			System.out.println("Aranan sayı yoktur.");
		}
		}
	

	}


