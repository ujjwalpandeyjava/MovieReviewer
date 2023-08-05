package pandey.ujjwal.MovierReviewer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/", "" })
@CrossOrigin(origins = { "http://localhost:8080"})
public class ActualMasterController {

	@GetMapping
	@PostMapping
	public ResponseEntity<String> atRoot() {
		String respose = "Maste URI.";
		return new ResponseEntity<String>(respose, HttpStatus.OK);
	}

}
