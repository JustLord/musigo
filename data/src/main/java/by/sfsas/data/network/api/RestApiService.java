package by.sfsas.data.network.api;

import javax.inject.Inject;

import by.sfsas.data.local.Cache;

public class RestApiService {

    private final RestApi restApi;
    private final Cache cache;

    @Inject
    RestApiService(RestApi restRestApi, Cache cache) {
        this.restApi = restRestApi;
        this.cache = cache;
    }
}
