package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Transient;
import jakarta.persistence.GeneratedValue;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @GeneratedValue
    @Id
    private int id;
    @Column(name="email", unique = true)
    private String email;
    @Transient
    private int age;
    private LocalDate dob;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
