package application.movietheater.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "actor")
    private String actor;

    @Column(name = "content")
    private String content;

    @Column(name = "director")
    private String director;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "production_company")
    private String productionCompany;

    @Column(name = "to_date")
    private LocalDate toDate;

    @Column(name = "version")
    private String version;

    @Column(name = "en_name")
    private String enName;

    @Column(name = "vn_name")
    private String vnName;

    @Column(name = "large_image")
    private String largeImage;

    @Column(name = "small_image")
    private String smallImage;

    @Column(name = "price")
    private Double price;

    @OneToMany(mappedBy = "movie")
    private List<MovieType> movieTypes;

    @OneToMany(mappedBy = "movie")
    private List<MovieSchedule> movieSchedules;
}
