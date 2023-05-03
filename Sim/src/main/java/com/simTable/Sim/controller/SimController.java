package com.simTable.Sim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simTable.Sim.entity.SimTable;
import com.simTable.Sim.service.SimServiceInterface;

@RestController 
public class SimController {
@Autowired
private SimServiceInterface simsi;	
		
@PostMapping("createProfile")
	public String createProfile(@RequestBody SimTable st) {
		return simsi.createProfileService(st);
	}
@GetMapping("viewAllProfile")
public List<SimTable> viewAll(){
	return simsi.getAllProfileService();
}

@GetMapping("viewProfile/{id}")
public SimTable viewProfile(@PathVariable("id")Long uid){
	return simsi.getProfileService(uid);
}

@DeleteMapping("deleteProfile/{id}")
public String deleteProfile(@PathVariable("id")Long uid){
	return simsi.deleteProfileService(uid);
}

@PutMapping("editProfile/{id}")
public String editProfile(@PathVariable("id")Long uid,@RequestBody SimTable iu){
	return simsi.editProfileService(iu);
}

}
