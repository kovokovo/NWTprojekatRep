package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.StavkaProdaje;

public interface StavkaProdajeDAO {
		
	List<StavkaProdaje> get();
	StavkaProdaje get(int id);
	void save(StavkaProdaje proizvod);
	void delete(int id);
}
