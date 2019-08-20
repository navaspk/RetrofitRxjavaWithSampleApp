package com.example.playlist;

import android.app.Application;
import android.content.Context;


import com.example.playlist.model.network.NetworkConstants;
import com.example.playlist.model.network.PlaylistService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlayListApplication extends Application {

    PlaylistService mPlaylistService;

    @Override
    public void onCreate() {
        super.onCreate();
        getRetrofit();
    }

    public PlaylistService getRetrofit() {
        if (mPlaylistService == null)
            mPlaylistService = ApiServiceFactory.initiatePopularService(this);
        return mPlaylistService;
    }

    static class ApiServiceFactory {

        private static OkHttpClient okHttpClient;
        private static  int REQUEST_TIMEOUT = 60;

        static PlaylistService initiatePopularService(Context context) {

            if (okHttpClient == null)
                initOkHttp(context);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(NetworkConstants.BASE_URL)
                    .client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            return retrofit.create(PlaylistService.class);
        }

        private static void initOkHttp(final Context context) {
            OkHttpClient.Builder httpClient = new OkHttpClient().newBuilder()
                    .connectTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                    .readTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS)
                    .writeTimeout(REQUEST_TIMEOUT, TimeUnit.SECONDS);

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            httpClient.addInterceptor(interceptor);

            httpClient.addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request original = chain.request();
                    Request.Builder requestBuilder = original.newBuilder();

                    Request request = requestBuilder.build();
                    return chain.proceed(request);
                }
            });

            okHttpClient = httpClient.build();
        }

    }
}
