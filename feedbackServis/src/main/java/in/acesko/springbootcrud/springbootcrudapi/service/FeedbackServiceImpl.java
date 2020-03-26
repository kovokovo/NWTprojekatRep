package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.FeedbackDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Feedback;
import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDAO feedbackDAO;
	
	@Transactional
	@Override
	public List<Feedback> get() {
		return feedbackDAO.get();
	}

	@Transactional
	@Override
	public Feedback get(int id) {
	return feedbackDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Feedback feedback) {
		feedbackDAO.save(feedback);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		feedbackDAO.delete(id);
	}

}
