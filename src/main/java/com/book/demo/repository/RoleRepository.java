package com.book.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
