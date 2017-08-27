package com.ratsp.authority.repository;


import com.ratsp.authority.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Integer> {

}
