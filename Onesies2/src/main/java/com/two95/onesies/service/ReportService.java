package com.two95.onesies.service;

import java.util.List;

import com.two95.onesies.model.Kid;

public interface ReportService {

	public int save(Kid kid);
	public List<Kid> getKids();
}
