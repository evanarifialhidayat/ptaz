package com.app.interview.ptaz.repo;


import java.util.Optional;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.app.interview.ptaz.model.UserLogin;

@Repository
public interface UserLoginRepo extends DataTablesRepository<UserLogin, Long> {
	UserLogin findByEmail(String Email);
	UserLogin findByEmailAndKatasandi(String Email,String Katasandi);
}
