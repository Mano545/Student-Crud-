package com.example.demo.controller;
import com.example.demo.models.CommonResponse;
import com.example.demo.models.Students;
import com.example.demo.service.Serviceint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class controller {
    @Autowired
    Serviceint serviceint;
    @GetMapping("/getStudents")
    public CommonResponse getAllStudents() {
        return serviceint.getAll();
    }
    @GetMapping("id/{name}")
    public CommonResponse findByName(@PathVariable String name) {
        return serviceint.getByName(name);
    }
    @PostMapping("add")
    public CommonResponse SaveStudents(@RequestBody Students students) {
        return serviceint.addStudents(students);
    }
    @DeleteMapping("/delete/{id}")
    public CommonResponse deleteStudentsById(@PathVariable int id){
        return serviceint.deleteById(id);
    }
    @PutMapping("update")
    public CommonResponse updateStudents(@RequestBody Students students){
        return serviceint.updateStudents(students);
    }
}
