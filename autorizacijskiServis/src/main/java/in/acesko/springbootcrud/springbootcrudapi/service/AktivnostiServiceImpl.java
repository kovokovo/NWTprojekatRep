package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.AktivnostiDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Aktivnosti;
import java.util.List;

@Service
public class AktivnostiServiceImpl implements AktivnostiService {

	@Autowired
	private AktivnostiDAO aktivnostiDAO;
	
	@Transactional
	@Override
	public List<Aktivnosti> get() {
		return aktivnostiDAO.get();
	}

	@Transactional
	@Override
	public Aktivnosti get(int id) {
	return aktivnostiDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Aktivnosti aktivnosti) {
		aktivnostiDAO.save(aktivnosti);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		aktivnostiDAO.delete(id);
	}

}
