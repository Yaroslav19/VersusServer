package com.versus.server.entity;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "dept")
public class Department {
    private Long deptId;
    private String deptName;
    private List<User> users;

    public Department() {
    }

    public Department(Long deptId, String deptName, List<User> users) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.users = users;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "dept_id", unique = true, nullable = false)
    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Column(name = "dept_name", nullable = false)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
