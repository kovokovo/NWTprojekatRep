package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.NaplataDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Naplata;
import java.util.List;

@Service
public class NaplataServiceImpl implements NaplataService {

	@Autowired
	private NaplataDAO naplataDAO;
	
	@Transactional
	@Override
	public List<Naplata> get() {
		return naplataDAO.get();
	}

	@Transactional
	@Override
	public Naplata get(int id) {
	return naplataDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Naplata naplata) {
		naplataDAO.save(naplata);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		naplataDAO.delete(id);
	}
}
