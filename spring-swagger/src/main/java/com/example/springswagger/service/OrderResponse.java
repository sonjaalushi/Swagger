package com.example.springswagger.service;

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
public class OrderResponse {
    private String userName;
    private String name;
}
