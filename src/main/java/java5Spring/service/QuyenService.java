package java5Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java5Spring.dao.QuyenDAO;
import java5Spring.entities.NhomQuyen;

@Service
public class QuyenService {
	@Autowired
	private QuyenDAO quyenDAO;
	
	public List<NhomQuyen> listQuyen(){
		return quyenDAO.listQuyen();
	}

}
