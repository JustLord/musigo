package by.sfsas.data.repository;

import javax.inject.Inject;

import by.sfsas.data.local.Cache;
import by.sfsas.data.network.api.RestApiService;

public class Repository {

    private final RestApiService networkRepository;
    private final Cache cache;

    @Inject
    Repository(RestApiService networkRepository, Cache cache) {
        this.networkRepository = networkRepository;
        this.cache = cache;
    }


}
