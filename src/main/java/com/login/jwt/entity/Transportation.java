package com.login.jwt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transportation {
    @Id
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date dateOfFly;
    @Temporal(TemporalType.DATE)
    private Date pickupDate;
    @Temporal(TemporalType.TIME)
    private Date pickupTime;


}
