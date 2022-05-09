package co.com.sofka.crud.entities;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "lista")
    private List<Todo> todos;



}
