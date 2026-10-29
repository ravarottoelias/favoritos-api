package com.milista.favoritos_api.dto.listSearch;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListSearchResponseDto {
    @JsonProperty("Search")
    private List<ListSearchItemDto> search;

    @JsonProperty("totalResults")
    private String totalResults;

    @JsonProperty("Response")
    private String response;

    @JsonProperty("Error")
    private String error;

    public List<ListSearchItemDto> getSearch() {
        return search;
    }

    public void setSearch(List<ListSearchItemDto> search) {
        this.search = search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}