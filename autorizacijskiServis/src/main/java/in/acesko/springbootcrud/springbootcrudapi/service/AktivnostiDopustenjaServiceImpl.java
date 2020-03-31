package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.AktivnostiDopustenjaDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.AktivnostiDopustenja;
import java.util.List;

@Service
public class AktivnostiDopustenjaServiceImpl implements AktivnostiDopustenjaService {

	@Autowired
	private AktivnostiDopustenjaDAO aktivnostiDopustenjaDAO;
	
	@Transactional
	@Override
	public List<AktivnostiDopustenja> get() {
		return aktivnostiDopustenjaDAO.get();
	}

	@Transactional
	@Override
	public AktivnostiDopustenja get(int id) {
	return aktivnostiDopustenjaDAO.get(id);
	}

	@Transactional
	@Override
	public void save(AktivnostiDopustenja aktivnostiDopustenja) {
		aktivnostiDopustenjaDAO.save(aktivnostiDopustenja);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		aktivnostiDopustenjaDAO.delete(id);
	}

}

