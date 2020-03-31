package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Dopustenja;

public interface DopustenjaService {
	
	List<Dopustenja> get();
	Dopustenja get(int id);
	void save(Dopustenja dopustenja);
	void delete(int id);
}
