package in.acesko.springbootcrud.springbootcrudapi.dao;


import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickeRole;

public interface KorisnickeRoleDAO {
		
	List<KorisnickeRole> get();
	KorisnickeRole get(int id);
	void save(KorisnickeRole korisnickeRole);
	void delete(int id);
}
