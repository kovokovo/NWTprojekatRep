package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Proizvod;

public interface ProizvodDAO {
		
	List<Proizvod> get();
	Proizvod get(int id);
	void save(Proizvod proizvod);
	void delete(int id);
}
