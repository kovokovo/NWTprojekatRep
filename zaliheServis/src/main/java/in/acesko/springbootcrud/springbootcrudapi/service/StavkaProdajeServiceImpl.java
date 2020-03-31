package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.StavkaProdajeDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.StavkaProdaje;
import java.util.List;

@Service
public class StavkaProdajeServiceImpl implements StavkaProdajeService {

	@Autowired
	private StavkaProdajeDAO stavkaProdajeDAO;
	
	@Transactional
	@Override
	public List<StavkaProdaje> get() {
		return stavkaProdajeDAO.get();
	}

	@Transactional
	@Override
	public StavkaProdaje get(int id) {
	return stavkaProdajeDAO.get(id);
	}

	@Transactional
	@Override
	public void save(StavkaProdaje stavkaProdaje) {
		stavkaProdajeDAO.save(stavkaProdaje);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		stavkaProdajeDAO.delete(id);
	}

}
