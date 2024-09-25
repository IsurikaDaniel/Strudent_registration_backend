package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "AccountInfo")
public class AccontInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String email;
    String password;
}

