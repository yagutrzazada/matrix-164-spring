package org.example.matrix164spring.dao;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    public static final List<StudentEntity> list = new ArrayList<>();

    static {
        list.add(new StudentEntity(1, "Aysu", "Eliyeva", 12));
        list.add(new StudentEntity(2, "Vesile", "Quliyeva", 18));
        list.add(new StudentEntity(3, "Vuqar", "Sultanlı", 20));
    }

    public List<StudentEntity> getAll() {
        return list;
    }

    public StudentEntity findByID(int Id) {
        return list.stream()
                .filter(person -> person.getId() == Id)
                .findFirst().orElse(null);
    }

    public void deleteById(int id) {
        list.removeIf(student -> student.getId() == id);
    }
    public void add(StudentEntity student){
        list.add(student);
    }
}

