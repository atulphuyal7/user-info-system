package com.vastika.userinfo.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vastika.userinfo.mapper.UserRowMapper;
import com.vastika.userinfo.model.User;

@Repository
public class UserRepositorylmpl implements UserRepository {
	public static final String INSERT_SQL = "insert into user_tbl(user_name, password, email, gender, nationality, hobbies, dob)values(?,?,?,?,?,?,?)";
	public static final String LIST_SQL = "select * from user_tbl";

	
	@Autowired
	private DataSource dataSource;

	@Override
	public void saveUser(User user) {
		getJdbcTemplate(dataSource).update(INSERT_SQL, new Object[] { user.getUsername(), user.getPassword(), user.getEmail(),
				user.getGender(), user.getNationality(), user.getHobbies(), user.getDob() });

	}

	@Override
	public List<User> getAllUser() {
		List<User> users = getJdbcTemplate(dataSource).query(LIST_SQL, new UserRowMapper());
		return users;
	}
	
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}