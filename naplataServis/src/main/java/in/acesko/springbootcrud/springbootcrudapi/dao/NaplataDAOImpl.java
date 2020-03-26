package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Naplata;

@Repository
public class NaplataDAOImpl implements NaplataDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Naplata> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Naplata> query = currentSession.createQuery("from Naplata",Naplata.class);
		List<Naplata> list = query.getResultList();
		return list;
	}
	@Override
	public Naplata get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Naplata naplataObj = currentSession.get(Naplata.class, id);
		return naplataObj;
	}

	@Override
	public void save(Naplata naplata) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(naplata);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Naplata naplataObj = currentSession.get(Naplata.class, id);
		currentSession.delete(naplataObj);
	}

}