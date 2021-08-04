package com.example.springswagger.repository;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Diets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DietsRepository extends JpaRepository<Diets, Long> {


}
