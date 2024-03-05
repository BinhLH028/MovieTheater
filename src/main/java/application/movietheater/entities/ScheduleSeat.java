package application.movietheater.entities;

import application.movietheater.enums.SeatStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "schedule_seats")
public class ScheduleSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    @ManyToOne
    @JoinColumn(name = "movie_schedule_id")
    private MovieSchedule movieSchedule;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}
