package com.company.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional	
	public List<Student> findAll() {
		return jdbcTemplate.query("select * from students", new StudentRowMapper());
	}
	
	class StudentRowMapper implements RowMapper<Student>
	{
	    @Override
	    public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	    {
	    	Student student = new Student();
	    	student.setId(rs.getInt("id"));
	    	student.setName(rs.getString("studentname"));
	    	student.setAge(rs.getInt("age"));
	    	student.setDescription(rs.getString("description"));
	 
	        return student;
	    }
	}
}
