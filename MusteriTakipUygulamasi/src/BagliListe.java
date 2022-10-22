import java.util.Scanner;

public class BagliListe {

	Scanner scan = new Scanner(System.in);

	Node head = null;
	Node tail = null;

	int id;
	String ad, soyad, tel, adres, urun;

	void ekle() {

		Node eleman = new Node(id, ad, soyad, tel, adres, urun);

		System.out.println("Musterinin Bilgilerini Giriniz: ");
		System.out.println("Numarasi : ");
		id = scan.nextInt();
		scan.nextLine();
		System.out.println("ad       : ");
		ad = scan.nextLine();
		System.out.println("soyad    : ");
		soyad = scan.nextLine();
		System.out.println("adres    : ");
		adres = scan.nextLine();
		System.out.println("tel      : ");
		tel = scan.nextLine();
		System.out.println("urun     : ");
		urun = scan.nextLine();

		if (head == null) {

			head = eleman;
			tail = eleman;
			System.out.println("Ilk musteri kayit edildi.");

		} else {
			eleman.next = head;
			head.prev = eleman;
			head = eleman;
			System.out.println(id + " numalari m�steri kayit edildi.");
		}

	}

	void sil() {

		Node eleman = new Node(id, ad, soyad, tel, adres, urun);

		boolean sonuc = false;
		if (head == null) {
			System.out.println("Liste zaten bos.");
		} else {
			System.out.println("Silinecek m�sterinin numarasi : ");
			id = scan.nextInt();
			scan.nextLine();

			if (head.next == null && head.id == id) {

				head = null;
				tail = null;
				System.out.println(id + "numarali m�steri silindi");
				sonuc = true;

			} else if (head.next != null && head.id == id) {

				head = head.next;
				head.prev = null;
				System.out.println(id + "numarali m�steri silindi");
				sonuc = true;

			} else if (tail.id == id) {

				tail = tail.prev;
				tail.next = null;
				System.out.println(id + " numarali m�steri silindi");
				sonuc = true;
			}

			else {

				Node temp = head;
				while (temp != null) {

					if (temp.id == id) {

						temp.next.prev = temp.prev;
						temp.prev.next = temp.next;
						sonuc = true;
						break;

					}

					temp = temp.next;
				}

			}
			if (!sonuc)
				System.out.println(id + " numarali m�steri sistemde kayitli degil.");

		}

	}

	void guncelle() {

		Node eleman = new Node(id, ad, soyad, tel, adres, urun);

		boolean sonuc = false;
		if (head == null) {
			System.out.println("Liste zaten bos.");
		} else {
			System.out.println("G�ncellenecek m�sterinin numarasi : ");
			id = scan.nextInt();
			scan.nextLine();

			Node temp = head;
			while (temp != null) {

				if (temp.id == id) {

					System.out.println(id + "numarali m�steri bilgileri");
					System.out.println("ad       : " + temp.ad);
					System.out.println("soyad    : " + temp.soyad);
					System.out.println("telefon  : " + temp.tel);
					System.out.println("adres    : " + temp.adres);
					System.out.println("�r�n     : " + temp.urun);

					System.out.println("�r�n bilgisini g�ncelleyiniz :");
					temp.urun = scan.nextLine();
					System.out.println("�r�n bilgisi g�ncellendi.");

					sonuc = true;
					break;

				}

				temp = temp.next;
			}

		}
		if (!sonuc)
			System.out.println(id + " numarali m�steri sistemde kayitli degil.");

	}

	void musteriAra() {

		Node eleman = new Node(id, ad, soyad, tel, adres, urun);

		boolean sonuc = false;
		if (head == null) {
			System.out.println("Liste zaten bos.");
		} else {
			System.out.println("Aranacak m�sterinin numarasi : ");
			id = scan.nextInt();
			scan.nextLine();

			Node temp = head;
			while (temp != null) {

				if (temp.id == id) {

					System.out.println(id + "numarali m�steri bilgileri");
					System.out.println("ad       : " + temp.ad);
					System.out.println("soyad    : " + temp.soyad);
					System.out.println("telefon  : " + temp.tel);
					System.out.println("adres    : " + temp.adres);
					System.out.println("�r�n     : " + temp.urun);

					sonuc = true;
					break;

				}

				temp = temp.next;
			}

		}
		if (!sonuc)
			System.out.println(id + " numarali m�steri sistemde kayitli degil.");

	}

	void musteriYazdir() {

		
		
		if (head == null) {
			System.out.println("Liste zaten bos.");
		} 
		
		else {
			
			System.out.println("Numara\tAd\tSoyad\tTelefon\tAdres\t�r�n Ad�\n");

			Node temp = head;
			
			while (temp != null) {

				System.out.println(temp.id + "\t" +temp.ad +"\t" +temp.soyad +
						"\t" + temp.tel +"\t" + temp.adres +"\t" +temp.urun);
				

				temp = temp.next;
			}

		}
		

	}




}
