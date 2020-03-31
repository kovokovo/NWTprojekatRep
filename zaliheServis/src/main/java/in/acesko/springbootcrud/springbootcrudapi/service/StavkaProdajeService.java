package in.acesko.springbootcrud.springbootcrudapi.service;
import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.StavkaProdaje;

public interface StavkaProdajeService {
	
	List<StavkaProdaje> get();
	StavkaProdaje get(int id);
	void save(StavkaProdaje proizvod);
	void delete(int id);
}
