package com.vivek;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

	private AddressRepository repository;

	public AddressController() {
		repository = new AddressRepository();
	}

	@RequestMapping("/address")
	public Address getAddress(@RequestParam(value = "id", required = true) Long id) {
		return repository.getAddress(id);
	}
	
	
}
