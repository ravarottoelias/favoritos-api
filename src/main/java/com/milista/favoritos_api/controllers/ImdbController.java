package com.milista.favoritos_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.milista.favoritos_api.dto.listSearch.ListSearchResponseDto;
import com.milista.favoritos_api.services.IImdbService;

@RestController
public class ImdbController {
	private final IImdbService imdbService;

	public ImdbController(IImdbService imdbService) {
		this.imdbService = imdbService;
	}

	@GetMapping("/v1/list-media")
	public ListSearchResponseDto listSearch(@RequestParam("search") String search) {
		return imdbService.listSearch(search);
	}
}