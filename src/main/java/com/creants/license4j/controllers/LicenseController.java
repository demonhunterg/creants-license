package com.creants.license4j.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LamHa
 *
 */
@RestController
@RequestMapping("/license")
public class LicenseController {
	@PostMapping(path = "verify", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String verify() {
		return "test";
	}

	@RequestMapping(path = "test", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String test() {
		return "test";
	}

}
