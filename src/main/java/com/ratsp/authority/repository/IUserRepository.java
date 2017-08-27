package com.ratsp.authority.repository;


import com.ratsp.authority.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);
}
