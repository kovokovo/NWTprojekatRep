package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Dopustenja;

@Repository
public class DopustenjaDAOImpl implements DopustenjaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Dopustenja> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Dopustenja> query = currentSession.createQuery("from Dopustenja",Dopustenja.class);
		List<Dopustenja> list = query.getResultList();
		return list;
	}
	@Override
	public Dopustenja get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Dopustenja dopustenjaObj = currentSession.get(Dopustenja.class, id);
		return dopustenjaObj;
	}

	@Override
	public void save(Dopustenja dopustenja) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(dopustenja);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Dopustenja dopustenjaObj = currentSession.get(Dopustenja.class, id);
		currentSession.delete(dopustenjaObj);
	}

}