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

import in.acesko.springbootcrud.springbootcrudapi.model.KorisnickeRole;
import in.acesko.springbootcrud.springbootcrudapi.service.KorisnickeRoleService;

@RestController
@RequestMapping("/api")
public class KorisnickeRoleController {

	@Autowired
	private KorisnickeRoleService korisnickeRoleService;
	
	@GetMapping("/korisnickeRole")
	public List<KorisnickeRole> get(){
		return korisnickeRoleService.get();
	}
	
	@PostMapping("/korisnickeRole")	
	public KorisnickeRole save(@RequestBody KorisnickeRole korisnickeRoleObj ) {
		korisnickeRoleService.save(korisnickeRoleObj);
		return korisnickeRoleObj;
	}
	
	@GetMapping("/korisnickeRole/{id}")
	public KorisnickeRole get(@PathVariable int id) {
		KorisnickeRole korisnickeRoleObj = korisnickeRoleService.get(id);
		if(korisnickeRoleObj == null) {
			throw new RuntimeException("Korisnicke role sa id-om:"+id+"nisu pronađene");
		}
		return korisnickeRoleObj;
	}
	@DeleteMapping("/korisnickeRole/{id}")
	public String delete(@PathVariable int id) {
		korisnickeRoleService.delete(id);
		return "Korisnicke role su obrisane sa id-om:"+id;
	}
	@PutMapping("/korisnickeRole")
	public KorisnickeRole update(@RequestBody KorisnickeRole korisnickeRoleObj) {
		korisnickeRoleService.save(korisnickeRoleObj);
		return korisnickeRoleObj;
	}
	@RequestMapping(value = "/korisnickeRole", method = RequestMethod.GET)
	public KorisnickeRole firstPage() {

		KorisnickeRole korrol = new KorisnickeRole();
		korrol.setKorisnickaRolaID(1);
		korrol.setKorisnikID(1);
		korrol.setRolaID(1);

		return korrol;
	}

	
}
