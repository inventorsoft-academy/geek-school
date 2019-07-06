package com.geekschool.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.geekschool.entity.Course;
import com.geekschool.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupDto {
    private long id;

    private String name;

    private String description;

    private Course subject;

    @JsonIgnore
    private Set<User> students;
}
