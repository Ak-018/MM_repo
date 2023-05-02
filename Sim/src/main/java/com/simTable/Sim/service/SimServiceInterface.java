
package com.simTable.Sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.simTable.Sim.entity.SimTable;

public interface SimServiceInterface {

	public String createProfileService(SimTable st);

	public List<SimTable> getAllProfileService();

	public SimTable getProfileService(String uid);

	public String deleteProfileService(String uid);

	public String editProfileService(SimTable iu);

	
	

}
