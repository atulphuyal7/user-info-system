package com.vastika.userinfo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vastika.userinfo.model.User;

public class UserExtractor implements ResultSetExtractor<User>{

	@Override
	public User extractData(ResultSet rs) throws SQLException, DataAccessException {
	   User user = new User();
	   user.setId(rs.getInt("id"));
	   user.setUsername(rs.getString("user_name"));
	   user.setPassword(rs.getString("password"));
	   user.setGender(rs.getString("gender"));
	   user.setEmail(rs.getString("email"));
	   user.setHobbies(rs.getString("hobbies"));
	   user.setNationality(rs.getString("nationality"));
	   user.setDob(rs.getDate("dob"));
		return user;
	}

}
