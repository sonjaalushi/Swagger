package com.example.springswagger.controller;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Diets;
import com.example.springswagger.service.DietsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diet")
public class DietsController {

    private final DietsService dietsService;

    public DietsController(DietsService dietsService) {
        this.dietsService = dietsService;
    }


    @PostMapping("/save")
    @ApiOperation(value = "store diet API")
    public String saveDiet(@RequestBody Diets diets) {
        return dietsService.saveDiets(diets);
    }

    @GetMapping("/searchDiets/{dietId}")
    @ApiOperation(value = "Search diet API")
    public Diets getDiets(@PathVariable Long dietId) {
        return dietsService.getDiet(dietId).orElseThrow(() -> new IllegalArgumentException("Invalid diet Id:" + dietId));
    }

    @DeleteMapping("/deleteDiets/{dietId}")
    public List<Diets> deleteDiet(@PathVariable Long dietId) {
        return dietsService.deleteDiet(dietId);
    }


}
