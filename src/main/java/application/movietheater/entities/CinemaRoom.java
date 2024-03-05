package application.movietheater.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cinema_rooms")
public class CinemaRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "room_name")
    private String roomName;

    @OneToMany(mappedBy = "cinemaRoom")
    private List<MovieSchedule> movieSchedules;

    @OneToMany(mappedBy = "cinemaRoom")
    private List<Seat> seats;
}
