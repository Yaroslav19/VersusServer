package com.versus.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lesson")
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "less_id")
    private Long lessId;

    @Column(name = "less_name", nullable = false)
    private String lessName;

    @Column(name = "hours")
    private Integer hours;

    @ManyToMany(mappedBy = "lessons")
    private Set<User> users = new HashSet<>();
}
