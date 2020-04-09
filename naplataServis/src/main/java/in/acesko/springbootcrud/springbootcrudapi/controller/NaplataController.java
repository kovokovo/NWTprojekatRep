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

import in.acesko.springbootcrud.springbootcrudapi.model.Naplata;
import in.acesko.springbootcrud.springbootcrudapi.service.NaplataService;

@RestController
@RequestMapping("/api")
public class NaplataController {

	@Autowired
	private NaplataService naplataService;
	
	@GetMapping("/naplata")
	public List<Naplata> get(){
		return naplataService.get();
	}
	
	@PostMapping("/naplata")	
	public Naplata save(@RequestBody Naplata naplataObj ) {
		naplataService.save(naplataObj);
		return naplataObj;
	}
	
	@GetMapping("/naplata/{id}")
	public Naplata get(@PathVariable int id) {
		Naplata naplataObj = naplataService.get(id);
		if(naplataObj == null) {
			throw new RuntimeException("Naplata sa id-om:"+id+"nije pronađena");
		}
		return naplataObj;
	}
	@DeleteMapping("/naplata/{id}")
	public String delete(@PathVariable int id) {
		naplataService.delete(id);
		return "Naplata je obrisana sa id-om:"+id;
	}
	@PutMapping("/naplata")
	public Naplata update(@RequestBody Naplata naplataObj) {
		naplataService.save(naplataObj);
		return naplataObj;
	}
	@RequestMapping(value = "/naplata", method = RequestMethod.GET)
	public Naplata firstPage() {

		Naplata nap = new Naplata();
		nap.setNaplataID(1);
		nap.setKorisnikID(2);
		nap.setOpis("Opis naplate");
		nap.setStavkaProdajeID(1);
		nap.setValuta("BAM");
		nap.setAdresaDostave("Adresa 14");

		return nap;
	}
	
}
