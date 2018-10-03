package com.beuno.inhealthwealth.expenditure;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/expenditure")
public class ExpenditureController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private ExpenditureRepository expenditureRepo;
	
	/*@GetMapping("/")
	public String hello() {
		return "Hello";
	}*/

	@GetMapping("/")
	public List<Expenditure> getAllUsers() {
		LOG.info("Getting all Expenditure.");
		return expenditureRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Expenditure> getExpense(@PathVariable String id) {
		LOG.info("Getting expense with ID: {}.", id);
		return expenditureRepo.findById(id);
	}
	
	@PostMapping(value = "/create")
	public Expenditure addNewUsers(@RequestBody Expenditure expense) {
		LOG.info("Saving Expense.");
		return expenditureRepo.save(expense);
	}
	
	@PostMapping("/")
	public @ResponseBody Expenditure addExpenditure(){
		
		return null;
	}
}
