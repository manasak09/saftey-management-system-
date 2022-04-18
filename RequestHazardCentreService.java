package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.RequestHazardCentre;
import java.util.List;

@Service
public class RequestHazardCentreService {
	
	@Autowired
	RequestActionDAO requestHazardCentreDAOImpl;
	public void addRequest(RequestHazardCentre hazardCentre) 
	{
		requestHazardCentreDAOImpl.addRequest(HazardCentre);
	}
	public RequestHazardCentre findAction(int id)
	{
		return requestHazardCentreDAOImpl.findRequest(id);
		
	}
	public List<RequestHazardCentre> findAllHazardCentre() 
	{
		return requestHazardCentreDAOImpl.findAllRequest();
	}
	public boolean updateHazardCentre(RequestHazardCentre hazardCentre) 
	{
		return requestHazardCentreDAOImpl.updateRequest(HazardCentre);
	}
	public boolean deleteHazardCentre(int id) {
		return requestHazardCentreDAOImpl.deleteRequest(id);
	}

}
