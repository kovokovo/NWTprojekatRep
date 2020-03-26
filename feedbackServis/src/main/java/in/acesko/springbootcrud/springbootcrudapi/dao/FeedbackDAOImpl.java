package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.acesko.springbootcrud.springbootcrudapi.model.Feedback;

@Repository
public class FeedbackDAOImpl implements FeedbackDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Feedback> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Feedback> query = currentSession.createQuery("from Feedback",Feedback.class);
		List<Feedback> list = query.getResultList();
		return list;
	}
	@Override
	public Feedback get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Feedback feedbackObj = currentSession.get(Feedback.class, id);
		return feedbackObj;
	}

	@Override
	public void save(Feedback feedback) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(feedback);
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		Feedback feedbackObj = currentSession.get(Feedback.class, id);
		currentSession.delete(feedbackObj);
	}

}
