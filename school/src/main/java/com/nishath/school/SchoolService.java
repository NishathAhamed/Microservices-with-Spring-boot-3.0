package com.nishath.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public void saveSchool(Schools schools){
        schoolRepository.save(schools);
    }

    public List<Schools> findAllSchools(){
        return  schoolRepository.findAll();
    }
}
