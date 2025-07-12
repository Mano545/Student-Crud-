package com.example.demo.service;

import com.example.demo.models.CommonResponse;
import com.example.demo.models.Students;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Serviceint {

    CommonResponse getAll();
    CommonResponse getByName(String name);
    CommonResponse addStudents(Students students);
    CommonResponse deleteById(int id);
    CommonResponse updateStudents(Students students);
}
