package bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThiSinh {
	private String soBaoDanh;
	private String hoTen;
	private int gioiTinh;
	private int namSinh;
	private String queQuan;
	private Double diemThi;
	private Double diemUuTien;
	private NguyenVong nv;
	
	public ThiSinh() {
		super();
	}

	public ThiSinh(String soBaoDanh, String hoTen, int gioiTinh, int namSinh, String queQuan, Double diemThi,
			Double diemUuTien, NguyenVong nv) {
		super();
		this.soBaoDanh = soBaoDanh;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
		this.diemThi = diemThi;
		this.diemUuTien = diemUuTien;
		this.nv = nv;
	}



	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public Double getDiemThi() {
		return diemThi;
	}

	public void setDiemThi(Double diemThi) {
		this.diemThi = diemThi;
	}

	public Double getDiemUuTien() {
		return diemUuTien;
	}

	public void setDiemUuTien(Double diemUuTien) {
		this.diemUuTien = diemUuTien;
	}


	public NguyenVong getNv() {
		return nv;
	}

	public void setNv(NguyenVong nv) {
		this.nv = nv;
	}

	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", gioiTinh=" + gioiTinh + ", namSinh="
				+ namSinh + ", queQuan=" + queQuan + ", diemThi=" + diemThi + ", diemUuTien=" + diemUuTien
				+ ", danhSachNguyenVong=" + nv + "]";
	}
	
	
	
}
