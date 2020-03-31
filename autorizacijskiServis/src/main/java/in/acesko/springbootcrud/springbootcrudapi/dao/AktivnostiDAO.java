package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Aktivnosti;

public interface AktivnostiDAO {
		
	List<Aktivnosti> get();
	Aktivnosti get(int id);
	void save(Aktivnosti aktivnosti);
	void delete(int id);
}
