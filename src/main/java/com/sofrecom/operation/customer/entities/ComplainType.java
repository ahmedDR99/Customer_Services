package com.sofrecom.operation.customer.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ComplainType {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String label;
	
	private String label_fr;

	private String label_ar;
	@OneToMany()
	private Collection<SousTypes> sousTypes;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getLabel_fr() {
		return label_fr;
	}
	public void setLabel_fr(String label_fr) {
		this.label_fr = label_fr;
	}
	public String getLabel_ar() {
		return label_ar;
	}
	public void setLabel_ar(String label_ar) {
		this.label_ar = label_ar;
	}
	public Collection<SousTypes> getSousTypes() {
		return sousTypes;
	}
	public void setSousTypes(Collection<SousTypes> sousTypes) {
		this.sousTypes = sousTypes;
	}
	public ComplainType(Long id, String label, String label_fr, String label_ar, Collection<SousTypes> sousTypes) {
		super();
		this.id = id;
		this.label = label;
		this.label_fr = label_fr;
		this.label_ar = label_ar;
		this.sousTypes = sousTypes;
	}
	public ComplainType() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}


