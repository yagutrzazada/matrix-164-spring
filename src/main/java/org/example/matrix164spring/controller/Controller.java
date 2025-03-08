package org.example.matrix164spring.controller;

import org.example.matrix164spring.dao.StudentEntity;
import lombok.RequiredArgsConstructor;
import mapper.StudentMapper;
import org.example.matrix164spring.model.StudentDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.example.matrix164spring.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/v1/students")
@RequiredArgsConstructor
public class Controller {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentDto student) {
        studentService.createStudent(student);
    }

    @GetMapping
    public List<StudentEntity> getStudents() {
        return studentService.getAll();
    }
    @GetMapping("/{id}")
    public StudentDto getStudent(@PathVariable int id){
        StudentEntity studentEntity=  studentService.getById(id);
        StudentDto studentDto= StudentMapper.MapToDto(studentEntity);
        return studentDto;

    }
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}

