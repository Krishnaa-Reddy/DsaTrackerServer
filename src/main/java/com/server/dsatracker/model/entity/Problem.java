package com.server.dsatracker.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Table(name = "problem_details")
public class Problem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
