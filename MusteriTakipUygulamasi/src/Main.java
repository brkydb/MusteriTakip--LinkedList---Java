import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		BagliListe liste = new BagliListe();
		
		
		int secim =-1;
		while (secim != 0) {
			
			System.out.println(" 1 - Ekle");
			System.out.println(" 2 - Sil");
			System.out.println(" 3 - Guncelle");
			System.out.println(" 4 - Musteri Ara ");
			System.out.println(" 5 - Yazdir");
			System.out.println(" 0 - cikis");
			System.out.println("Seçiminiz:");
			secim = scan.nextInt();
			scan.nextLine();

			switch (secim) {
			case 1: liste.ekle(); break;
			case 2: liste.sil(); break;
			case 3: liste.guncelle(); break;
			case 4: liste.musteriAra(); break;
			case 5: liste.musteriYazdir(); break;
			case 0: System.out.println("Çýkýþ yaptiniz"); break;
			default : System.out.println("Hatali secim yaptiniz."); break;

			
			}
		}
		
	}

}
