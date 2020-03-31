package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Dopustenja;

public interface DopustenjaDAO {
		
	List<Dopustenja> get();
	Dopustenja get(int id);
	void save(Dopustenja dopustenja);
	void delete(int id);
}

