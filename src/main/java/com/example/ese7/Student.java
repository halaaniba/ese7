package com.example.ese7;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, name ="firstName")
    private String firstName;
    @Column(nullable = false,name= "lastName")
    private String lastName;
    @Column(unique = true,name = "userEmail")
    private String email;
}
