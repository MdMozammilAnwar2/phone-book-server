/**
 * 
 */
package com.anwar.phonebook.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author MD MOZAMMIL ANWAR
 *
 */
@Data
@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	@Column(name="IS_ACTIVE")
	private Boolean isActive;
	@Column(name="CREATED_DATE")
	private LocalDate createdDate;
	@Column(name="UPDATED_DATE")
	private LocalDate updatedDate;
}
