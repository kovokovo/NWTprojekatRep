package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Feedback;

public interface FeedbackService {
	
	List<Feedback> get();
	Feedback get(int id);
	void save(Feedback feedback);
	void delete(int id);
}
