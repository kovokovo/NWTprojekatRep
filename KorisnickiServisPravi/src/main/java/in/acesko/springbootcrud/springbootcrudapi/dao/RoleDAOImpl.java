package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Role;

@Repository
public class RoleDAOImpl implements RoleDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Role> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Role> query = currentSession.createQuery("from Role",Role.class);
		List<Role> list = query.getResultList();
		return list;
	}
	@Override
	public Role get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Role roleObj = currentSession.get(Role.class, id);
		return roleObj;
	}

	@Override
	public void save(Role role) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(role);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Role roleObj = currentSession.get(Role.class, id);
		currentSession.delete(roleObj);
	}

}