package com.nishath.school;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Schools {

    @Id
    private Integer id;
    private String name;
    private String email;



}
