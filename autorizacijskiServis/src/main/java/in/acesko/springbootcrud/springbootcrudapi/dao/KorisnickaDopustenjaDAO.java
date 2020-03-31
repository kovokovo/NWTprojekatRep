package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickaDopustenja;

public interface KorisnickaDopustenjaDAO {
		
	List<KorisnickaDopustenja> get();
	KorisnickaDopustenja get(int id);
	void save(KorisnickaDopustenja korisnickaDopustenja);
	void delete(int id);
}
