package com.example.example.entities.base;

import lombok.*;

import javax.persistence.*;


@MappedSuperclass
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
