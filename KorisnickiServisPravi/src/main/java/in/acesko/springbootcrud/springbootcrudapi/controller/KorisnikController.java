package in.acesko.springbootcrud.springbootcrudapi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.acesko.springbootcrud.springbootcrudapi.model.Korisnik;
import in.acesko.springbootcrud.springbootcrudapi.service.KorisnikService;

@RestController
@RequestMapping("/api")
public class KorisnikController {

	@Autowired
	private KorisnikService korisnikService;
	
	@GetMapping("/korisnik")
	public List<Korisnik> get(){
		return korisnikService.get();
	}
	
	@PostMapping("/korisnik")	
	public Korisnik save(@RequestBody Korisnik korisnikObj ) {
		korisnikService.save(korisnikObj);
		return korisnikObj;
	}
	
	@GetMapping("/korisnik/{id}")
	public Korisnik get(@PathVariable int id) {
		Korisnik korisnikObj = korisnikService.get(id);
		if(korisnikObj == null) {
			throw new RuntimeException("Korisnik sa id-om:"+id+"nije pronađen");
		}
		return korisnikObj;
	}
	@DeleteMapping("/korisnik/{id}")
	public String delete(@PathVariable int id) {
		korisnikService.delete(id);
		return "Korisnik je obrisan sa id-om:"+id;
	}
	@PutMapping("/korisnik")
	public Korisnik update(@RequestBody Korisnik korisnikObj) {
		korisnikService.save(korisnikObj);
		return korisnikObj;
	}
	@RequestMapping(value = "/korisnik", method = RequestMethod.GET)
	public Korisnik firstPage() {

		Korisnik kor = new Korisnik();
		kor.setKorisnikID(1);
		kor.setBrojKartice("12345678");
		kor.setGodine(20);
		kor.setIme("Ime");
		kor.setPrezime("Prezime");

		return kor;
	}

	
}
