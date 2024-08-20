package org.mypro.em_project.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Document
public class Emplyoee {


    @Id
    private ObjectId id;

    private String name;
    private String phone;
    private String email;
    private LocalDateTime date;






}
