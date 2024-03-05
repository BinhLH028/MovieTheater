package application.movietheater.controller;

import application.movietheater.request.RequestAddMovie;
import application.movietheater.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "")
    public ResponseEntity<?> getAttendanceData(@RequestParam int page) {
        try {
            return new ResponseEntity(movieService.getAllMovie(page), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = "/add")
    public ResponseEntity<?> getAttendanceData(@RequestParam RequestAddMovie request) {
        try {
            return new ResponseEntity(movieService.addMovie(request), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
