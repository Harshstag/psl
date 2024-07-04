package com.spring.dao;

import com.spring.entity.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.dao.EmptyResultDataAccessException;

import javax.sql.DataSource; // Import DataSource here

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class OwnerDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Owner> getAllOwners() {
		return jdbcTemplate.query("SELECT * FROM owner", new OwnerRowMapper());
	}

	public String getOwnerNumberByName(String name) {
		String sql = "SELECT mobile_number FROM owner WHERE name =?";
		try {
			return jdbcTemplate.queryForObject(sql, new Object[] { name }, String.class);
		} catch (EmptyResultDataAccessException ex) {
			// Instead of returning a hardcoded string, consider logging the exception or
			// handling it differently.
			// For demonstration purposes, we'll just return null to indicate no owner was
			// found.
			return null;
		}
	}

	private static final class OwnerRowMapper implements RowMapper<Owner> {
		@Override
		public Owner mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Owner owner = new Owner();
			owner.setId(resultSet.getInt("id"));
			owner.setName(resultSet.getString("name"));
			owner.setPassword(resultSet.getString("password"));
			owner.setMobileNumber(resultSet.getString("mobile_number"));
			owner.setEmailId(resultSet.getString("email_id"));
			return owner;
		}
	}
}
