package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.KorisnikDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Korisnik;
import java.util.List;

@Service
public class KorisnikServiceImpl implements KorisnikService {

	@Autowired
	private KorisnikDAO korisnikDAO;
	
	@Transactional
	@Override
	public List<Korisnik> get() {
		return korisnikDAO.get();
	}

	@Transactional
	@Override
	public Korisnik get(int id) {
	return korisnikDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Korisnik korisnik) {
		korisnikDAO.save(korisnik);		
	}
	@Transactional
	@Override
	public void delete(int id) {
		korisnikDAO.delete(id);
	}

}