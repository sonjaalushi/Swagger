package com.example.springswagger.controller;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Instructor;
import com.example.springswagger.service.InstructorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @Autowired
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }


    @PostMapping("/save")
    @ApiOperation(value = "store instructor API")
    public String saveInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @GetMapping("/searchInstructor/{instructorId}")
    @ApiOperation(value = "Search instructor API")
    public Instructor getInstructor(@PathVariable Long instructorId) {
        return instructorService.getInstructor(instructorId).orElseThrow(() -> new IllegalArgumentException("Invalid instructor Id:" + instructorId));

    }

    @DeleteMapping("/deleteInstructor/{instructorId}")
    public List<Instructor> deleteInstructor(@PathVariable Long instructorId) {
        return instructorService.deleteInstructor(instructorId);
    }

//    @GetMapping("/getInfo")
//    public List<InstructorDietsDto> getJoinedInformation() {
//        return instructorService.getInstructorDietsDtoInnerJoin();
//    }

//    @GetMapping("/instructor/diets/inner")
//    public ResponseEntity<List<InstructorDietsDto>> getInstructorDietsDtoInnerJoin() {
//        return new ResponseEntity<List<InstructorDietsDto>>(instructorService.getInstructorDietsDtoInnerJoin(), HttpStatus.OK);
//    }

//    @GetMapping("/instructor/diets/inner")
//    public List<InstructorDietsDto> getInstructorDietsDtoInnerJoin() {
//        return instructorService.getInstructorDietsDtoInnerJoin();
//    }
}