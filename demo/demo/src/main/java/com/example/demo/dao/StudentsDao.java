package com.example.demo.dao;

import com.example.demo.models.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsDao extends JpaRepository<Students,Integer>{
    Students getByName(String name);
}
