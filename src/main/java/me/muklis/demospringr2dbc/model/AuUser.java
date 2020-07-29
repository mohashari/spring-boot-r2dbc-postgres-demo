package me.muklis.demospringr2dbc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Data
public class AuUser {
    @Id
    private Integer id;
    private String name;
}
