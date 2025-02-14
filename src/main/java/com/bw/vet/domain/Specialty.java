package com.bw.vet.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "specialties")
@Data
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

}
