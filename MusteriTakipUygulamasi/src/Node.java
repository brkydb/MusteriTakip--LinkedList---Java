
public class Node {
	
	int id;
	String ad, soyad, tel, adres, urun;
	
	Node next;
	Node prev;
	
	
	public Node(int id, String ad, String soyad, String tel, String adres, String urun) {
		
		
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.tel = tel;
		this.adres = adres;
		this.urun = urun;
		
		next = null;
		prev = null;
	}
	
	
	

}
