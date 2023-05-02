package com.simTable.Sim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class SimTable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long SIMID;
	private String SIMProfile;
	private String ICCID;
	private String BillingState;
	private String LastStatusUpdatedAT;
	private long IMEI;
	private String DataUsage;
	private String DataPlan;
	private String SMSOut;
	private String EmailOut;
	private String LocationOfSim;
	private String LastSeenCountry;
	
	
	
	
}
