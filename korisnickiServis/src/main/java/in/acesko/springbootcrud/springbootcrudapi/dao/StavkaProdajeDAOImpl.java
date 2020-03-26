package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.StavkaProdaje;

@Repository
public class StavkaProdajeDAOImpl implements StavkaProdajeDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<StavkaProdaje> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<StavkaProdaje> query = currentSession.createQuery("from StavkaProdaje",StavkaProdaje.class);
		List<StavkaProdaje> list = query.getResultList();
		return list;
	}
	@Override
	public StavkaProdaje get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		StavkaProdaje stavkaProdajeObj = currentSession.get(StavkaProdaje.class, id);
		return stavkaProdajeObj;
	}

	@Override
	public void save(StavkaProdaje stavkaProdaje) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(stavkaProdaje);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		StavkaProdaje stavkaProdajeObj = currentSession.get(StavkaProdaje.class, id);
		currentSession.delete(stavkaProdajeObj);
	}

}