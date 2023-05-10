package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.GiamThi;
import bean.GiamThiService;
import bean.NguyenVong;
import bean.ThiSinh;
import bean.ThiSinhService;

public class main {
	/**
	 * @param main
	 */
	public static void main (String[] main) {
		Scanner sc = new Scanner(System.in);
		ThiSinhService danhSachThiSinh = new ThiSinhService();
		GiamThiService danhSachGiamthi = new GiamThiService();
		List<ThiSinhService> danhSachTrungTuyen = new ArrayList<ThiSinhService>();
		
		GiamThi giamThi1 = new GiamThi("TA01","Đại Học NTT10", "Trương Thanh Toàn",0 , 1995, "TP HCM");
		GiamThi giamThi2 = new GiamThi("TA02","Đại Học FPT", "Lương Vũ Hảo",1 , 1997, "TP Đà Nẳng");
		GiamThi giamThi3 = new GiamThi("TA03","Đại Học UEH", "Trương Thi Cẩm Tú",1 , 1990, "TP Cần Thơ");
		GiamThi giamThi4 = new GiamThi("TA04","Đại Học UFN", "Phan Quốc Thái",0 , 1989, "TP HCM");
		GiamThi giamThi5 = new GiamThi("TA05","Đại Học UEE", "Nguyễn Thái Học",1 , 1992, "TP Biên Hòa");
		
		danhSachGiamthi.add(giamThi1);
		danhSachGiamthi.add(giamThi2);
		danhSachGiamthi.add(giamThi3);
		danhSachGiamthi.add(giamThi4);
		danhSachGiamthi.add(giamThi5);
		
		NguyenVong nguyenVong1 = new NguyenVong("HA", "QHQT", "FPT","A" , 12.5);
		NguyenVong nguyenVong2 = new NguyenVong("HU", "KDQT", "NTT","B" , 16.5);
		NguyenVong nguyenVong3 = new NguyenVong("HF", "GDTC", "FPT","A" , 17.5);
		NguyenVong nguyenVong4 = new NguyenVong("EF", "TA", "UEH","B" , 14.5);
		NguyenVong nguyenVong5 = new NguyenVong("RA", "CNTT", "UFR","A" , 12.5);
		
		ThiSinh thiSinh1 = new ThiSinh("PS21", "Nguyễn Văn A", 1, 2005, "Bến Tre", 15.4, 1.2, nguyenVong1);
		ThiSinh thiSinh2 = new ThiSinh("PS22", "Nguyễn Văn B", 0, 2005, "Bình Định", 15.4, 1.2, nguyenVong2);
		ThiSinh thiSinh3 = new ThiSinh("PS23", "Nguyễn Văn C", 1, 2005, "Gia Lai", 15.4, 1.2, nguyenVong3);
		ThiSinh thiSinh4 = new ThiSinh("PS24", "Nguyễn Văn D", 0, 2005, "Vĩnh Long", 15.4, 1.2, nguyenVong4);
		ThiSinh thiSinh5 = new ThiSinh("PS25", "Nguyễn Văn E", 1, 2005, "Cần Thơ", 15.4, 1.2, nguyenVong5);
		
		danhSachThiSinh.add(thiSinh5);
		danhSachThiSinh.add(thiSinh4);
		danhSachThiSinh.add(thiSinh3);
		danhSachThiSinh.add(thiSinh2);
		danhSachThiSinh.add(thiSinh1);
		
		int luaChon;
		do {
			menu();
			System.out.println("Mời chọn");
			luaChon = sc.nextInt();
			sc.nextLine();
			switch (luaChon) {
			case 1: 
				   ThiSinh nhapthisinh = new ThiSinh();
				   System.out.println("Nhập số báo danh: ");
				   nhapthisinh.setSoBaoDanh(sc.nextLine());
				   System.out.println("Nhập họ tên: ");
				   nhapthisinh.setHoTen(sc.nextLine());
				   System.out.println("Nhập giới tính: ");
				   nhapthisinh.setGioiTinh(sc.nextInt());
				   System.out.println("Nhập năm sinh: ");
				   nhapthisinh.setNamSinh(sc.nextInt());
				   System.out.println("Nhập quê quán: ");
				   nhapthisinh.setQueQuan(sc.nextLine());
				   sc.nextLine();
				   System.out.println("Nhập điểm thi: ");
				   nhapthisinh.setDiemThi(sc.nextDouble());
				   danhSachThiSinh.add(nhapthisinh);
				   break;
			case 2:
				   GiamThi nhapGiamThi = new GiamThi();
				   System.out.println("Nhập mã giám thị: ");
				   nhapGiamThi.setMaGiamThi(sc.nextLine());
				   System.out.println("Nhập đơn vị công tác: ");
				   nhapGiamThi.setDonViCongTac(sc.nextLine());
				   System.out.println("Nhập họ tên: ");
				   nhapGiamThi.setHoTen(sc.nextLine());
				   System.out.println("Nhập giới tính: ");
				   nhapGiamThi.setGioiTinh(sc.nextInt());
				   System.out.println("Nhập năm sinh: ");
				   nhapGiamThi.setNamSinh(sc.nextInt());
				   System.out.println("Nhập quê quán: ");
				   nhapGiamThi.setQueQuan(sc.nextLine());
				   danhSachGiamthi.add(nhapGiamThi);
				   break;
			case 3:
				   ThiSinh capNhapThiSinh = new ThiSinh() ;
				   System.out.println("Nhập số báo danh thí sinh muốn cập nhật: ");
				   capNhapThiSinh.setSoBaoDanh(sc.nextLine());
				   System.out.println("Nhập họ tên thí sinh: ");
				   capNhapThiSinh.setHoTen(sc.nextLine());
				   System.out.println("Nhập giới tính thí sinh: ");
				   capNhapThiSinh.setGioiTinh(sc.nextInt());
				   System.out.println("Nhập năm sinh thí sinh: ");
				   capNhapThiSinh.setNamSinh(sc.nextInt());
				   System.out.println("Nhập quê quán thí sinh: ");
				   capNhapThiSinh.setQueQuan(sc.nextLine());
				   System.out.println("Nhập điểm thi thí sinh: ");
				   capNhapThiSinh.setDiemThi(sc.nextDouble());
				   System.out.println("Nhập điểm ưu tiên thí sinh: ");
				   capNhapThiSinh.setDiemUuTien(sc.nextDouble());
				   danhSachThiSinh.capNhatThiSinh(capNhapThiSinh);
				   break;
			case 4:
					GiamThi capNhatGiamThi = new GiamThi();
					System.out.println("Nhập mã giám thị: ");
					capNhatGiamThi.setMaGiamThi(sc.nextLine());
					System.out.println("Nhập đơn vị công tác: ");
					capNhatGiamThi.setDonViCongTac(sc.nextLine());
					System.out.println("Nhập họ tên: ");
					capNhatGiamThi.setHoTen(sc.nextLine());
					System.out.println("Nhập giới tinh: ");
					capNhatGiamThi.setGioiTinh(sc.nextInt());
					System.out.println("Nhập năm sinh: ");
					capNhatGiamThi.setNamSinh(sc.nextInt());
					System.out.println("Nhập quê quán: ");
					capNhatGiamThi.setQueQuan(sc.nextLine());
					danhSachGiamthi.capNhatGiamThi(capNhatGiamThi);
					break;
			case 5: 
					System.out.println("Nhập số báo danh thí sinh muốn xóa: ");
					String soBaoDanhMuonXoa = sc.nextLine();
					danhSachThiSinh.xoaThiSinh(soBaoDanhMuonXoa);
					break;
			case 6:
					System.out.println("Nhập mã giám thị muốn xóa: ");
					String maGiamThiMuonXoa = sc.nextLine();
					danhSachGiamthi.xoaGiamThi(maGiamThiMuonXoa);
					break;
			case 7:
					System.out.println("Danh sách thí sinh");
					danhSachThiSinh.xuatDanhSachThiSinh();
					break;
			case 8:
					System.out.println("Nhập số báo danh thí sinh muốn tìm");
					String soBaoDanh = sc.nextLine();
					danhSachThiSinh.xuatThiSinhTheoSoBaoDanh(soBaoDanh);
					break;
			case 9: 
					System.out.println("Danh sách giám thị");
					danhSachGiamthi.xuatdanhsachgiamthi();
					break;
			case 10: 
					System.out.println("Danh sách giám thị có quê quán là TP HCM");
					danhSachGiamthi.xuatdanhsachgiamthitheoquequan("TP HCM");
					break;					
			default:
				break;
			}
		} while(luaChon != 0);
	}
	
	public static void menu() {
			System.out.println("=================MENU================");
			System.out.println("1.Nhập thông tin thí sinh");
			System.out.println("2.Nhập thông tin giám thị");
			System.out.println("3.Nhập thông tin thí sinh cần cập nhật");
			System.out.println("4.Nhập thông tin giám thị cần cập nhật");
			System.out.println("5.Nhập số báo danh cần xóa");
			System.out.println("6.Nhập mã giám thị cần xóa");
			System.out.println("7.Xuất danh sách thí sinh");
			System.out.println("8.Xuất danh sách thí sinh theo số báo danh");
			System.out.println("9.Xuất danh sách giám thị");
			System.out.println("10.Xuất danh sách giám thị theo quê quán là TP HCM");		
			System.out.println("0.Thoát chương trình");
	}
}






















