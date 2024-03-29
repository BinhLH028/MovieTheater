package application.movietheater.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "movie_types")
public class MovieType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
