package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.KorisnickaDopustenjaDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickaDopustenja;
import java.util.List;

@Service
public class KorisnickaDopustenjaServiceImpl implements KorisnickaDopustenjaService {

	@Autowired
	private KorisnickaDopustenjaDAO korisnickaDopustenjaDAO;
	
	@Transactional
	@Override
	public List<KorisnickaDopustenja> get() {
		return korisnickaDopustenjaDAO.get();
	}

	@Transactional
	@Override
	public KorisnickaDopustenja get(int id) {
	return korisnickaDopustenjaDAO.get(id);
	}

	@Transactional
	@Override
	public void save(KorisnickaDopustenja korisnickaDopustenja) {
		korisnickaDopustenjaDAO.save(korisnickaDopustenja);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		korisnickaDopustenjaDAO.delete(id);
	}

}
