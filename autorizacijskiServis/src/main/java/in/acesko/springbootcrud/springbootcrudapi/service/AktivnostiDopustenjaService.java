package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.AktivnostiDopustenja;

public interface AktivnostiDopustenjaService {
	
	List<AktivnostiDopustenja> get();
	AktivnostiDopustenja get(int id);
	void save(AktivnostiDopustenja aktivnostiDopustenja);
	void delete(int id);
}
