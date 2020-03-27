package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.KorisnickeRoleDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickeRole;
import java.util.List;

@Service
public class KorisnickeRoleServiceImpl implements KorisnickeRoleService {

	@Autowired
	private KorisnickeRoleDAO korisnickeRoleDAO;
	
	@Transactional
	@Override
	public List<KorisnickeRole> get() {
		return korisnickeRoleDAO.get();
	}

	@Transactional
	@Override
	public KorisnickeRole get(int id) {
	return korisnickeRoleDAO.get(id);
	}

	@Transactional
	@Override
	public void save(KorisnickeRole korisnickeRole) {
		korisnickeRoleDAO.save(korisnickeRole);		
	}

	@Transactional
	@Override
	public void delete(int id) {
		korisnickeRoleDAO.delete(id);
	}

}
