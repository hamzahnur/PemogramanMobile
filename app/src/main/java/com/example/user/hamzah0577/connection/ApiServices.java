package com.example.user.hamzah0577.connection;


import com.example.user.hamzah0577.model.ModelListMovie;

import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiServices {





    @GET("movie/now_playing?api_key=411af08a79bfee338f95e1b1b669794a&language=en-US&page=1")
    Call <ModelListMovie> getNowPlaying();

}
