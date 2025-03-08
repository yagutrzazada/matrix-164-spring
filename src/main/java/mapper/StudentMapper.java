package mapper;

import org.example.matrix164spring.dao.StudentEntity;
import org.example.matrix164spring.model.StudentDto;

public class StudentMapper {
    public static StudentDto MapToDto(StudentEntity studentEntity) {
        return new StudentDto(studentEntity.getId(), studentEntity.getName(), studentEntity.getLastName(), studentEntity.getAge());
    }

    public static StudentEntity MapToEntity(StudentDto studentDto) {
        return new StudentEntity(studentDto.getId(), studentDto.getName(), studentDto.getLastName(), studentDto.getAge());
    }
}
