package com.milista.favoritos_api.services.impl;

import org.springframework.stereotype.Service;

import com.milista.favoritos_api.dto.listSearch.ListSearchResponseDto;
import com.milista.favoritos_api.restClients.ImdbRestClient;
import com.milista.favoritos_api.services.IImdbService;

@Service
public class ImdbService implements IImdbService {
	private final ImdbRestClient imdbRestClient;

	public ImdbService(ImdbRestClient imdbRestClient) {
		this.imdbRestClient = imdbRestClient;
	}

	@Override
	public ListSearchResponseDto listSearch(String search) {

			ListSearchResponseDto response = imdbRestClient.listSearch(search, "d4560f32");
			return response;

	}
}