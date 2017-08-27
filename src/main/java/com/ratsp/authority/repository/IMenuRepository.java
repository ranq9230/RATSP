package com.ratsp.authority.repository;

import com.ratsp.authority.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMenuRepository extends JpaRepository<Menu, Integer> {

}
