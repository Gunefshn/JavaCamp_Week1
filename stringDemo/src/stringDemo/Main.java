package stringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		/*
		System.out.println(mesaj);
		System.out.println("Karakter sayısı "+mesaj.length());
		System.out.println("5.eleman "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		//B ile başlıyor ise true döner.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("D"));
		
		char[] karakterler=new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		//Karakterin kaçıncı karakteri a 
		System.out.println(mesaj.indexOf("va"));
		System.out.println(mesaj.lastIndexOf("va"));
		*/
		String yeniMesaj=mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		//Belirtilen indexten itibaren bölme işlemi yapmak için
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
