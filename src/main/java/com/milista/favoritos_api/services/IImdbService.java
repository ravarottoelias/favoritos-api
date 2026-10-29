package com.milista.favoritos_api.services;

import com.milista.favoritos_api.dto.listSearch.ListSearchResponseDto;

public interface IImdbService {
	ListSearchResponseDto listSearch(String search);
}