package com.tg.healthcaremvcapp.services;

import java.util.List;

import com.tg.healthcaremvcapp.models.Clinic;

public interface ClinicImplService {
	
	public Clinic addClinic(Clinic clinic);
	public List<Clinic> getAllClinic();
	public Clinic getClinicById(String clinicId);
	public List<Clinic> getClinicByName(String clinicName);
	public Clinic updateClinic(String businessName, String clinicId);
	public boolean deleteClinic(String clinicId);
}
