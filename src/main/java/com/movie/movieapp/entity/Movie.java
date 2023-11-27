package com.movie.movieapp.entity;

import com.movie.movieapp.model.MovieLookUp;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    Integer movieId;
    String movieTitle;
    String Genre;
    String rating;
    String YOR;
    String runtime;
    String dateOfRelease;

    public static MovieLookUp prepareMovieLookUp(Movie movie) {
        MovieLookUp movieLookUp  = new MovieLookUp();
        movieLookUp.setMovieId(movie.getMovieId());
        movieLookUp.setMovieTitle(movie.getMovieTitle());
        movieLookUp.setGenre(movie.getGenre());
        movieLookUp.setRating(movie.getRating());
        movieLookUp.setYOR(movie.getYOR());
        movieLookUp.setRuntime(movie.getRuntime());
        movieLookUp.setDateOfRelease(movie.getDateOfRelease());
        return movieLookUp;
    }
}
