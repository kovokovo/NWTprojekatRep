package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickeRole;

@Repository
public class KorisnickeRoleDAOImpl implements KorisnickeRoleDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<KorisnickeRole> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<KorisnickeRole> query = currentSession.createQuery("from KorisnickeRole",KorisnickeRole.class);
		List<KorisnickeRole> list = query.getResultList();
		return list;
	}
	@Override
	public KorisnickeRole get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		KorisnickeRole korisnickeRoleObj = currentSession.get(KorisnickeRole.class, id);
		return korisnickeRoleObj;
	}

	@Override
	public void save(KorisnickeRole korisnickeRole) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(korisnickeRole);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		KorisnickeRole korisnickeRoleObj = currentSession.get(KorisnickeRole.class, id);
		currentSession.delete(korisnickeRoleObj);
	}

}
