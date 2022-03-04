package com.te.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.project.Dto.Admin;
@Repository
public interface Dao extends JpaRepository<Admin, String>{

}
