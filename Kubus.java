package Praktikum1;

public class Kubus {
	int sisiKubus = 5;
	
	public Double hitungVolume() {
		Double volume = 0.0;
		volume = 1.0 * this.sisiKubus * this.sisiKubus * this.sisiKubus;
		return volume;
	}
	public int hitungLuasPermukaan() {
		int luasPermukaan = 0;
		luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
		return luasPermukaan;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kubus kubus = new Kubus();
		
		System.out.println("volume		: "+kubus.hitungVolume());
		System.out.println("luas permukaan	: "+kubus.hitungLuasPermukaan());
	}

}
