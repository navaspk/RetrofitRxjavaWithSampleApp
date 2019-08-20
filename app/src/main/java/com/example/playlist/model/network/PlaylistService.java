package com.example.playlist.model.network;

import com.example.playlist.presenter.Response;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * This is interface api class (Retrofit api) take care to call to server and get the response
 *
 * In case of any error, then instead of getting actual response we will get error response
 */

public interface PlaylistService {

    @GET
    Observable<Response> getPlaylist(@Url String url, @Query("client_id") String id, @Query("client_secret") String secret);
}
