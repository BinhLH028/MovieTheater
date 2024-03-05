package application.movietheater.service;

import application.movietheater.common.Const;
import application.movietheater.entities.Movie;
import application.movietheater.repository.MovieRepository;
import application.movietheater.request.RequestAddMovie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    MessageSource messageSource;

    private String msg = "";


    private Movie movie;

    public Page<Movie> getAllMovie(int page) {
        Page<Movie> movies = movieRepository.findAll(PageRequest.of(page, Const.PAGE_SIZE));
        return  movies;
    }

    public ResponseEntity addMovie(RequestAddMovie request) {

        if (validateRequest(request)) {
            movieRepository.save(movie);

            msg = messageSource.getMessage("01",
                    new String[]{request.getName()},
                    Locale.getDefault());

            return new ResponseEntity( msg, HttpStatus.OK);
        }
        return new ResponseEntity(msg, HttpStatus.BAD_REQUEST);
    }

    private boolean validateRequest(RequestAddMovie request) {


        movie.setActor(request.getActor());
        //TODO: validate
        msg = messageSource.getMessage("02",
                new String[]{request.getName()},
                Locale.getDefault());
        return true;
    }


}
