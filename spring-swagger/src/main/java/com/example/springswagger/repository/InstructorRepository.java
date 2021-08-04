package com.example.springswagger.repository;

import com.example.springswagger.dto.InstructorDietsDto;
import com.example.springswagger.model.Instructor;
import com.example.springswagger.service.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {
//   @Query("SELECT new com.example.springswagger.service.OrderResponse (d.name,i.product_name) FROM Instructor i JOIN i.diets d")
//    public List<OrderResponse> getJoinedInformation();

//    @Query(value = "SELECT i.name, d.diet_id, d.name,d.type from  Instructor i INNER JOIN  diets d ON i.instructor_id = d.diets_foreign_key",nativeQuery = true)
//    List<InstructorDietsDto> fetchInstructorDietsDtoInnerJoin();


}
