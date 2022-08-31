package Praktikum1;

public class SegiTiga {
	int alas = 3;
	int tinggi = 4;
	int sisiMiring = 5;
	
	public Double hitungLuas() {
		Double luas = 0.5 * this.alas * this.tinggi;
		return luas;
	}
	
	public Double hitungKeliling() {
		Double keliling = 1.0 * this.alas + this.tinggi + this.sisiMiring;
		return keliling;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SegiTiga SegiTiga = new SegiTiga();
		System.out.println("alas : "+SegiTiga.alas);
		System.out.println("tinggi : "+SegiTiga.tinggi);
		System.out.println("sisi miring : "+SegiTiga.sisiMiring);
		System.out.println("luas : "+SegiTiga.hitungLuas());
		System.out.println("keliling : "+SegiTiga.hitungKeliling());
	}

}
