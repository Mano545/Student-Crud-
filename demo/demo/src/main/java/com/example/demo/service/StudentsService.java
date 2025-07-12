package com.example.demo.service;

import com.example.demo.models.CommonResponse;
import com.example.demo.models.Students;
import com.example.demo.dao.StudentsDao;
import com.example.demo.models.enumeration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;
import java.util.Optional;

@Service
public class StudentsService implements Serviceint{
    @Autowired
    StudentsDao Studentsdao;
    @Autowired
    private StudentsDao studentsDao;

    public CommonResponse getAll() {
        CommonResponse commonResponse = new CommonResponse();
        try{
            List<Students> students = Studentsdao.findAll();
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setSuccess("Successfully Get All Students");
            commonResponse.setData(students);
            commonResponse.setCode(200);
        }catch(Exception e){
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setError("Error in Get All Students");
            commonResponse.setCode(500);
        }
        return commonResponse;
    }
    public CommonResponse getByName(String name) {
        CommonResponse commonResponse = new CommonResponse();
        try{
            Students stu =Studentsdao.getByName(name);
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setSuccess("Successfully get the students details by Name");
            commonResponse.setData(stu);
            commonResponse.setCode(200);
        }catch(Exception e){
            commonResponse.setStatus(enumeration.ERROR);
            commonResponse.setError("Error getting the students details by Name");
            commonResponse.setCode(500);
        }
        return commonResponse;
    }
    public CommonResponse addStudents(Students students) {
        CommonResponse commonResponse = new CommonResponse();
        try{
            studentsDao.save(students);
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setSuccess("Successfully Add Students");
            commonResponse.setData(students + "Data Added");
            commonResponse.setCode(200);
        }catch(Exception e){
            commonResponse.setStatus(enumeration.ERROR);
            commonResponse.setError("Error in Add Students");
            commonResponse.setCode(500);
        }

        return commonResponse;
    }

    public CommonResponse deleteById(@PathVariable int id){
        CommonResponse commonResponse = new CommonResponse();
        try{
            Studentsdao.deleteById(id);
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setSuccess("Successfully delete the students details by ID");
            commonResponse.setCode(200);
        }catch(Exception e){
            commonResponse.setStatus(enumeration.ERROR);
            commonResponse.setError("Error in delete the students details by ID");
            commonResponse.setCode(500);
        }
        return commonResponse;
    }
    public CommonResponse updateStudents(Students students){
        CommonResponse commonResponse = new CommonResponse();
        try{
            studentsDao.save(students);
            commonResponse.setStatus(enumeration.SUCCESS);
            commonResponse.setSuccess("Successfully Update the students details by ID ");
            commonResponse.setData(students + "Data Updated");
            commonResponse.setCode(200);
        }catch(Exception e){
            commonResponse.setStatus(enumeration.ERROR);
            commonResponse.setError("Error in Update the students details by ID");
            commonResponse.setCode(500);
        }
        return commonResponse;
    }
}
