package com.code88.movies.service;

import com.code88.movies.model.Movie;
import com.code88.movies.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getSingleMovie(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> getSingleMovieByImdb(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
