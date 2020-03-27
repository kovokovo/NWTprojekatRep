package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Role;

public interface RoleDAO {
		
	List<Role> get();
	Role get(int id);
	void save(Role role);
	void delete(int id);
}
