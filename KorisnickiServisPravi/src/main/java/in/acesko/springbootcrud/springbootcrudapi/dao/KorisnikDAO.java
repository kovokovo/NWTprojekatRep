package in.acesko.springbootcrud.springbootcrudapi.dao;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Korisnik;

public interface KorisnikDAO {
		
	List<Korisnik> get();
	Korisnik get(int id);
	void save(Korisnik korisnik);
	void delete(int id);
}
