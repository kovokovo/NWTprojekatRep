package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Aktivnosti;

public interface AktivnostiService {
	
	List<Aktivnosti> get();
	Aktivnosti get(int id);
	void save(Aktivnosti aktivnosti);
	void delete(int id);
}
