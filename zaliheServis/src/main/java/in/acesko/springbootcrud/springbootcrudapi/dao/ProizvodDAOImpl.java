package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Proizvod;

@Repository
public class ProizvodDAOImpl implements ProizvodDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Proizvod> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Proizvod> query = currentSession.createQuery("from Proizvod",Proizvod.class);
		List<Proizvod> list = query.getResultList();
		return list;
	}
	@Override
	public Proizvod get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Proizvod proizvodObj = currentSession.get(Proizvod.class, id);
		return proizvodObj;
	}

	@Override
	public void save(Proizvod proizvod) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(proizvod);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Proizvod proizvodObj = currentSession.get(Proizvod.class, id);
		currentSession.delete(proizvodObj);
	}

}
