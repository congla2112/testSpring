package java5Spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Nhanvien {

	@Id
	private String MaNV;
	private String Tennv;
	private String Sodienthoai;
	private String DiaChi;
	private boolean Gioitinh;
	private String Email;
	private String UserName;
	private String PassWord;

	@ManyToOne
	@JoinColumn(name = "MaNhomQuyen", nullable = false)
	private NhomQuyen nhomquyen;

	public Nhanvien() {
		
	}

	public Nhanvien(String maNV, String tennv, String sodienthoai, String diaChi, boolean gioitinh, String email,
			String userName, String passWord, NhomQuyen nhomquyen) {
		super();
		MaNV = maNV;
		Tennv = tennv;
		Sodienthoai = sodienthoai;
		DiaChi = diaChi;
		Gioitinh = gioitinh;
		Email = email;
		UserName = userName;
		PassWord = passWord;
		this.nhomquyen = nhomquyen;
	}

	public String getMaNV() {
		return MaNV;
	}

	public void setMaNV(String maNV) {
		MaNV = maNV;
	}

	public String getTennv() {
		return Tennv;
	}

	public void setTennv(String tennv) {
		Tennv = tennv;
	}

	public String getSodienthoai() {
		return Sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		Sodienthoai = sodienthoai;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public boolean isGioitinh() {
		return Gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		Gioitinh = gioitinh;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassWord() {
		return PassWord;
	}

	public void setPassWord(String passWord) {
		PassWord = passWord;
	}

	public NhomQuyen getNhomquyen() {
		return nhomquyen;
	}

	public void setNhomquyen(NhomQuyen nhomquyen) {
		this.nhomquyen = nhomquyen;
	}

	@Override
	public String toString() {
		return "Nhanvien [MaNV=" + MaNV + ", Tennv=" + Tennv + ", Sodienthoai=" + Sodienthoai + ", DiaChi=" + DiaChi
				+ ", Gioitinh=" + Gioitinh + ", Email=" + Email + ", UserName=" + UserName + ", PassWord=" + PassWord
				+ ", nhomquyen=" + nhomquyen + "]";
	}

}
