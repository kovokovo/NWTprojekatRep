package in.acesko.springbootcrud.springbootcrudapi.service;

import java.util.List;
import in.acesko.springbootcrud.springbootcrudapi.model.Korisnik;

public interface KorisnikService {
	
	List<Korisnik> get();
	Korisnik get(int id);
	void save(Korisnik korisnik);
	void delete(int id);
}
