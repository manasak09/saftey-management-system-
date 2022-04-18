package com.dao;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.model.RequestHazardCentre;


@Repository
public interface HazardCentreDAO {
	public void addRequest(RequestHazardCentre HazardCentre);
	public RequestHazardCentrefindRequest(int id);
	public List<HazardCentre> findAllRequest();
	public boolean updateRequest(HazardCentre action);
	public boolean deleteRequest(int id);
