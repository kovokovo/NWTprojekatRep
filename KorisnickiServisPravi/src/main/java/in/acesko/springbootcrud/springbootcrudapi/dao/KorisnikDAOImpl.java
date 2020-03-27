package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Korisnik;

@Repository
public class KorisnikDAOImpl implements KorisnikDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Korisnik> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Korisnik> query = currentSession.createQuery("from Korisnik",Korisnik.class);
		List<Korisnik> list = query.getResultList();
		return list;
	}
	@Override
	public Korisnik get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Korisnik korisnikObj = currentSession.get(Korisnik.class, id);
		return korisnikObj;
	}

	@Override
	public void save(Korisnik korisnik) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(korisnik);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Korisnik korisnikObj = currentSession.get(Korisnik.class, id);
		currentSession.delete(korisnikObj);
	}

}