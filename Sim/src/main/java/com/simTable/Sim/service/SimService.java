package com.simTable.Sim.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.simTable.Sim.dao.SimDaoInterface;
import com.simTable.Sim.entity.SimTable;

import jakarta.transaction.Transactional;
@Service
@Transactional
@Scope(scopeName ="prototype")
public class SimService implements SimServiceInterface {
	
	@Autowired
	private SimDaoInterface idao;

	@Override
	public String createProfileService(SimTable st) {
		idao.save(st);
		return "Profile created !";
	}

	@Override
	public List<SimTable> getAllProfileService() {
		return idao.findAll();
	}

	@Override
	public SimTable getProfileService(Long uid) {
			SimTable ss= null;
		Optional<SimTable>	oo = idao.findById(uid);
		if(oo.isPresent()) {
			ss=oo.get();
		}
			 return ss;
		}

	@Override
	public String deleteProfileService(Long uid) {
		     idao.deleteById(uid);
				return "Profile deleted !";
		}

	@Override
	public String editProfileService(SimTable iu) {
		idao.saveAndFlush(iu);
		return "profile edited !";
	}
	   
	
	
		
	

}
