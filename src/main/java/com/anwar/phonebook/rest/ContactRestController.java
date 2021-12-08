/**
 * 
 */
package com.anwar.phonebook.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author MD MOZAMMIL ANWAR
 *
 */
@RestController
@CrossOrigin
public class ContactRestController {
	@GetMapping("/")
	public String welcome() {
		return "Welcome to the phonebook";
	}
}
