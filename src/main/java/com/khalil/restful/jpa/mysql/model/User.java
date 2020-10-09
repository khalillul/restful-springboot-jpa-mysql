package com.khalil.restful.jpa.mysql.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@Setter@Getter
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "first name can't be blank")
    private String firstName;

    @NotBlank(message = "last name can't be blank")
    private String lastName;

    @NotBlank(message = "phone number can't be blank")
    @Column(unique=true)
    private  String phoneNumber;

    @Basic
    private java.time.LocalDate birthDate;

    private String gender;

    @NotBlank(message = "email can't be blank")
    @Email(message = "invalid format email")
    @Column(unique = true)
    private String email;

    @Column(nullable = false, updatable = false)
    @Temporal (TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

}
