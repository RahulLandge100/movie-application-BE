package com.movie.movieapp.controller;

import com.movie.movieapp.entity.Movie;
import com.movie.movieapp.model.MovieLookUp;
import com.movie.movieapp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/add-movies")
    public String addMovie(@RequestBody Movie movie) {
        String response = movieService.addMovie(movie);
        return response;
    }

    @GetMapping("/get-All-Movies")
    public List<MovieLookUp> getAllMovie() {
        Iterable<Movie> movies = movieService.getAllMovie();
        List<MovieLookUp> movieLookUpsList = new ArrayList<>();
        for (Movie movie : movies) {
            MovieLookUp movieLookUps = Movie.prepareMovieLookUp(movie);
            movieLookUpsList.add(movieLookUps);
        }
        return movieLookUpsList;
    }
}
