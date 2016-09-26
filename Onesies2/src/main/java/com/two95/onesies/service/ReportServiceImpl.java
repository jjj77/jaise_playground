package com.two95.onesies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.two95.onesies.dao.ReportDao;
import com.two95.onesies.model.Kid;
@Component()
public class ReportServiceImpl implements ReportService {
	
	ReportDao reportdao;

	public ReportDao getReportdao() {
		return reportdao;
	}

	public void setReportdao(ReportDao reportdao) {
		this.reportdao = reportdao;
	}

	@Override
	public int save(Kid kid) {
	
		return reportdao.save(kid);
	}

	@Override
	public List<Kid> getKids() {
		
		return reportdao.getKids();
	}

}
