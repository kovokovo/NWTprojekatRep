package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.DopustenjaDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Dopustenja;
import java.util.List;

@Service
public class DopustenjaServiceImpl implements DopustenjaService {

	@Autowired
	private DopustenjaDAO dopustenjaDAO;
	
	@Transactional
	@Override
	public List<Dopustenja> get() {
		return dopustenjaDAO.get();
	}

	@Transactional
	@Override
	public Dopustenja get(int id) {
	return dopustenjaDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Dopustenja dopustenja) {
		dopustenjaDAO.save(dopustenja);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		dopustenjaDAO.delete(id);
	}

}
