package com.versus.server.dao.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "usr")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "fio", nullable = false)
    private String fio;

    @Size(min = 5, max = 60)
    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "birthday")
    private Date dayOfBirth;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department = new Department();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private Set<Role> roles = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "user_lesson",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "less_id")}
    )
    private Set<Lesson> lessons = new HashSet<>();
}