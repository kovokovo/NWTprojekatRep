package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Role;

public interface RoleService {
	
	List<Role> get();
	Role get(int id);
	void save(Role role);
	void delete(int id);
}
