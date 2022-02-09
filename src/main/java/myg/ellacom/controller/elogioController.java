package myg.ellacom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import myg.ellacom.models.Elogios;
import myg.ellacom.repository.elogiosRepository;

@RestController
@RequestMapping("/elogios")
@CrossOrigin("*")
public class elogioController {
	
	@Autowired
	private elogiosRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Elogios>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/post")
	public ResponseEntity<Elogios> post (@RequestBody Elogios elogios){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(elogios));
	}
	
	
}
