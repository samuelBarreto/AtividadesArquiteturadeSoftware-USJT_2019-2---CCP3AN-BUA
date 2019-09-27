package com.example.Controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Model.DiaDaSemana;
import com.example.Repository.DiaDaSemanaRepository;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called diaDaSemanaRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private DiaDaSemanaRepository diaDaSemanaRepository;

	@PostMapping(path="/Dia") // Map ONLY POST Requests
	public @ResponseBody String addNewUser (@RequestParam Date diadasemana) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		DiaDaSemana n = new DiaDaSemana();
		n.setDiaDaSemana(diadasemana);
		diaDaSemanaRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/DiaDaSemana")
	public @ResponseBody Iterable<DiaDaSemana> getAllUsers() {
		// This returns a JSON or XML with the users
		return diaDaSemanaRepository.findAll();
	}
}
