package java5Spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java5Spring.entities.NhomQuyen;

@Repository
public class QuyenDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public List<NhomQuyen> listQuyen() {
		Session session = this.sessionFactory.openSession();
		List<NhomQuyen> list = session.createQuery("FROM NhomQuyen", NhomQuyen.class).getResultList();
		session.close();
		return list;
	}
}
