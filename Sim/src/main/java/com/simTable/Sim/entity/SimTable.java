package com.simTable.Sim.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Setter
@Getter
@ToString
public class SimTable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long simid;
	private String simprofile;
	private String iccid;
	private String billingstate;
	private String laststatusupdatedat;
	private Long imei;
	private String datausage;
	private String dataplan;
	private String smsout;
	private String emailout;
	private String locationofsim;
	private String lastseencountry;
	
	
	
	
}
