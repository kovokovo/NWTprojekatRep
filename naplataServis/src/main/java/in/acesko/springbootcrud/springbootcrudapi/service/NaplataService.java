package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Naplata;

public interface NaplataService {
	
	List<Naplata> get();
	Naplata get(int id);
	void save(Naplata naplata);
	void delete(int id);
}
