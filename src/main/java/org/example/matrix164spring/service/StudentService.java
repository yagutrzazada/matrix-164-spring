package org.example.matrix164spring.service;

import org.example.matrix164spring.dao.StudentEntity;
import org.example.matrix164spring.dao.StudentRepository;
import lombok.RequiredArgsConstructor;
import mapper.StudentMapper;
import org.example.matrix164spring.model.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void createStudent(StudentDto student){
        StudentEntity studentEntity= StudentMapper.MapToEntity(student);
        studentRepository.add(studentEntity);
    }
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }
    public List<StudentEntity> getAll(){
        return studentRepository.getAll();
    }
    public StudentEntity getById(int id){
        return studentRepository.findByID(id);
    }
}
