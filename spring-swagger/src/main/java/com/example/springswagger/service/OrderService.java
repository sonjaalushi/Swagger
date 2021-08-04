package com.example.springswagger.service;


import com.example.springswagger.model.Instructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Service
public class OrderService {

    private Instructor instructor;
}
