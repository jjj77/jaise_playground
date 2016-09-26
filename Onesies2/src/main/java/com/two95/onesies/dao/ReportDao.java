package com.two95.onesies.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.two95.onesies.model.Kid;

public interface ReportDao {
	
	public int save(Kid kid);
	public List<Kid> getKids();

}
