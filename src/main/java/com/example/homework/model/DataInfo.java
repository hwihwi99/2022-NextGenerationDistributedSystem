package com.example.homework.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="datainfo")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String writer;

    private String title;

    private String content;
}
