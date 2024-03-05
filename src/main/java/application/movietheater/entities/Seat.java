package application.movietheater.entities;

import fa.training.model.enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seats")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "row")
    private String row;

    @Column(name = "`column`")
    private Integer column;

    @Column(name = "seat_type")
    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn(name = "cinema_room_id")
    private fa.training.model.CinemaRoom cinemaRoom;

    @OneToMany(mappedBy = "seat")
    private List<fa.training.model.ScheduleSeat> scheduleSeats;
}
