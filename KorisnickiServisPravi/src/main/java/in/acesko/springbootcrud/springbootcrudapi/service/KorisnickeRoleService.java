package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickeRole;

public interface KorisnickeRoleService {
	
	List<KorisnickeRole> get();
	KorisnickeRole get(int id);
	void save(KorisnickeRole korisnickeRole);
	void delete(int id);
}
