package com.example.springswagger.service;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Diets;

import com.example.springswagger.repository.DietsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class DietsService {
    private final DietsRepository dietsRepository;

    public DietsService(DietsRepository dietsRepository) {
        this.dietsRepository = dietsRepository;
    }

    @Transactional
    public String saveDiets(Diets diets) {
        dietsRepository.save(diets);
        return "Diet saved with id" + diets.getDiet_id();

    }

    @Transactional(readOnly = true)
    public Optional<Diets> getDiet(Long dietId) {
        return dietsRepository.findById(dietId);
    }

    @Transactional
    public List<Diets> deleteDiet(Long dietId) {
        dietsRepository.deleteById(dietId);
        return dietsRepository.findAll();
    }


}


