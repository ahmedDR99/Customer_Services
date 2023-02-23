package com.sofrecom.operation.customer.controller;

import java.util.Collection;

import com.sofrecom.operation.customer.entities.Delegation;
import com.sofrecom.operation.customer.service.DelegationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DelegationController {
	@Autowired
    DelegationService delegationService;

	@GetMapping(value = "/delegations")
	public Collection<Delegation> findAlldelegations() {
		return delegationService.findAll();
	}

	@GetMapping(value = "/delegations/{id}")
	public Delegation findoneDelegation(@PathVariable Long id) {
		return delegationService.findDelegation(id);
	}

	@PostMapping(value ="/delegations")
	public Delegation addDelegation(@RequestBody Delegation m) {
		return delegationService.addDelegation(m);
	}

	
	@PutMapping(value ="/delegations/{id}")
	public Delegation updateDelegation(@PathVariable Long id, @RequestBody Delegation p) {
	p.setIddele(id);
		return delegationService.updateDelegation(p);
		
	}

	@DeleteMapping(value = "/delegations/{id}")
	public void deleteDelegation(@PathVariable Long id) {
		delegationService.deleteDelegation(id);
	}

}
