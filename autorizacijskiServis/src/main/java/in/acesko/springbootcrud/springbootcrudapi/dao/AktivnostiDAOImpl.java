package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Aktivnosti;

@Repository
public class AktivnostiDAOImpl implements AktivnostiDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Aktivnosti> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Aktivnosti> query = currentSession.createQuery("from Aktivnosti",Aktivnosti.class);
		List<Aktivnosti> list = query.getResultList();
		return list;
	}
	@Override
	public Aktivnosti get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Aktivnosti aktivnostiObj = currentSession.get(Aktivnosti.class, id);
		return aktivnostiObj;
	}

	@Override
	public void save(Aktivnosti aktivnosti) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(aktivnosti);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Aktivnosti aktivnostiObj = currentSession.get(Aktivnosti.class, id);
		currentSession.delete(aktivnostiObj);
	}

}