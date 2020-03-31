package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickaDopustenja;

public interface KorisnickaDopustenjaService {
	
	List<KorisnickaDopustenja> get();
	KorisnickaDopustenja get(int id);
	void save(KorisnickaDopustenja korisnickaDopustenja);
	void delete(int id);
}

