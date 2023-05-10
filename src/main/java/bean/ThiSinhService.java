package bean;

import java.util.ArrayList;
import java.util.List;

public class ThiSinhService {
	List<ThiSinh> listThiSinh;
	
	public ThiSinhService() {
		this.listThiSinh = new ArrayList<ThiSinh>();
	}
	
	public ThiSinhService(List<ThiSinh> danhSachThiSinh) {
		this.listThiSinh = danhSachThiSinh;
	}
	
	public List<ThiSinh> getDanhSachThiSinh(){
		return this.listThiSinh;
	}
	
	public void add(ThiSinh thiSinh) {
		if(thiSinh == null) {
			throw new IllegalArgumentException("Thi sinh khong duoc de trong !!!");
		}else {
			this.listThiSinh.add(thiSinh);
		}
	}
	
	public void xoaThiSinh(String soBaoDanh) {
		int index = 0;
		for (ThiSinh thiSinh : listThiSinh) {
			if(thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
				this.listThiSinh.remove(index);
				return;
			}
			index ++;
		}
		throw new IllegalArgumentException("Thi sinh can xoa khong ton tai!!!");
	}
	
	public void capNhatThiSinh(ThiSinh capnhatthisinh ) {
		for (ThiSinh thiSinh : listThiSinh) {
			if(thiSinh.getSoBaoDanh().equals(capnhatthisinh)) {
				thiSinh.setHoTen(capnhatthisinh.getHoTen());
				thiSinh.setGioiTinh(capnhatthisinh.getGioiTinh());
				thiSinh.setNamSinh(capnhatthisinh.getNamSinh());
				thiSinh.setQueQuan(capnhatthisinh.getQueQuan());
				thiSinh.setDiemThi(capnhatthisinh.getDiemThi());
				thiSinh.setDiemUuTien(capnhatthisinh.getDiemUuTien());
				return;
			}
		}
		throw new IllegalArgumentException("Thi Sinh khong ton tai, can kiem tra lai!!");
	}
	
	public void xuatThiSinhTheoSoBaoDanh(String soBaoDanh) {
		for (ThiSinh thiSinh : listThiSinh) {
			if(thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
				System.out.println(thiSinh.toString());
			}
			return;
		}
		throw new IllegalArgumentException("Thi sinh khong ton tai, can kiem tra lai!!");
	}
	
	public void xuatDanhSachThiSinh() {
		for (ThiSinh thiSinh : listThiSinh) {
			System.out.println(thiSinh.toString());
		}
	}
}
