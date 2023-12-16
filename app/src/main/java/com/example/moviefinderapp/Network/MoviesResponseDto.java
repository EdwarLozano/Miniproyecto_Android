package com.example.moviefinderapp.Network;

import java.util.List;
public class MoviesResponseDto {
    private List<MovieDto> Search;
    private String totalResults;
    private String Response;

    public List<MovieDto> getSearch() {
        return Search;
    }

    public void setSearch(List<MovieDto> search) {
        Search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }
}
