package com.two95.onesies.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.two95.onesies.model.Kid;
@Component
public class ReportDaoImpl implements ReportDao {
	@Autowired
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int save(Kid kid) {
		
		String fname=kid.getFname();
		String lname=kid.getLname();
		//String date1=kid.getDateofreport();
		String remarks=kid.getRemarks();
		String mood=kid.getMood();
		String comments=kid.getComments();
		fname=fname.replace("'","''");
		lname=lname.replace("'","''");
		remarks=remarks.replace("'","''");
		comments=comments.replace("'","''");
		
			
		
		
		String sql = "insert into reports(dateofreport, fname, lname, mood, remarks, comments) values('" + kid.getDateofreport() + "','"
				+ fname + "','"+lname+"','" + mood + "','" + remarks + "','" + comments+ "')";
		

		return template.update(sql);

		
		
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Kid> getKids() {
		String sql = "select * from reports order by dateofreport desc limit 25";
		
	    return template.query(sql, new RowMapper(){
	    	public Kid mapRow(ResultSet rs, int row) throws SQLException {  
            Kid kid=new Kid();  
            kid.setReport_id(rs.getInt(1));
            kid.setDateofreport(rs.getString(2));
            kid.setFname(rs.getString(3));
            kid.setLname(rs.getString(4)); 
              
            kid.setMood(rs.getString(5));
            kid.setRemarks(rs.getString(6)); 
            kid.setComments(rs.getString(7));
            return kid; } 
         
    }  ); 

	}

}
