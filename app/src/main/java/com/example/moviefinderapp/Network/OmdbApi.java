package com.example.moviefinderapp.Network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface OmdbApi {
    @GET(".")
    Call<MoviesResponseDto> getMovies(@Query("s") String search, @Query("apikey") String apiKey);
}
