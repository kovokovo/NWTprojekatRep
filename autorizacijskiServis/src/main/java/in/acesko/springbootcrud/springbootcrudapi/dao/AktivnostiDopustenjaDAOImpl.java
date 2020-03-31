package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.AktivnostiDopustenja;

@Repository
public class AktivnostiDopustenjaDAOImpl implements AktivnostiDopustenjaDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<AktivnostiDopustenja> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<AktivnostiDopustenja> query = currentSession.createQuery("from AktivnostiDopustenja",AktivnostiDopustenja.class);
		List<AktivnostiDopustenja> list = query.getResultList();
		return list;
	}
	@Override
	public AktivnostiDopustenja get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		AktivnostiDopustenja aktivnostiDopustenjaObj = currentSession.get(AktivnostiDopustenja.class, id);
		return aktivnostiDopustenjaObj;
	}

	@Override
	public void save(AktivnostiDopustenja aktivnostiDopustenja) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(aktivnostiDopustenja);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		AktivnostiDopustenja aktivnostiDopustenjaObj = currentSession.get(AktivnostiDopustenja.class, id);
		currentSession.delete(aktivnostiDopustenjaObj);
	}

}