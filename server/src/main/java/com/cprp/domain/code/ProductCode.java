package com.cprp.domain.code;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class ProductCode {
	@Id
	// Define a sequence - might also be in another class:
	@SequenceGenerator(name="productCodeSequence", sequenceName="ProductCODE_SEQUENCE_PK", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="productCodeSequence")
	private long seq;
	
	@NotNull
	@Column(unique = true, name="code", nullable=false)
	private String code;
	
	@NotNull
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="description", nullable=true)
	private String description;
	
	/**
	 * @return the seq
	 */
	public long getSeq() {
		return seq;
	}
	/**
	 * @param seq the seq to set
	 */
	public void setSeq(long seq) {
		this.seq = seq;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
