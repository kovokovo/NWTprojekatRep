package in.acesko.springbootcrud.springbootcrudapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.acesko.springbootcrud.springbootcrudapi.dao.RoleDAO;
import in.acesko.springbootcrud.springbootcrudapi.model.Role;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;
	
	@Transactional
	@Override
	public List<Role> get() {
		return roleDAO.get();
	}

	@Transactional
	@Override
	public Role get(int id) {
	return roleDAO.get(id);
	}

	@Transactional
	@Override
	public void save(Role role) {
		roleDAO.save(role);		
	}
	@Transactional
	@Override
	public void delete(int id) {
		roleDAO.delete(id);
	}

}