package com.example.springswagger.service;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Instructor;
import com.example.springswagger.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {
@Autowired
    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @Transactional
    public String saveInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
        return "Instructor saved with id" + instructor.getInstructorId();

    }

    @Transactional(readOnly = true)
    public Optional<Instructor> getInstructor(Long instructorId) {
        return instructorRepository.findById(instructorId);
    }

    @Transactional
    public List<Instructor> deleteInstructor(Long instructorId) {
        instructorRepository.deleteById(instructorId);
        return instructorRepository.findAll();
    }

//    public List<InstructorDietsDto> getInstructorDietsDtoInnerJoin() {
//        List<InstructorDietsDto> list = instructorRepository.fetchInstructorDietsDtoInnerJoin();
//        list.forEach(l -> System.out.println(l));
//        return list;
//    }
}
