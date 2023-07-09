package com.nishath.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Schools schools){
        schoolService.saveSchool(schools);
    }

    @GetMapping
    public ResponseEntity<List<Schools>> findAllStudents(){
        return ResponseEntity.ok(schoolService.findAllSchools());
    }
}
