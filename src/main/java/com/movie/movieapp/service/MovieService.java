package com.movie.movieapp.service;

import com.movie.movieapp.entity.Movie;
import com.movie.movieapp.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Iterable<Movie> getAllMovie() {
        Iterable<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public String addMovie(Movie movie) {
        Movie addedMovie = movieRepository.save(movie);
        return "Movie added successfully with Id"+addedMovie.getMovieId();
    }
}
