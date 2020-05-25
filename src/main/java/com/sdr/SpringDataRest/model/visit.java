package com.sdr.SpringDataRest.model;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="visits")
public class visit {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long visit_id;
	private String first_name;
	private String last_name;
	private LocalDate visited_at;
	private String phone;
	private int store_id;

}
