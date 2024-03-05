package application.movietheater.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "`types`")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type_name")
    private String name;

    @OneToMany(mappedBy = "type")
    private List<MovieType> movieTypes;
}
