package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.ProizvodDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Proizvod;
import java.util.List;

@Service
public class ProizvodServiceImpl implements ProizvodService {

	@Autowired
	private ProizvodDAO proizvodDAO;
	
	@Transactional
	@Override
	public List<Proizvod> get() {
		return proizvodDAO.get();
	}

	@Transactional
	@Override
	public Proizvod get(int id) {
	return proizvodDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Proizvod proizvod) {
		proizvodDAO.save(proizvod);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		proizvodDAO.delete(id);
	}

}
