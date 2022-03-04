package com.te.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.project.Dto.User;

@Repository
public interface MyDaoLayer extends JpaRepository<User, Integer> {

}
