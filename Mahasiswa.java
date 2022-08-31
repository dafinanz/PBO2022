package Praktikum1;

import Mahasiswa.Mahasiswa;

public class Mahasiswa {
	String NIM, Nama, JenisKelamin, Alamat;
	
	void isiData(String NIM, String Nama, String JenisKelamin, String Alamat) {
		this.NIM = NIM;
		this.Nama = Nama;
		this.JenisKelamin = JenisKelamin;
		this.Alamat = Alamat;
	}
	
	void printData() {
		System.out.println(this.NIM);
		System.out.println(this.Nama);
		System.out.println(this.JenisKelamin);
		System.out.println(this.Alamat);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa Dafina = new Mahasiswa();
		
		Dafina.isiData("M0521016", "Dafina Nazhifah", "Perempuan", "Karanganyar");
		Dafina.printData();
	}

}
