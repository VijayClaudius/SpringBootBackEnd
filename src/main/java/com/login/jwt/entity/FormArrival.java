package com.login.jwt.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter

public class FormArrival {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FirstName;
    private String LastName;
    private String Program;
    private String DegreeLevel;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean Need_PickUp;
    @Temporal(TemporalType.DATE)
    private Date Arrival_Date;
//    @Temporal(TemporalType.TIME)
//    private Time Arrival_Time;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean Need_Accommodations;
    private String EmailAddress;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean Visa;
    private int Mobile;
    @Enumerated(EnumType.STRING)
    private Season season;


}
