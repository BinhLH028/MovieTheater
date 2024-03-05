package application.movietheater.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movie_schedules")
public class MovieSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "show_date")
    @Temporal(TemporalType.DATE)
    private Date showDate;

    @Column(name = "show_time")
    @Temporal(TemporalType.TIME)
    private Date showTime;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "cinema_room_id")
    private CinemaRoom cinemaRoom;

    @OneToMany(mappedBy = "movieSchedule")
    private List<ScheduleSeat> scheduleSeats;
}
