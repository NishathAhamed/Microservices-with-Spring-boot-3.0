package com.nishath.school;

import com.nishath.school.client.StudentClient;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    private final StudentClient client;

    public void saveSchool(Schools schools){
        schoolRepository.save(schools);
    }

    public List<Schools> findAllSchools(){
        return  schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school=schoolRepository.findById(schoolId)
                .orElse(Schools.builder()
                        .name("Not_found")
                        .email("Not_found")
                        .build());
        System.out.println("kkk");
        var students=client.findAllStudentBySchool(schoolId);
        System.out.println("kkk");


        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
