package com.milista.favoritos_api.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.milista.favoritos_api.dto.listSearch.ListSearchResponseDto;

@FeignClient(name = "imdbRestClient", url = "https://www.omdbapi.com")
public interface ImdbRestClient {
	@GetMapping("/")
    ListSearchResponseDto listSearch(
        @RequestParam("s") String search,
        @RequestParam("apikey") String apiKey
    );
}