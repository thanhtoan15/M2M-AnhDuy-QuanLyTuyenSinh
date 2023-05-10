package bean;

import java.util.ArrayList;
import java.util.List;



public class GiamThiService {
	List<GiamThi> listGiamThi ;
	
	public   GiamThiService() {
		this.listGiamThi = new ArrayList<GiamThi>();
	}
	
	public void add(GiamThi giamThi) {
		if(giamThi == null ) {
			throw new IllegalArgumentException("Giam thi khong duoc de trong !!!");
		}
			this.listGiamThi.add(giamThi);
		
	}
	
	public void xoaGiamThi(String maGiamThi) {
		int index = 0;
		for (GiamThi giamThi : listGiamThi) {
			if(giamThi.getMaGiamThi().equals(maGiamThi)) {
				this.listGiamThi.remove(index);
				return; // chưa rõ
			}
			index++; // chưa rõ
		}
		throw new IllegalArgumentException("Giam thi khong ton tai, can kiem tra lai!!!");
	}
	
	public void capNhatGiamThi(GiamThi capnhatgiamThi) {
		for (GiamThi giamThi : listGiamThi) {
			if(giamThi.getMaGiamThi().equals(capnhatgiamThi)) {
				giamThi.setDonViCongTac(capnhatgiamThi.getDonViCongTac());
				giamThi.setHoTen(capnhatgiamThi.getHoTen());
				giamThi.setGioiTinh(capnhatgiamThi.getGioiTinh());
				giamThi.setNamSinh(capnhatgiamThi.getNamSinh());
				giamThi.setQueQuan(capnhatgiamThi.getQueQuan());
				return; // chưa rõ
			}
		}
		throw new IllegalArgumentException("Giam thi khong ton tai, can kiem tra lai!!");
	}
	public void xuatdanhsachgiamthi() {
		for (GiamThi giamThi : listGiamThi) {   // chưa rõ giá trị GiamThi
			System.out.println(giamThi.toString());
		}
	}
	
	public void xuatdanhsachgiamthitheoquequan(String quequan) {
		for (GiamThi giamThi : listGiamThi) {
			if(giamThi.getQueQuan().equals(quequan)) {
				System.out.println(giamThi.toString());
			}
			return ;
		}
		throw new IllegalArgumentException("Giam thi khong ton tai, can kiem tra lai!!");
	}
	
}
