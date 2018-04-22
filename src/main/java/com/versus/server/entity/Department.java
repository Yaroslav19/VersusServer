package com.versus.server.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "dept")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Long deptId;

    @Column(name = "dept_name", nullable = false)
    private String deptName;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();
}
