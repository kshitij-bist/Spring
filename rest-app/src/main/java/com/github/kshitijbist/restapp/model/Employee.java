package com.github.kshitijbist.restapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private Long id;
	private String name;
}
