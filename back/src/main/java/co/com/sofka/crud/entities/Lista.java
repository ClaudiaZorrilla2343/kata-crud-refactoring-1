package co.com.sofka.crud.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity

@Getter
@Setter


@Table(name = "LIST")
public class Lista {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "NAME-TABLE")
    private String nameTable;



}
