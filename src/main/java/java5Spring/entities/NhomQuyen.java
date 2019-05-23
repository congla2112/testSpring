package java5Spring.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class NhomQuyen {

	@Id
	private String MaNhomQuyen;
	private String TenNhomQuyen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhomquyen")
	private Set<Nhanvien> listNhanvien = new HashSet<Nhanvien>();

	public NhomQuyen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhomQuyen(String maNhomQuyen, String tenNhomQuyen, Set<Nhanvien> listNhanvien) {
		super();
		MaNhomQuyen = maNhomQuyen;
		TenNhomQuyen = tenNhomQuyen;
		this.listNhanvien = listNhanvien;
	}

	public String getMaNhomQuyen() {
		return MaNhomQuyen;
	}

	public void setMaNhomQuyen(String maNhomQuyen) {
		MaNhomQuyen = maNhomQuyen;
	}

	public String getTenNhomQuyen() {
		return TenNhomQuyen;
	}

	public void setTenNhomQuyen(String tenNhomQuyen) {
		TenNhomQuyen = tenNhomQuyen;
	}

	public Set<Nhanvien> getListNhanvien() {
		return listNhanvien;
	}

	public void setListNhanvien(Set<Nhanvien> listNhanvien) {
		this.listNhanvien = listNhanvien;
	}

	@Override
	public String toString() {
		return "NhomQuyen [MaNhomQuyen=" + MaNhomQuyen + ", TenNhomQuyen=" + TenNhomQuyen + ", listNhanvien="
				+ listNhanvien + "]";
	}

}
