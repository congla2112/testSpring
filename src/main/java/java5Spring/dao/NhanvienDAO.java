package java5Spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java5Spring.entities.Nhanvien;


@Repository(value = "nhanvienDAO")
@Transactional(rollbackFor = Exception.class)
public class NhanvienDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Nhanvien> listNhanvien() {
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("FROM Nhanvien", Nhanvien.class).getResultList();

	}

	public void saveNv(final Nhanvien nhanvien) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(nhanvien);
	}

	public void updateNv(final Nhanvien nhanvien) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(nhanvien);
	}

	public void deleteNv(Nhanvien nv) {
		Session session = this.sessionFactory.getCurrentSession();
		session.delete(nv);
	}

	public Nhanvien findNv(final String id) {
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Nhanvien.class, id);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean checkLogin(String username, String password) {
		Session session = this.sessionFactory.openSession();
		boolean userfound = false;
		String sql ="FROM Nhanvien as o WHERE o.UserName =? and o.PassWord=?";
		Query query = session.createQuery(sql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		
		List<Nhanvien> list = query.list();
		if((list != null) && (list.size() >0)){
			userfound = true;
		}
		session.close();
		return userfound;
	    
	}
	
}


	