package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickaDopustenja;

@Repository
public class KorisnickaDopustenjaDAOImpl implements KorisnickaDopustenjaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<KorisnickaDopustenja> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<KorisnickaDopustenja> query = currentSession.createQuery("from KorisnickaDopustenja",KorisnickaDopustenja.class);
		List<KorisnickaDopustenja> list = query.getResultList();
		return list;
	}
	@Override
	public KorisnickaDopustenja get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		KorisnickaDopustenja korisnickaDopustenjaObj = currentSession.get(KorisnickaDopustenja.class, id);
		return korisnickaDopustenjaObj;
	}

	@Override
	public void save(KorisnickaDopustenja korisnickaDopustenja) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(korisnickaDopustenja);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		KorisnickaDopustenja korisnickaDopustenjaObj = currentSession.get(KorisnickaDopustenja.class, id);
		currentSession.delete(korisnickaDopustenjaObj);
	}

}