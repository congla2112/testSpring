package java5Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java5Spring.dao.NhanvienDAO;
import java5Spring.entities.Nhanvien;

@Service
@Transactional
public class NhanvienService {

	@Autowired
	private NhanvienDAO nhanvienDAO;

	public List<Nhanvien> listnhanvien() {
		return nhanvienDAO.listNhanvien();
	}

	public Nhanvien findNhanvien(String id) {
		return nhanvienDAO.findNv(id);
	}

	public void saveNhanvien(Nhanvien nhanvien) {
		nhanvienDAO.saveNv(nhanvien);
	}

	public void updateNhanvien(Nhanvien nhanvien) {
		nhanvienDAO.updateNv(nhanvien);
	}

	public void deleteNhanvien(Nhanvien nv) {
		nhanvienDAO.deleteNv(nv);
	}
	public boolean checklogin(String username,String password) {
		return nhanvienDAO.checkLogin(username, password);
	}
	

}
